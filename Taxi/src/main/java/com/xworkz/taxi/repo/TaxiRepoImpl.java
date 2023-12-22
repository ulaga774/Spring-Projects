package com.xworkz.taxi.repo;

import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.xworkz.taxi.dto.TaxiDto;

@Component
public class TaxiRepoImpl implements TaxiRepo {
	
//	TaxiDto dto =new TaxiDto();

	
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("texi");

	@Override
	public boolean save(TaxiDto dto) {
		EntityManager em = emf.createEntityManager();
		if (em != null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			em.close();
			return true;
		}
		System.out.println("em is null");
		return false;
	}

	@Override
	public boolean updateEarningByLocation(int earnings, String location) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createNamedQuery("update");
		Query q = query.setParameter("e", earnings).setParameter("l", location);
		q.executeUpdate();
		System.out.println(q);
		em.getTransaction().commit();

		return true;
	}

	@Override
	public boolean updateAvailableById(boolean available, int id) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createNamedQuery("updateById");
		Query q = query.setParameter("a", available).setParameter("i", id);
		q.executeUpdate();
		em.getTransaction().commit();

		return true;

	}

	@Override
	public TaxiDto findByLocation(String location) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<TaxiDto> query = em.createNamedQuery("find", TaxiDto.class);
		TypedQuery<TaxiDto> tq = query.setParameter("lo", location);
		TaxiDto dto = tq.getSingleResult();

		return dto;
	}

	@Override
	public List<TaxiDto> readAll() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("readAll");
		List<TaxiDto> read = query.getResultList();
		return read;

	}

	@Override
	public List<TaxiDto> findAllTaxiIsAvailable() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("readAll");
		List<TaxiDto> read = query.getResultList();
		
		return read;
	
		
//		if (dto.isAvailable()== true) {
//			System.out.println("this is available");
//			return read;
//
//		} else {
//			if (dto.isAvailable() == false) {
//				System.out.println("--------------------this is not available taxies");
//				return read;
//			}
//			return null;

		}

	@Override
	public  List<TaxiDto> findLowestEaring() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("lowest");
		List<TaxiDto> read = query.getResultList();
		return read;
	}
	}


