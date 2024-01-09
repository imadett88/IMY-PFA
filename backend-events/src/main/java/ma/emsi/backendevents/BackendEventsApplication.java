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
    CommandLineRunner commandLineRunner(EventsRepository eventsRepository) {
        return args -> {
            eventsRepository.saveAll(
                    List.of(
                            Events.builder().eventName("WAC vs MAS").eventCategory(EventCategory.SPORT).eventCity("Fés").eventPlace("Complexe sportif de Fès").eventDate(Date.valueOf("2023-10-12")).eventPrice(50).imgUrl("https://ar.yalla-shoot2day.com/wp-content/uploads/2022/05/%D8%A7%D9%84%D9%88%D8%AF%D8%A7%D8%AF-%D8%A7%D9%84%D8%B1%D9%8A%D8%A7%D8%B6%D9%8A-%D9%88-%D8%A7%D9%84%D9%85%D8%BA%D8%B1%D8%A8-%D8%A7%D9%84%D9%81%D8%A7%D8%B3%D9%8A-%D8%A8%D8%AB-%D9%85%D8%A8%D8%A7%D8%B4%D8%B1.jpg").eventDetails("Pour le compte de la 8ème journée de la Botola Pro Inwi 2022-2023, le Maghreb Association sportive reçoit Wydad Athletic Club le Dimanche 12 Octobre 2023 à 16h00 au Complexe sportif de Fès").build(),
                            Events.builder().eventName("Film Nayda \"Kabarha Tsghar\"").eventCategory(EventCategory.CINEMA).eventCity("Rabat").eventPlace("Megarama RABAT").eventDate(Date.valueOf("2023-12-10")).eventPrice(80).imgUrl("https://static.lematin.ma/files/services/cinema/2023/10/b7ac670754bd22e0c5527ebb68083acf.jpg").eventDetails("Film Nayda \"Kabarha Tsghar\" à Megarama RABAT").build(),
                            Events.builder().eventName("Spectacle EN RODAGE").eventCategory(EventCategory.THEATER).eventCity("Casablanca").eventPlace("COMPLEXE CULTUREL Anfa").eventDate(Date.valueOf("2023-11-20")).eventPrice(70).imgUrl("https://comedihaclub.com/wp-content/uploads/2023/11/SITE_3840x2460-2-scaled.jpg").eventDetails("Même après cinq One-man show, un livre et une série sur son quotidien avec sa fille, Maxim Martin n’a pas fini de se dévoiler. En rodage de son 6e show et malgré sa nouvelle vie plus saine,").build()
                    )
            );
            eventsRepository.findAll().forEach(e -> {
                System.out.println(e.getEventName());
            });
        };
    }

    //@Bean
    CommandLineRunner cm(UserRepository userRepository) {
        return args -> {
            userRepository.saveAll(
                    List.of(
                            User.builder().fullName("Imad Ettamen").email("imad@adm.com").password("1234").role(UserRole.ADMIN).build(),
                            User.builder().fullName("Mohamed Sadrafe").email("med@adm.com").password("1111").role(UserRole.USER).build()
                    )
            );
            userRepository.findAll().forEach(u -> {
                System.out.println(u.getFullName());
            });
        };
    }

}
