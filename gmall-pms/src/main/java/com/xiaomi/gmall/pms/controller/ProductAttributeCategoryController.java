package com.xiaomi.gmall.pms.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaomi.gmall.pms.entity.ProductAttributeCategory;
import com.xiaomi.gmall.pms.service.ProductAttributeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
/**
 * <p>
 * 产品属性分类表 前端控制器
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
@RestController
@RequestMapping("/pms/product-attribute-category")
public class ProductAttributeCategoryController {
   @Autowired
   private ProductAttributeCategoryService productAttributeCategoryService;
    @GetMapping("list")
    public Map  list(@RequestParam(name="pageNum",defaultValue = "1") Integer pageNum,
                     @RequestParam(name="pageSize",defaultValue = "5") Integer pageSize){
        HashMap<String, Object> map = new HashMap<String, Object>();
        IPage<ProductAttributeCategory> iPage = productAttributeCategoryService.getBaseMapper().selectPage(new Page<ProductAttributeCategory>(pageNum, pageSize), null);
        map.put("list",iPage.getRecords());
        map.put("total",iPage.getTotal());
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        return map;
    }

}
