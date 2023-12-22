package com.xworkz.spotify.repositry;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.xworkz.spotify.dto.SpotifyDto;

@Component

public class SpotifyRepoImpl implements SpotifyRepo {

	@Autowired
	private EntityManagerFactory emf;

	@Override
	public boolean save(SpotifyDto dto, Model model) {
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

	@Override
	public List<SpotifyDto> read() {
		EntityManager em = emf.createEntityManager();
		if (em != null) {
			TypedQuery<SpotifyDto> query = em.createNamedQuery("read", SpotifyDto.class);
			List<SpotifyDto> list = query.getResultList();
			System.out.println("repo is done--");
			return list;

		}
		return null;
	}

	@Override
	public SpotifyDto findBySongName(String SongName, Model model) {
		EntityManager em = emf.createEntityManager();
		if (em != null) {
			TypedQuery<SpotifyDto> query = em.createNamedQuery("find", SpotifyDto.class);
			TypedQuery value = (TypedQuery) query.getSingleResult();
			return (SpotifyDto) value;
		}
		return null;
	}

}
