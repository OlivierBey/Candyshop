package be.syntra.Candystore.Candy.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import be.syntra.Candystore.Candy.services.PersonService;

@SpringBootTest
class PersonTest {

	@Autowired
	private PersonService personService;
	
	@Test
	void findPerson() {
		Person person = personService.findPersonByid(3000);
		assertNotNull(person);
		assertEquals("Tyler", person.getFirstName());
	}

}
