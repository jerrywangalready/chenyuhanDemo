package com.chenyuhan.demo.userManage.controller;

import com.chenyuhan.demo.userManage.entity.User;
import com.chenyuhan.demo.userManage.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.LinkedList;
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

    @Autowired
    private User user;

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
    public String addPage() { return "userManage/userManageAdd"; }

    @RequestMapping("/del")
    public String delPage(){ return "userManage/userManageDel"; }

    @ResponseBody
    @RequestMapping("/queryList")
    public List<Map<String, String>> queryList() {

        return userManageService.queryAllUser();
    }

    @RequestMapping("/doAdd")
    public String save( @RequestParam("userName") String userName,
                        @RequestParam("passWord") String passWord,
                        @RequestParam("age") int age,
                        @RequestParam("sex") String sex ) {

        new LinkedList();
        new HashMap<>();
        user.setId(10020);
        user.setUser_name(userName);
        user.setPass_word(passWord);
        user.setAge(age);
        user.setSex(sex);
        int end = userManageService.addUser(user);
        System.out.println(userName);
        System.out.println(end);
        return "userManage/userManageDel";
    }
}
