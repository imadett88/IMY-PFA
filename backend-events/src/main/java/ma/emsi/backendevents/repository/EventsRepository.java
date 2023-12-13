package ma.emsi.backendevents.repository;

import ma.emsi.backendevents.entitie.Events;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsRepository extends JpaRepository<Events,Long> {
}
