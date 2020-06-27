package com.xiaomi.gmall.pms.controller;


import com.xiaomi.gmall.pms.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 品牌表 前端控制器
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
@RestController
@RequestMapping("/pms/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;
    @GetMapping("listAll")
    public List getAll(){
        return brandService.list();
    }

}
