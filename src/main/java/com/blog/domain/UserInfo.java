package com.blog.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 用户信息实体
 * @author dengweiping
 */

@Entity
@Table(name="basic_user_info")
@Data
public class UserInfo implements Serializable {
    @Id
    @Column(name = "pkid")
    private String pkid;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_type")
    private String userType;
}