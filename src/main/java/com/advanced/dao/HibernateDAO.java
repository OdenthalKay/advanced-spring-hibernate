package com.advanced.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateDAO {
	protected SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

}
