package org.example.app.repository.impl;

import org.example.app.entity.User;
import org.example.app.repository.BaseRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
@Repository
public class UserRepoImpl implements BaseRepository<User> {
    @Autowired
    private SessionFactory sessionFactory;

    public void save(User user) {
        Session currentSession = sessionFactory.getCurrentSession();
        String hql = "INSERT INTO User (firstName, lastName, email) " +
                "VALUES (:firstName, :lastName, :email)";
        MutationQuery query = currentSession.createMutationQuery(hql);
        query.setParameter("firstName", user.getFirstName());
        query.setParameter("lastName", user.getLastName());
        query.setParameter("email", user.getEmail());
        query.executeUpdate();

    }

    public List<User> fetchAll() {
        Session currentSession = sessionFactory.getCurrentSession();
        return currentSession.createQuery("FROM User", User.class).list();

    }

    public User fetchById(Long id) {
        Session currentSession = sessionFactory.getCurrentSession();
        return currentSession.get(User.class, id);
    }

    public void delete(Long id) {
        Session currentSession = sessionFactory.getCurrentSession();
        User user = currentSession.byId(User.class).load(id);
        currentSession.remove(user);
    }

}
