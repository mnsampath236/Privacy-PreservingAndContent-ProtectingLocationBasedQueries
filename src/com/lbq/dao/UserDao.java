package com.lbq.dao;

import java.util.List;

import com.lbq.model.User;

public interface UserDao {

    String login(User user);
    String register(User user);
    List<User> getUsers();
    String acivateUser(User user);
    String deactivateUser(User user);
    String deleteUSe(User user);
}