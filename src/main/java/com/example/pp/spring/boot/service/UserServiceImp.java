package com.example.pp.spring.boot.service;

import com.example.pp.spring.boot.dao.UserDao;
import com.example.pp.spring.boot.model.User;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public List<User> index() {
        return userDao.index();
    }

    @Transactional
    @Override
    public User show(Long id) {
        return userDao.show(id);
    }

    @Transactional
    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Transactional
    @Override
    public void update(Long id, User userUpdated) {
        userDao.update(id, userUpdated);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }

}