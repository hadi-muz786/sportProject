package com.abc.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.abc.entities.MatchesEntity;

@Repository
@Transactional
public class MatchesRepository {

	private EntityManager em;

	public MatchesEntity save(MatchesEntity matches) {
		return em.merge(matches);

	}

	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}

}
