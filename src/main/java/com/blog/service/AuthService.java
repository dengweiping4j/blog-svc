package com.blog.service;

import com.blog.domain.UserInfo;

/**
 * @author dengweiping
 */
public interface AuthService {
    /**
     * 根据用户Id获取用户信息
     *
     * @param userId 用户Id
     * @return
     */
    UserInfo getUserInfo(String userId);
}
