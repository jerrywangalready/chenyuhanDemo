package com.chenyuhan.demo.userManage.controller;

import com.chenyuhan.demo.userManage.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author jerrywang
 * @create 2018/10/29.
 */
@Controller
@RequestMapping("/userManage")
public class UserManageController {

    @Autowired
    private UserManageService userManageService;

    /**
     * @Description 首页
     * @author JerryWang
     * @date 2018/10/29 23:36
     * @return
     */
    @RequestMapping("")
    public String initIndexPage() {
        return "userManage/userManageIndex";
    }

    @RequestMapping("/add")
    public String addPage() {
        return "userManage/userManageAdd";
    }

    @ResponseBody
    @RequestMapping("/queryList")
    public List<Map<String, String>> queryList() {

        return userManageService.queryUserInfo();
    }
}
