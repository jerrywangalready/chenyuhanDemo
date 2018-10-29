package com.chenyuhan.demo.userManage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jerrywang
 * @create 2018/10/29.
 */
@Controller
@RequestMapping("/userManage")
public class UserManageController {

    @RequestMapping("")
    public String initIndexPage() {
        return "userManage/userManageIndex";
    }
}
