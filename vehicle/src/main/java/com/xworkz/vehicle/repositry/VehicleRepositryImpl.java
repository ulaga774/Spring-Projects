package com.xworkz.vehicle.repositry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.vehicle.dto.VehicleDto;

public class VehicleRepositryImpl implements VehicleRepositry {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Vehicle");
	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(VehicleDto dto) {

		em.getTransaction().begin();
		em.persist(dto);
		em.getTransaction().commit();

		return true;
	}

	@Override
	public VehicleDto findByName(String name) {
		Query query = em.createNamedQuery("FindName");
		Query value = query.setParameter("nm", name);
		VehicleDto dto = (VehicleDto) value.getSingleResult();
		return dto;

	}

	@Override
	public VehicleDto findByConsumesAndType(String consumes, String type) {
		Query query = em.createNamedQuery("findByConsumesAndType");
		Query value = query.setParameter("c", consumes).setParameter("t", type);
		VehicleDto dto = (VehicleDto) value.getSingleResult();
		return dto;
	}

	@Override
	public boolean updateTypeByName(String type, String name) {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("updateType");
		Query value = query.setParameter("tt", type).setParameter("n", name);
		value.executeUpdate();
		em.getTransaction().commit();
		return true;

	}

	@Override
	public boolean updateLauncheInAndTypeById(float lunchedIn, String type, int id) {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("updated");
		Query value = query.setParameter("lun", lunchedIn).setParameter("type", type).setParameter("id", id);
		value.executeUpdate();

		em.getTransaction().commit();
		return true;

	}

	
	public boolean deleteByLuchedIn(float lunchedIn ) {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("delete");
		Query value = query.setParameter("lu", lunchedIn);
		value.executeUpdate();
		em.getTransaction().commit();
	
		return true;

	}

	

}
