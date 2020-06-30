package com.xiaomi.gmall.pms.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaomi.common.pms.PmsProductQueryParam;
import com.xiaomi.pms.entity.Product;
import com.xiaomi.gmall.pms.mapper.ProductMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.xiaomi.pms.service.ProductService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Service;


import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
@Service
public  class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Override
    public Map getList(PmsProductQueryParam queryParam) {
        QueryWrapper<Product> wrapper = new QueryWrapper<>();
        if(queryParam.getBrandId() !=null ) wrapper.eq("brand_id",queryParam.getBrandId());
        if(StringUtils.isNotBlank(queryParam.getKeyword())) wrapper.like("name",queryParam.getKeyword());
        if(queryParam.getProductCategoryId() != null) wrapper.eq("product_category_id",queryParam.getProductCategoryId());
        if(queryParam.getPublishStatus() != null) wrapper.eq("publish_status",queryParam.getPublishStatus());
        if(queryParam.getProductSn() != null) wrapper.eq("product_sn",queryParam.getProductSn());
        if(queryParam.getBrandId() != null) wrapper.eq("brand_id",queryParam.getBrandId());
        if(queryParam.getVerifyStatus() != null) wrapper.eq("verrify_status",queryParam.getVerifyStatus());
        IPage<Product> iPage = this.getBaseMapper().selectPage(new Page<Product>(queryParam.getPageNum(), queryParam.getPageSize()), wrapper);
        System.out.println(iPage);
        Map<String, Object> map = new HashMap<>();
        map.put("pageSize",queryParam.getPageSize());
        map.put("totalPage",iPage.getPages());
        map.put("total",iPage.getTotal());
        map.put("pageNum",queryParam.getPageNum());
        map.put("list",iPage.getRecords());
        return map;
    }
}
