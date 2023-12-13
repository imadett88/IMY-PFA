package ma.emsi.backendevents;

import ma.emsi.backendevents.entitie.Events;
import ma.emsi.backendevents.enums.EventCategory;
import ma.emsi.backendevents.repository.EventsRepository;
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
							Events.builder().eventName("WAC vs RCA").eventCategory(EventCategory.SPORT).eventCity("Casablanca").eventPlace("Complexe Sportif Mohammed V").eventDate(Date.valueOf("2023-12-11")).build(),
							Events.builder().eventName("Les Inqualifiables").eventCategory(EventCategory.THEATER).eventCity("Tanger").eventPlace("Complexe Hassan 2").eventDate(Date.valueOf("2023-11-11")).build(),
							Events.builder().eventName("GREEN CARD").eventCategory(EventCategory.CINEMA).eventCity("Casablanca").eventPlace("IMAX Morocco Mall").eventDate(Date.valueOf("2023-10-21")).build()
					)
			);
			eventsRepository.findAll().forEach(e->{
				System.out.println(e.getEventName());
			});
		};
	}

}
