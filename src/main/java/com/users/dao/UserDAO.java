package com.users.dao;

import com.users.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllTheUsers();

    void addUser(User user);

    User getUser(Long id);

    void updateUser(User user);

    void deleteUser(User user);

    User getUserByEmail(String email);
}
