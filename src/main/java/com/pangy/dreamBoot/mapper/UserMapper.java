package com.pangy.dreamBoot.mapper;


import com.pangy.dreamBoot.entity.User;
import com.pangy.dreamBoot.vo.UserVO;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User selectUserByUserVo(@Param("userVO") UserVO userVO);
}