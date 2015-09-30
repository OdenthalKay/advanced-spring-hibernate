package com.advanced.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.advanced.domain.Person;

@Repository
public class PersonDAO extends HibernateDAO implements IPersonDAO {
	@Transactional
	public void save(Person person) {
		currentSession().save(person);
	}

	@Transactional
	public void delete(Person person) {
		// TODO Auto-generated method stub
	}

	@Transactional
	public Person getPersonById(int id) {
		return sessionFactory.getCurrentSession().get(Person.class, id);
	}

	@Override
	public String toString() {
		return "PersonDAO [sessionFactory=" + sessionFactory + "]";
	}

}
