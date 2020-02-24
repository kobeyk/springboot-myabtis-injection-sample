package com.appleyk.model;

import lombok.Data;

@Data
public class TUser {

    private Long id ;
    /**登录用户名*/
    private String name;
    /**密码*/
    private String password;

}
