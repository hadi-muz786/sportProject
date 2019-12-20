package com.abc.repositories;
 
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.abc.entities.TeamEntity;

@Repository
@Transactional
public class TeamRepository {

	private EntityManager em;

	public TeamEntity save(TeamEntity team) {
		return em.merge(team);
	}

	public List<TeamEntity> getAll() {
		Query q = em.createQuery("from TeamEntity");
		return q.getResultList();
	}

	public TeamEntity getTeamByName(String teamName) {
		Query q = em.createQuery("select t from TeamEntity where t.name =:name");
		q.setParameter("name", teamName);
		return (TeamEntity) q.getSingleResult();
	}

	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}

}
