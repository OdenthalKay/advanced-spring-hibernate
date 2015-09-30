package com.advanced.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.advanced.dao.IAddressDAO;
import com.advanced.domain.Address;

@Service
public class AddressService implements IAddressService {
	private IAddressDAO addressDao;

	public IAddressDAO getAddressDao() {
		return addressDao;
	}

	public void setAddressDao(IAddressDAO addressDao) {
		this.addressDao = addressDao;
	}

	@Transactional
	public void save(Address address) {
		addressDao.save(address);

	}

}
