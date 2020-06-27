package com.xiaomi.gmall.pms.controller;


import com.xiaomi.gmall.pms.entity.ProductCategory;
import com.xiaomi.gmall.pms.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 产品分类 前端控制器
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
@RestController
@RequestMapping("/pms/product-category")
public class ProductCategoryController {
    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("list/withChildren")
    public List getListWith(@RequestParam(name = "paramid",defaultValue ="0") Long id){
        return productCategoryService.selWithChildren(id);
    }

}
