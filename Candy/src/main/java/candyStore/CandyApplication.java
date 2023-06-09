package candyStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import candyStore.domain.Person;
import candyStore.services.PersonService;

@SpringBootApplication
public class CandyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
		SpringApplication.run(CandyApplication.class, args);
		
	PersonService service = ctx.getBean(PersonService.class);	
//	Person person1 = service.createPerson("Ben", "Crabbe");
//	Person person2 = service.createPerson("Pol", "Tack");
//	
	Person person = service.findPersonByid(5000);
//	person.calculateAge();
//	System.out.println(person.getFirstName());
//	
//	Person person3 = service.createPerson("Nu", "Tella");
	//service.deletePersonById();
	
	}
	
}
