package com.users.dao;

import com.users.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

// слой DAO для доступа к базе данных
@Repository
public class HibernateUserDAO implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session openSession() {
        return sessionFactory.openSession();
    }


    @Override
    public List<User> getAllTheUsers() {
        Session session = openSession();
        List<User> userList = session.createQuery("from User", User.class).list();
        session.close();
        return userList;
    }

    @Override
    public void addUser(User user) {
        Session session = openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public User getUser(Long id) {
        Session session = openSession();
        session.beginTransaction();
        User user = session.get(User.class, id);
        session.getTransaction().commit();
        session.close();
        return user;
    }

    @Override
    public void updateUser(User user) {
        Session session = openSession();
        session.beginTransaction();
        session.update(user);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteUser(User user) {
        Session session = openSession();
        session.beginTransaction();
        session.delete(user);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public User getUserByEmail(String email) {
        Session session = openSession();
        session.beginTransaction();

        Query<User> query = session.createQuery("from User where email = :email", User.class);
        query.setParameter("email", email);
        User user = query.list().stream().findFirst().orElse(null);

        session.getTransaction().commit();
        session.close();
        return user;
    }
}
