package com.lbq.dao;

import com.lbq.model.User;

public interface UserDao {

    String login(User user);

    String register(User user);
    
}