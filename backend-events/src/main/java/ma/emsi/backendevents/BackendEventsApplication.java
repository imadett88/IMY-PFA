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
                           // Events.builder().eventName("WAC vs RCA").eventCategory(EventCategory.SPORT).eventCity("Casablanca").eventPlace("Complexe Sportif Mohammed V").eventDate(Date.valueOf("2023-12-11")).eventPrice(50).imgUrl("https://i.ytimg.com/vi/l3N5ICu4swU/maxresdefault.jpg").eventDetails("Pour le compte de la 6ème journée de la Botola Pro Inwi 2022-2023, le Wydad Athletic Club reçoit le Raja Club Athletic le Dimanche 23 Octobre 2022 à 16h00 au Complexe Sportif Mohammed V - Casablanca").build(),
                           // Events.builder().eventName("SOIRÉE ANDALOUSE").eventCategory(EventCategory.MUSIC_DANCE).eventCity("Tanger").eventPlace("Complexe Hassan 2").eventDate(Date.valueOf("2023-11-11")).eventPrice(120).imgUrl("https://gcdn.imgix.net/events/soiree-andalouse-fin-dannee.jpeg").eventDetails("A l'occasion de la fin d'année l'association seloune des arts et culture organise avec la collaboration de l'association nafahat torathya une soirée exceptionnelle et envoûtante avec, au programme , de la musique andalouse, madih et samaa, ainsi que l'art issaoui.Animée par l'orchestre de selouane.").build(),
                           // Events.builder().eventName("John Wick").eventCategory(EventCategory.CINEMA).eventCity("Casablanca").eventPlace("IMAX Morocco Mall").eventDate(Date.valueOf("2023-10-21")).eventPrice(70).imgUrl("https://wallpapers.com/images/hd/cool-hd-john-wick-and-guns-fkurzl5x5t5vakvg.jpg").eventDetails("John Wick découvre un moyen de vaincre l’organisation criminelle connue sous le nom de la Grande Table. Mais avant de gagner sa liberté, Il doit affronter un nouvel ennemi qui a tissé de puissantes alliances à travers le monde et qui transforme les vieux amis de John en ennemis.").build(),
                           // Events.builder().eventName("Les Foulées de Casa Anfa").eventCategory(EventCategory.SPORT).eventCity("Casablanca").eventPlace("ANFA PARK").eventDate(Date.valueOf("2024-01-11")).eventPrice(120).imgUrl("https://gcdn.imgix.net/events/les-foulees-de-casa-anfa.jpeg").eventDetails("Les Foulées de Casa Anfa est une course de renommée devenue incontournable pour les Casablancais et les entreprises qui souhaitent aligner leurs collaborateurs.").build(),
                           // Events.builder().eventName("oppenheimer").eventCategory(EventCategory.CINEMA).eventCity("Casablanca").eventPlace("IMAX Morocco Mall").eventDate(Date.valueOf("2023-12-01")).eventPrice(80).imgUrl("https://i.ytimg.com/vi/uYPbbksJxIg/maxresdefault.jpg").eventDetails("En 1942, convaincus que l’Allemagne nazie est en train de développer une arme nucléaire, les États-Unis initient, dans le plus grand secret, le \"Projet Manhattan\" destiné à mettre au point la première bombe atomique de l’histoire.").build(),
                           // Events.builder().eventName("CAFÉ THÉÂTRE , 1ère édition\n").eventCategory(EventCategory.SPORT).eventCity("Rabat").eventPlace("Marriott Hotel").eventDate(Date.valueOf("2024-01-21")).eventPrice(60).imgUrl("https://kapitalis.com/tunisie/wp-content/uploads/2015/06/Masra7.jpg").eventDetails("Rejoignez-nous au Rabat Marriott Hotel pour une soirée magique au Croon lounge bar! Magie, hypnose, illusionisme: la magie sera partout avec la star internationale Ahmed!").build(),
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
