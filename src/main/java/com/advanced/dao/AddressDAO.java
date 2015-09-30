package com.advanced.dao;

import org.springframework.stereotype.Repository;

import com.advanced.domain.Address;

@Repository
public class AddressDAO extends HibernateDAO implements IAddressDAO {

	public void save(Address address) {
		currentSession().save(address);
	}
}
