package com.pangy.dreamBoot.service;

import com.pangy.dreamBoot.entity.User;
import com.pangy.dreamBoot.mapper.UserMapper;
import com.pangy.dreamBoot.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User getByLogin(UserVO userVO){
        User user = userMapper.selectUserByUserVo(userVO);
        return user;
    }
}
