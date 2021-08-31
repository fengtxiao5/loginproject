package com.firstcombo.login.loginserver.infrastructure.repo.dbdo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
public class UserDO implements Serializable {
    private String id;

    private String createBy;

    private Date createDate;

    private String modifyBy;

    private Date modifyDate;

    /**
     * 逻辑删除
     */
    private Boolean isDel;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 是否vip
     */
    private Boolean isVip;

    private static final long serialVersionUID = 1L;
}