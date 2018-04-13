package com.recruitment.www.rest;

import com.recruitment.www.common.RestResp;
import com.recruitment.www.entity.Company;
import com.recruitment.www.service.AdminService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Gaoyp
 * @Description:
 * @Date: Create in 下午2:03 2018/4/13
 * @Modified By:
 */
@CrossOrigin
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;


    @GetMapping("/login")
    private RestResp loginIn(@RequestParam String username,
                             @RequestParam String password){
        return adminService.loginIn(username,password);
    }

    @PostMapping("/check")
    public RestResp checkCompany(List<String> ids){
        return adminService.checkCompany(ids);
    }

    @PostMapping("/destroy")
    public RestResp destroyCompany(List<String> ids){
        return adminService.destroyCompany(ids);
    }

}
