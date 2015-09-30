package com.advanced.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.engine.internal.Cascade;
import org.hibernate.engine.spi.CascadeStyle;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Entity
public class Person {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String fullname;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Address> addresses;

	public Person() {
	}

	public Person(String fullname) {
		this.fullname = fullname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", fullname=" + fullname + ", addresses=" + addresses + "]";
	}

}
