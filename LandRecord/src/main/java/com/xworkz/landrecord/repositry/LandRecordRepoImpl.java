package com.xworkz.landrecord.repositry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import com.xworkz.landrecord.dto.LandRecordAdminDto;

@Component
@Repository
public class LandRecordRepoImpl implements LandRecordRepo {
	@Autowired
	private EntityManagerFactory emf;

	@Override
	public boolean save(LandRecordAdminDto dto) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(dto);
		em.getTransaction().commit();
		return true;
	}

	@Override
	public LandRecordAdminDto findByMail(String email, Model model) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		try {
			Query query = em.createNamedQuery("findByMail").setParameter("em", email);

			LandRecordAdminDto dto = (LandRecordAdminDto) query.getSingleResult();
			model.addAttribute("AdminName", dto.getAdminName());
			System.out.println(dto);
			System.out.println("findByMail repo try line 41 ");
			return dto;
		} catch (NoResultException e) {
			System.out.println("findByMail repo catch line 44");
			model.addAttribute("EmailInvalid", "Email Not Found - Enter Correct Email");
			return null;
		} finally {
			System.out.println("findByMail repo finally line 48");
			em.getTransaction().commit();
			em.close();
		}
	}

	@Override
	public boolean updateOtp(String otp, String mail, Model model) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createNamedQuery("updateByOtp").setParameter("o", otp).setParameter("e", mail);
		query.executeUpdate();
		return true;
	}

	@Override
	public LandRecordAdminDto findByOtp(String otp) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("findByOtp").setParameter("otp", otp);
		LandRecordAdminDto dto = (LandRecordAdminDto) query.getSingleResult();
		return dto;
	}


}