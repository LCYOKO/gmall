package com.xiaomi.gmall.oms.service.impl;

import com.xiaomi.gmall.oms.entity.OrderItem;
import com.xiaomi.gmall.oms.mapper.OrderItemMapper;
import com.xiaomi.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
