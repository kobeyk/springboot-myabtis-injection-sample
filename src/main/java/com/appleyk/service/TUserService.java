package com.appleyk.service;

import com.appleyk.mapper.TUserMapper;
import com.appleyk.model.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TUserService {

    @Autowired
    private TUserMapper userMapper;

    @Transactional(rollbackFor = {Exception.class})
    public TUser save(TUser user){
        // 假设id主键就是时间戳，简单来
        user.setId(System.currentTimeMillis());
        userMapper.insert(user);
        return user;
    }

    @Transactional(rollbackFor = {Exception.class})
    public boolean attackLogin(TUser user){
        return userMapper.attackLogin(user.getName(), user.getPassword())!=null;
    }

    @Transactional(rollbackFor = {Exception.class})
    public boolean login(TUser user){
        return userMapper.login(user.getName(), user.getPassword())!=null;
    }

}
