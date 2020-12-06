package com.wecho.top10_news_web.service;

import com.wecho.top10_news_web.dao.UserMapper;
import com.wecho.top10_news_web.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getUserById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
