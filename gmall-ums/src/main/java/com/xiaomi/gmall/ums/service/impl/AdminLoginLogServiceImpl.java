package com.xiaomi.gmall.ums.service.impl;


import com.xiaomi.gmall.ums.mapper.AdminLoginLogMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaomi.ums.entity.AdminLoginLog;
import com.xiaomi.ums.service.AdminLoginLogService;
import org.springframework.stereotype.Service;


/**
 * <p>
 * 后台用户登录日志表 服务实现类
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
@Service
public class AdminLoginLogServiceImpl extends ServiceImpl<AdminLoginLogMapper, AdminLoginLog> implements AdminLoginLogService {
}
