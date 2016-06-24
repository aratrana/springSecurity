package com.arat.budget.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.arat.budget.model.Users;




//@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public Users findByUserName(String username) {
		List<Users> users = new ArrayList<Users>();
		users = getSession()
				.createQuery("from Users where username=?")
				.setParameter(0, username).list();

		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}
	}

	private Session getSession() {
		Session session = null;
		try{
			session = getSessionFactory().getCurrentSession();
		}catch(HibernateException ex){
			session = sessionFactory.openSession();
		}
		return session;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
