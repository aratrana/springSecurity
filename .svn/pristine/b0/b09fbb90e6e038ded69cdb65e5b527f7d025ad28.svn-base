package com.arat.budget.dao;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

public class StatefullSessionHibernateDao<T> extends BaseHiberNateDao<T> {
	protected Session getSession() {
		Session session = null;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException ex) {
			session = sessionFactory.openSession();
		}
		return session;
	}
	
	public Query createQuery(String query){
		Session session = getSession();
		return session.createQuery(query);
	}
	
	public Criteria getCriteria(Class<T> t){
		Session session = getSession();
		return session.createCriteria(t);
	}
	
	public Criteria getCriteria(Class<T> t, String alias) {
		Session session = getSession();
		return session.createCriteria(t, alias);
	}
}
