package pl.wasala.userservice;

import org.springframework.web.bind.annotation.*;
import pl.wasala.userservice.model.User;
import pl.wasala.userservice.model.UserInbound;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable String userId) {
        return userService.findUserById(userId);
    }

    @PostMapping
    public User createUser(@RequestBody UserInbound userInbound) {
        return userService.createUser(userInbound);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
    }

}
