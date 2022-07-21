package rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rest.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
