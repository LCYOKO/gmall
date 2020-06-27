package com.xiaomi.gmall.ums.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.xiaomi.gmall.ums.entity.Admin;
//import com.xiaomi.gmall.ums.entity.to.AdminTo;
import com.xiaomi.gmall.ums.mapper.AdminMapper;
//import com.xiaomi.gmall.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaomi.ums.entity.Admin;
import com.xiaomi.ums.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
@org.apache.dubbo.config.annotation.Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Override
    public Admin login(String username, String password) {
        String digest = DigestUtils.md5DigestAsHex(password.getBytes());

        AdminMapper baseMapper = getBaseMapper();

        Admin admin = baseMapper.selectOne(new QueryWrapper<Admin>()
                .eq("username", username)
                .eq("password", digest));
        return admin;
    }

    @Override
    public Admin getInfo(String username) {
       return getBaseMapper().selectOne(new QueryWrapper<Admin>().eq("username", username));
    }
}
