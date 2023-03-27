package candyStore.domain;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PostLoad;
import jakarta.persistence.Transient;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	@Column(nullable = false, length = 200)
	private String firstName;
	@Column(nullable = false, length = 200) 
	private String lastName;
	@Embedded
	private Address address;
	@Transient
	private long age;
	@Nonnull
	private Date birthDate;
	
	public Person() {}
	
	public Person(String firstname, String lastname) {
		this.firstName= firstname;
		this.lastName= lastname;
	}
	@PostLoad
	public void calculateAge() {
		LocalDate currentDate= LocalDate.now();
		LocalDate BD= getBirthDate().toLocalDate();
		Period period=	Period.between(BD, currentDate);
		setAge(period.getYears());
		System.out.println(getFirstName()+" is "+ getAge());
	}

	
	
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
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
