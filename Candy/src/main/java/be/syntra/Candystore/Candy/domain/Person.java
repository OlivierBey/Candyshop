package be.syntra.Candystore.Candy.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	private String firstName;
	private String lastName;
	
	public Person() {}
	
	public Person(String firstname, String lastname) {
		this.firstName= firstname;
		this.lastName= lastname;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getId() {
		
		return id;
	}
	
}
