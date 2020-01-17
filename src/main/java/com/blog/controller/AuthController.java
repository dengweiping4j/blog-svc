package com.blog.controller;

import com.blog.domain.UserInfo;
import com.blog.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;

/**
 * 权限管理接口
 * @author dengweiping
 */
@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    /**
     * 根据用户Id获取用户信息
     *
     * @param userId
     * @return
     */
    @RequestMapping(value = "userInfo/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public UserInfo userInfo(@PathVariable("userId") String userId) {
        return authService.getUserInfo(userId);
    }
}
