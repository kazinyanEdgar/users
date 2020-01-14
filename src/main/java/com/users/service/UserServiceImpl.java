package com.users.service;

import com.users.dao.UserDAO;
import com.users.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> getAllTheUsers() {
        return userDAO.getAllTheUsers();
    }

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    public User getUser(Long id) {
        return userDAO.getUser(id);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public boolean deleteUser(Long id) {
        User user = getUser(id);
        if (user == null)
            return false;
        userDAO.deleteUser(user);
        return true;
    }

    @Override
    public List<User> getAllSortTheUsers(int column) {
        List<User> list = getAllTheUsers();
        Collections.sort(list, (o1, o2) -> {
            switch (column) {
                case 1:
                    return o1.getSurname().compareTo(o2.getSurname());
                case 2:
                    return o1.getName().compareTo(o2.getName());
                case 3:
                    return o1.getEmail().compareTo(o2.getEmail());
                case 4:
                    return o1.getCity().compareTo(o2.getCity());
            }
            return 0;
        });
        return list;
    }
}
