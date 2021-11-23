package pl.wasala.userservice.validation;

import pl.wasala.userservice.model.UserInbound;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public void initialize(PasswordMatches constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        final UserInbound userInbound = (UserInbound) value;
        return userInbound.getPassword().equals(userInbound.getMatchingPassword());
    }
}
