package pl.wasala.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wasala.userservice.model.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
