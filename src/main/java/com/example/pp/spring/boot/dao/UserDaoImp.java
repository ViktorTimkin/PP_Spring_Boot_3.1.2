package com.example.pp.spring.boot.dao;

import com.example.pp.spring.boot.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> index() {
        return entityManager.createQuery("SELECT users FROM User users", User.class).getResultList();
    }

    @Override
    public User show(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(Long id, User userUpdated) {
        User updated = entityManager.find(User.class, id);
        updated.setId(userUpdated.getId());
        updated.setName(userUpdated.getName());
        updated.setSurname(userUpdated.getSurname());
        entityManager.merge(updated);
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(show(id));
    }
}