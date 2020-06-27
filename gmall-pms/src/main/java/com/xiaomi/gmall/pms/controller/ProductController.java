package com.xiaomi.gmall.pms.controller;


import com.xiaomi.common.PageInfo;
import com.xiaomi.common.pms.PmsProductQueryParam;
import com.xiaomi.gmall.pms.service.ProductService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
/**
 * <p>
 * 商品信息 前端控制器
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
@RestController
@RequestMapping("/pms/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping( "list")
    public Map getList(@RequestParam(value = "pageSize", defaultValue = "5") Long pageSize,
                       @RequestParam(value = "pageNum", defaultValue = "1") Long pageNum,
                       @RequestParam(value = "keywords",required = false) String keyword,
                       @RequestParam(value = "productSn", required = false) String productSn,
                       @RequestParam(value = "publishStatus", required = false) Integer publishStatus,
                       @RequestParam(value = "verifyStatus", required = false) Integer verifyStatus,
                       @RequestParam(value = "productCategoryId", required = false) Long productCategoryId,
                       @RequestParam(value = "brandId", required = false) Long brandId){
        PmsProductQueryParam param = new PmsProductQueryParam();
        param.setBrandId(brandId);
        param.setKeyword(keyword);
        param.setPageNum(pageNum);
        param.setPageSize(pageSize);
        param.setProductCategoryId(productCategoryId);
        param.setProductSn(productSn);
        param.setPublishStatus(publishStatus);
        param.setVerifyStatus(verifyStatus);
        return productService.getList(param) ;
    }
    @GetMapping("hello")
    public String hello(){
        return "hello";
    }
}
