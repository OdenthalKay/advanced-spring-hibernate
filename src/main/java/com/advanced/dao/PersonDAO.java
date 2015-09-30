package com.advanced.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.advanced.domain.Person;

@Repository
public class PersonDAO extends HibernateDAO implements IPersonDAO {
	
	public void save(Person person) {
		currentSession().save(person);
	}

	
	public void delete(Person person) {
		// TODO Auto-generated method stub
	}

	
	public Person getPersonById(int id) {
		return sessionFactory.getCurrentSession().get(Person.class, id);
	}

	@Override
	public String toString() {
		return "PersonDAO []";
	}

	

}
