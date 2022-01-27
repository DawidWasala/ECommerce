package pl.wasala.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wasala.userservice.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
