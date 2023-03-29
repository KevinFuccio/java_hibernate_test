package model;

import javax.persistence.EntityManager;

import utils.JpaUtil;

public class EventoDAO {
	static  EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
	
	static public void save(Event e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
	}
	static public Event getById(int id) {
		em.getTransaction().begin();
		Event e = em.find(Event.class, id);
		em.getTransaction().commit();
		return e;
	}
	static public void remove(Event e) {
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
	}
	static public void refresh(Event e) {
		em.getTransaction().begin();
		em.refresh(e);
		em.getTransaction().commit();
	}
	
}
