package com.blog.service.impl;

import com.blog.domain.UserInfo;
import com.blog.repository.UserInfoRepository;
import com.blog.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author dengweiping
 */
@Component
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo getUserInfo(String userId) {
        return userInfoRepository.findOneByUserId(userId);
    }
}
