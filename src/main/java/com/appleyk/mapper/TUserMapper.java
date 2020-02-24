package com.appleyk.mapper;

import com.appleyk.model.TUser;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;


public interface TUserMapper extends Mapper<TUser> {

    TUser attackLogin(@Param("userName") String userName, @Param("password") String password);
    TUser login(@Param("userName") String userName, @Param("password") String password);
}
