package com.xiaomi.ums.entity.to;

import lombok.Data;

import java.util.Date;

/**
 * @author l
 * @create 2020-03-03-20:02
 */
@Data
public class AdminTo {
    private static final long serialVersionUID = 1L;

    private Long id;


    private String username;

    private String icon;


    private String email;


    private String nickName;


    private String note;


    private Date createTime;


    private Date loginTime;


    private Integer status;
}
