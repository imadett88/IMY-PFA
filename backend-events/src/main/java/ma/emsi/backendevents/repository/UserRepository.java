package ma.emsi.backendevents.repository;

import ma.emsi.backendevents.entitie.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
