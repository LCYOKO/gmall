package com.xiaomi.gmall.pms.service;

import com.xiaomi.gmall.pms.entity.ProductCategory;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 产品分类 服务类
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
public interface ProductCategoryService extends IService<ProductCategory> {
    List selWithChildren(Long id);
}
