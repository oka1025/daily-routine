package com.example.demo.validation;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import com.example.demo.entity.User;

public class PasswordMatchesValidator
        implements ConstraintValidator<PasswordMatches, User> {

    @Override
    public boolean isValid(User user, ConstraintValidatorContext context) {
        if (user.getPassword() == null || user.getConfirmPassword() == null) {
            return false;
        }
        return user.getPassword().equals(user.getConfirmPassword());
    }
}
