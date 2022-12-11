package com.example.pp.spring.boot.service;

import com.example.pp.spring.boot.model.User;

import java.util.List;

public interface UserService {
    public List<User>index();
    public User show(Long id);
    public void save(User user);
    public void update(Long id, User userUpdated);
    public void delete(Long id);
}