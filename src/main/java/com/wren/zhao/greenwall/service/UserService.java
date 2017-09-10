package com.wren.zhao.greenwall.service;

import com.wren.zhao.greenwall.dto.User;
import com.wren.zhao.greenwall.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wren.zhao on 2017/9/10.
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User getUserInfo() {
        return userMapper.findUserInfo();
    }
}
