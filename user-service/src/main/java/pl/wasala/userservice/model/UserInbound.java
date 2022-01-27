package pl.wasala.userservice.model;

import pl.wasala.userservice.validation.PasswordMatches;
import pl.wasala.userservice.validation.ValidEmail;
import pl.wasala.userservice.validation.ValidPassword;

import javax.validation.constraints.NotNull;

@PasswordMatches
public class UserInbound {

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    @ValidPassword
    private String password;

    @NotNull
    private String matchingPassword;

    @NotNull
    @ValidEmail
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getMatchingPassword() {
        return matchingPassword;
    }

    public String getEmail() {
        return email;
    }
}
