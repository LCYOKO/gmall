package com.xiaomi.gmall.pms.service.impl;

import com.xiaomi.common.constant.SysConstant;
import com.xiaomi.gmall.pms.entity.ProductCategory;
import com.xiaomi.gmall.pms.mapper.ProductCategoryMapper;
import com.xiaomi.gmall.pms.service.ProductCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 产品分类 服务实现类
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryService {
     @Autowired
     private RedisTemplate redisTemplate;
    @Override
    public List selWithChildren(Long id) {
        Object cache=redisTemplate.opsForValue().get(SysConstant.SYS_MEN_CACHE_KEY);
        if(cache!=null){
            return (List<ProductCategory>)cache;
        }
        List<ProductCategory> list = this.baseMapper.selWithChildren(id);
        redisTemplate.opsForValue().set(SysConstant.SYS_MEN_CACHE_KEY,list);
        return list;
    }
}
