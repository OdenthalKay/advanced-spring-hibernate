package com.advanced.dao;

import com.advanced.domain.Person;

public interface IPersonDAO {
	public void save(Person person);
	public void delete(Person person);
	public Person getPersonById(int id);
}
