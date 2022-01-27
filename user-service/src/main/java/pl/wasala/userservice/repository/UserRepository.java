package pl.wasala.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wasala.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
