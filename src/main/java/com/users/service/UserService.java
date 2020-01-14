package com.users.service;

import com.users.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllTheUsers();

    void addUser(User user);

    User getUser(Long id);

    void updateUser(User user);

    boolean deleteUser(Long id);

    List<User> getAllSortTheUsers(int column);
}
