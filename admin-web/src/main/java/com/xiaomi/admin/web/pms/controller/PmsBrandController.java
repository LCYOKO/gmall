package com.xiaomi.admin.web.pms.controller;


import com.xiaomi.common.CommonResult;
import com.xiaomi.common.param.PmsBrandParam;
import com.xiaomi.pms.service.BrandService;
import io.swagger.annotations.Api;

import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * 品牌功能Controller
 */
@CrossOrigin
@RestController
@Api(tags = "PmsBrandController",description = "商品品牌管理")
@RequestMapping("/brand")
public class PmsBrandController {
   @Reference
    private BrandService brandService;
//    @ApiOperation(value = "获取全部品牌列表")
//    @GetMapping(value = "/listAll")
//    public Object getList() {
//
//        //TODO 获取全部品牌列表  brandService.listAll()
//        return new CommonResult().success(productService.getAllBrandList());
//    }
//
//    @ApiOperation(value = "添加品牌")
//    @PostMapping(value = "/create")
//    public Object create(@Valid @RequestBody PmsBrandParam pmsBrand, BindingResult result) {
//        CommonResult commonResult = new CommonResult();
//        //TODO 添加品牌
//
//        return commonResult;
//    }
//
//    @ApiOperation(value = "更新品牌")
//    @PostMapping(value = "/update/{id}")
//    public Object update(@PathVariable("id") Long id,
//                              @Validated @RequestBody PmsBrandParam pmsBrandParam,
//                              BindingResult result) {
//        CommonResult commonResult = new CommonResult();
//
//        //TODO 更新品牌
//
//        return commonResult;
//    }
//
//    @ApiOperation(value = "删除品牌")
//    @GetMapping(value = "/delete/{id}")
//    public Object delete(@PathVariable("id") Long id) {
//        CommonResult commonResult = new CommonResult();
//
//        //TODO 删除品牌
//
//        return commonResult;
//    }
//
    @ApiOperation(value = "根据品牌名称分页获取品牌列表")
    @GetMapping(value = "/list")
    public Object getList(PmsBrandParam param) {

        // 根据品牌名称分页获取品牌列表
        Map<String,Object> brandPageInfo =  brandService.getList(param);

        return new CommonResult().success(brandPageInfo);
    }
//
//    @ApiOperation(value = "根据编号查询品牌信息")
//    @GetMapping(value = "/{id}")
//    public Object getItem(@PathVariable("id") Long id) {
//        CommonResult commonResult = new CommonResult();
//        //TODO 根据编号查询品牌信息
//
//
//        return commonResult;
//    }
//
//    @ApiOperation(value = "批量删除品牌")
//    @PostMapping(value = "/delete/batch")
//    public Object deleteBatch(@RequestParam("ids") List<Long> ids) {
//        CommonResult commonResult = new CommonResult();
//        //TODO 批量删除品牌
//
//
//        return commonResult;
//    }
//
//    @ApiOperation(value = "批量更新显示状态")
//    @PostMapping(value = "/update/showStatus")
//    public Object updateShowStatus(@RequestParam("ids") List<Long> ids,
//                                   @RequestParam("showStatus") Integer showStatus) {
//        CommonResult commonResult = new CommonResult();
//        //TODO 批量更新显示状态
//
//
//        return commonResult;
//    }
//
//    @ApiOperation(value = "批量更新厂家制造商状态")
//    @PostMapping(value = "/update/factoryStatus")
//    public Object updateFactoryStatus(@RequestParam("ids") List<Long> ids,
//                                      @RequestParam("factoryStatus") Integer factoryStatus) {
//        CommonResult commonResult = new CommonResult();
//        //TODO 批量更新厂家制造商状态
//
//
//        return commonResult;
//    }
}
