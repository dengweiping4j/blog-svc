/*
 * Copyright(c) 2019 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.sinobest.cn
 */
package com.blog.repository;


import com.blog.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author dengweiping
 */
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, String> {

    /**
     * 根据用户id查询用户信息
     *
     * @param userId
     * @return
     */
    UserInfo findOneByUserId(String userId);
}
