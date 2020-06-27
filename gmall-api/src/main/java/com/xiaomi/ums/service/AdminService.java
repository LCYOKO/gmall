package com.xiaomi.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaomi.ums.entity.Admin;


/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
public interface AdminService extends IService<Admin> {
    Admin login(String username, String password);
    Admin getInfo(String username);
}
