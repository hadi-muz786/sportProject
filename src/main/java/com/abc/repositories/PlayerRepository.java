package com.abc.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.abc.entities.PlayerEntity;

@Repository
@Transactional
public class PlayerRepository {

	private EntityManager em;

	public PlayerEntity save(PlayerEntity player) {
		return em.merge(player);
	}

	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}

}
