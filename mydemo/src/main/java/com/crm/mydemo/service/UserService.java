package com.crm.mydemo.service;

import com.crm.mydemo.entity.User;
import com.crm.mydemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements  IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByUserid(String userId) {
        return userMapper.findUserByUserid(userId);
    }
}
