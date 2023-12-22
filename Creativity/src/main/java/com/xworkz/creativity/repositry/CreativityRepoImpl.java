package com.xworkz.creativity.repositry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.xworkz.creativity.dto.CreativityDto;

@Component
public class CreativityRepoImpl implements CreativityRepo {

	@Autowired
	private EntityManagerFactory emf;

	@Override
	public boolean save(CreativityDto dto, Model model) {

		EntityManager em = emf.createEntityManager();
		if (em != null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			em.close();
			return true;
		}
		return false;

	}

}
