package com.xworkz.landrecord.repositry;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.xworkz.landrecord.dto.LandRecordDetailsDto;

@Component
@Repository
public class ViewRecordRepoImpl implements ViewRecordRepo {

	@Autowired
	private EntityManagerFactory emf;

	@Override
	public List<LandRecordDetailsDto> readBYVillage(String taluk, String hobli, String village , int status) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("readbyvillage").setParameter("tl", taluk).setParameter("hb", hobli)
				.setParameter("vl", village).setParameter("st", status);
		List<LandRecordDetailsDto> save = query.getResultList();

		return save;

	}
}
