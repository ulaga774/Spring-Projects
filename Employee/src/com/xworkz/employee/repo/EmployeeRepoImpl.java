package com.xworkz.employee.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.springframework.stereotype.Component;
import com.xworkz.employee.dto.EmployeeDto;

@Component
public class EmployeeRepoImpl implements EmployeeRepo {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(EmployeeDto dto) {
		if (em != null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			em.close();
			return true;

		}

		return false;
	}

	@Override
	public EmployeeDto findByName(String name) {
		Query query = em.createNamedQuery("find");
		Query value = query.setParameter("nm", name);
		EmployeeDto dto = (EmployeeDto) value.getSingleResult();
		return dto;
	}

	@Override
	public EmployeeDto findByNameAndLocation(String companyName, String Location) {
		Query query = em.createNamedQuery("findByNameandLocation");
		Query value = query.setParameter("cn", companyName).setParameter("l", Location);
		EmployeeDto dto = (EmployeeDto) value.getSingleResult();
		return dto;
	}

	@Override
	public boolean updateNameByid(int id, String name) {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("updateType");
		Query value = query.setParameter("i", id).setParameter("n", name);
		value.executeUpdate();
		System.out.println(value);
		em.getTransaction().commit();

		return true;

	}

	@Override
	public boolean updateSysmbolByLocationAndZipcode(String locatio, int zipcode, char symbol) {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("update");
		Query value = query.setParameter("lo", locatio).setParameter("z", zipcode).setParameter("s", symbol);
		value.executeUpdate();
		System.out.println(value);
		em.getTransaction().commit();
		return true;

	}

	@Override
	public boolean deleteByRating(float rating) {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("delete");
		Query value = query.setParameter("r", rating);
		value.executeUpdate();
		System.out.println(value);
		em.getTransaction().commit();

		return true;
	}

	@Override
	public boolean deleteByLocationAndName(String location, String name) {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("deleteLocationAndName");
		Query value = query.setParameter("l", location).setParameter("n", name);
		value.executeUpdate();
		System.out.println(value);
		em.getTransaction().commit();

		return true;
	}

	@Override
	public List<EmployeeDto> readAll() {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("readAll");
		List<EmployeeDto> read = query.getResultList();
		em.getTransaction().commit();
		return read;
	}

}
