package com.xworkz.landrecord.repositry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.xworkz.landrecord.dto.LandRecordDetailsDto;

@Component
@Repository
public class AddRecordRepoImpl implements AddRecordRepo{
	
	@Autowired
	private EntityManagerFactory emf;

	@Override
	public boolean saveRecords(LandRecordDetailsDto dto, Model model) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(dto);
		em.getTransaction().commit();
		return true;

	}

}
