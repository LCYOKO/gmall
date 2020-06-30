package com.xiaomi.gmall.pms.service.impl;

import com.xiaomi.pms.entity.ProductFullReduction;
import com.xiaomi.gmall.pms.mapper.ProductFullReductionMapper;
//import com.xiaomi.gmall.pms.service.ProductFullReductionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaomi.pms.service.ProductFullReductionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品满减表(只针对同商品) 服务实现类
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
@Service
public class ProductFullReductionServiceImpl extends ServiceImpl<ProductFullReductionMapper, ProductFullReduction> implements ProductFullReductionService {

}
