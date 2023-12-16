package ma.emsi.backendevents;

import ma.emsi.backendevents.entitie.Events;
import ma.emsi.backendevents.entitie.User;
import ma.emsi.backendevents.enums.EventCategory;
import ma.emsi.backendevents.enums.UserRole;
import ma.emsi.backendevents.repository.EventsRepository;
import ma.emsi.backendevents.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Date;
import java.util.List;

@SpringBootApplication
public class BackendEventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendEventsApplication.class, args);
	}


	//@Bean
	CommandLineRunner commandLineRunner(EventsRepository eventsRepository){
		return args -> {
			eventsRepository.saveAll(
					List.of(
							Events.builder().eventName("WAC vs RCA").eventCategory(EventCategory.SPORT).eventCity("Casablanca").eventPlace("Complexe Sportif Mohammed V").eventDate(Date.valueOf("2023-12-11")).eventPrice(300).imgUrl("/images/sprt.jpg").build(),
							Events.builder().eventName("Alaadin").eventCategory(EventCategory.THEATER).eventCity("Tanger").eventPlace("Complexe Hassan 2").eventDate(Date.valueOf("2023-11-11")).eventPrice(300).imgUrl("/images/aldn.jpg").build(),
							Events.builder().eventName("John Wick").eventCategory(EventCategory.CINEMA).eventCity("Casablanca").eventPlace("IMAX Morocco Mall").eventDate(Date.valueOf("2023-10-21")).eventPrice(300).imgUrl("/images/jnwk.jpg").build()
					)
			);
			eventsRepository.findAll().forEach(e->{
				System.out.println(e.getEventName());
			});
		};
	}

	//@Bean
	CommandLineRunner cm(UserRepository userRepository){
		return args -> {
			userRepository.saveAll(
					List.of(
							User.builder().fullName("Imad Ettamen").email("imad@adm.com").password("1234").role(UserRole.ADMIN).build(),
							User.builder().fullName("Mohamed Sadrafe").email("med@adm.com").password("1111").role(UserRole.USER).build()
					)
			);
			userRepository.findAll().forEach(u->{
				System.out.println(u.getFullName());
			});
		};
	}

}
