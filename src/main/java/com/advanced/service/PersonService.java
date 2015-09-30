package com.advanced.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.advanced.dao.IPersonDAO;
import com.advanced.domain.Person;

@Service
public class PersonService implements IPersonService {
	private IPersonDAO personDao;

	public IPersonDAO getPersonDao() {
		return personDao;
	}

	public void setPersonDao(IPersonDAO personDao) {
		this.personDao = personDao;
	}

	@Transactional
	public void save(Person person) {
		personDao.save(person);
	}

	@Override
	public String toString() {
		return "PersonService [personDao=" + personDao + "]";
	}

}
