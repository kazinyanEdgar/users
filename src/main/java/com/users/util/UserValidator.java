package com.users.util;

import com.users.dao.UserDAO;
import com.users.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {

    @Autowired
    private UserDAO userDAO;

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;
        if (userDAO.getUserByEmail(user.getEmail()) != null) {
            errors.rejectValue("email", "", "Такая почта уже есть");
        }
    }

}
