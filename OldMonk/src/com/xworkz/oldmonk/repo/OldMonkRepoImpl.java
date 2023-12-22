package com.xworkz.oldmonk.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.oldmonk.dto.OldMonkDto;

@Component
public class OldMonkRepoImpl implements OldMonkRepo {
	@Autowired
	private EntityManagerFactory emf;

	@Override
	public boolean save(OldMonkDto dto) {
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
