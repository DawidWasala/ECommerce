package pl.wasala.userservice.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany
    private List<Permission> permissions;

    public Role() {}

    public Role(long id, List<Permission> permissions) {
        this.id = id;
        this.permissions = permissions;
    }
}
