package pl.wasala.userservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.wasala.userservice.model.User;

public interface UserRepository extends MongoRepository<User, String> {
}
