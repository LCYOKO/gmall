package com.xiaomi.gmall.pms.service;


import com.xiaomi.common.pms.PmsProductQueryParam;
import com.xiaomi.gmall.pms.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
public interface ProductService extends IService<Product> {
    Map getList(PmsProductQueryParam queryParam);
}
