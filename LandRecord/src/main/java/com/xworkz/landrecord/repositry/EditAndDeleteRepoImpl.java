package com.xworkz.landrecord.repositry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.xworkz.landrecord.dto.LandRecordDetailsDto;

@Component
@Repository
public class EditAndDeleteRepoImpl implements EditAndDeleteRepo {

	@Autowired
	private EntityManagerFactory emf;

	@Override
	public boolean EditByAadharNo(String ownerName, String mobileNumber, String aadharNumber, String houseNumber,
			String surveyNumber, String year, int status) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createNamedQuery("Edit").setParameter("on", ownerName).setParameter("pn", mobileNumber)
				.setParameter("an", aadharNumber).setParameter("hn", houseNumber).setParameter("sn", surveyNumber)
				.setParameter("y", year).setParameter("st", status);
		;
		query.executeUpdate();
		em.getTransaction().commit();
		return true;
	}

	@Override
	public boolean deleteRecords(String houseNumber, String surveyNumber, int status) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createNamedQuery("delete").setParameter("hn", houseNumber).setParameter("sn", surveyNumber);
		query.executeUpdate();
		em.getTransaction().commit();
		return true;

	}

	@Override
	public LandRecordDetailsDto ifExists(int houseNumber, int surveyNumber, int status) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("ifExist").setParameter("hn", houseNumber).setParameter("sn", surveyNumber)
				.setParameter("st", status);
		;
		LandRecordDetailsDto dto = (LandRecordDetailsDto) query.getSingleResult();
		return dto;
	}

}
