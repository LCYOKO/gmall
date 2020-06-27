package com.xiaomi.gmall.oms.service.impl;

import com.xiaomi.gmall.oms.entity.Order;
import com.xiaomi.gmall.oms.mapper.OrderMapper;
import com.xiaomi.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
