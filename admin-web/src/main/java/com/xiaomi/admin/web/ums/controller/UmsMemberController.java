package com.xiaomi.admin.web.ums.controller;



import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Api(tags = "UmsMemberController", description = "会员服务管理")
@RestController
public class UmsMemberController {


    //memberLevel/list?defaultStatus=0
//      @Autowired
//      private AdminService adminService;
//    @GetMapping("/memberLevel/list")
//    public Object memberLevel(@RequestParam(value = "defaultStatus",defaultValue = "0") Integer defaultStatus){
//
//
//        return new CommonResult().success(adminService.defaultStatus(defaultStatus));
//    }

}
