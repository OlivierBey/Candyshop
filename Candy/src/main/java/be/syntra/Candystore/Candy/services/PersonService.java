package be.syntra.Candystore.Candy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import be.syntra.Candystore.Candy.domain.Person;
import jakarta.persistence.EntityManager;


@Service
@Transactional
public class PersonService {
	
	@Autowired
	private EntityManager em;

	public Person createPerson(String firstname, String lastname) {
		Person person = new Person(firstname, lastname);
		em.persist(person);
		return person;
	}
	public Person findPersonByid(long id) {
		return em.find(Person.class, id);
	}
	
	public void deletePersonById(long id) {
		Person person = findPersonByid(id);
		em.remove(person);
	}

}
