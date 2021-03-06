package pl.wasala.userservice.service;

import org.springframework.stereotype.Service;
import pl.wasala.userservice.exception.UserNotFoundException;
import pl.wasala.userservice.model.User;
import pl.wasala.userservice.model.UserInbound;
import pl.wasala.userservice.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User findUserById(Long userId) {
        return userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
    }

    public User createUser(UserInbound userInbound) {

//        if (emailExists(userInbound.getEmail())) {
//            throw new UserEmailAlreadyExistsException();
//        }

        User user = new User(
                userInbound.getFirstName(),
                userInbound.getLastName(),
                userInbound.getPassword(),
                userInbound.getEmail());

        userRepository.save(user);

        return user;
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

}
