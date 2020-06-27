package com.xiaomi.gmall.oms.service.impl;

import com.xiaomi.gmall.oms.entity.CartItem;
import com.xiaomi.gmall.oms.mapper.CartItemMapper;
import com.xiaomi.gmall.oms.service.CartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
