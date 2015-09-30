package com.advanced;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.advanced.domain.Address;
import com.advanced.domain.Person;
import com.advanced.service.IAddressService;
import com.advanced.service.IPersonService;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		//SessionFactory s = (SessionFactory) context.getBean("sessionFactory");
		//IPersonDAO personDAO = (PersonDAO) context.getBean("personDao");
		IPersonService personService = (IPersonService) context.getBean("personService");
		Person p = new Person("Hans Petedsffr1114545");
		Person p1 = new Person("Hans lalala");
		//System.out.println(s);
		//System.out.println(personDAO);
//		personDAO.save(p);
//		personDAO.save(p1);
//		personService.save(p);
//		personService.save(p1);
		IAddressService addressService = (IAddressService) context.getBean("addressService");
		Address address = new Address("51065", "Holweider Weg");
		Address address1 = new Address("5106dfdf5", "Holwfdfdfeider Weg");
		p.getAddresses().add(address);
		p.getAddresses().add(address1);
		personService.save(p);
		Person loadedPerson = personService.getPersonById(1);
		System.out.println(loadedPerson);
		
		
		
	}
}
