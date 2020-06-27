package com.xiaomi.admin.web.ums.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 后台用户表
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;


    private Long id;


    private String username;


    private String password;

    private String icon;


    private String email;


    private String nickName;


    private String note;


    private Date createTime;


    private Date loginTime;


    private Integer status;


}
