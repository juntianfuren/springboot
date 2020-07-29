package com.jtfr.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "User")
@Data
public class UserDO {

    /**
     * 用户信息
     */
    @Data
    public static class Profile {

        /**
         * 昵称
         */
        private String nickname;
        /**
         * 性别
         */
        private Integer gender;

    }

    @Id
    private Integer id;
    /**
     * 账号
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 用户信息
     */
    private Profile profile;

}