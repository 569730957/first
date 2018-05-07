package com.crm.mydemo.service;

import com.crm.mydemo.entity.User;
import org.springframework.stereotype.Service;


public interface IUserService {

    public User findUserByUserid(String userId);

}
