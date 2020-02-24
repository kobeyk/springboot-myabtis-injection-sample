package com.appleyk.controller;

import com.appleyk.model.TUser;
import com.appleyk.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class TUserController {

    @Autowired
    private TUserService userService;

    @PostMapping("/register")
    public ResponseEntity save(@RequestBody TUser user){
        userService.save(user);
        return ResponseEntity.ok(user);
    }

    /**
     * <p>带有侵略性（攻击）的登录</p>
     * @param user 登录用户
     * @return
     */
    @PostMapping("/attack/login")
    public ResponseEntity attackLogin(@RequestBody TUser user){
        return ResponseEntity.ok(userService.attackLogin(user));
    }

    /**
     * <p>正常登录，防sql注入</p>
     * @param user 登录用户
     * @return
     */
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody TUser user){
        return ResponseEntity.ok(userService.login(user));
    }

}
