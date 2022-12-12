package com.example.pp.spring.boot.service;

import com.example.pp.spring.boot.model.User;

import java.util.List;

public interface UserService {
    List<User>index();
    User show(Long id);
    void save(User user);
    void update(Long id, User userUpdated);
    void delete(Long id);
}