package com.xiaomi.gmall.pms.mapper;

import com.xiaomi.gmall.pms.entity.ProductCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 产品分类 Mapper 接口
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
public interface ProductCategoryMapper extends BaseMapper<ProductCategory> {

   List<ProductCategory> selWithChildren(Long id);
}
