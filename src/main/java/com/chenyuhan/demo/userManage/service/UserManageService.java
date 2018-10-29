package com.chenyuhan.demo.userManage.service;

import java.util.List;
import java.util.Map;

/**
 * @author jerrywang
 * @create 2018/10/29.
 */
public interface UserManageService {

    /**
     * @Description 查询用户信息
     * @author JerryWang
     * @date 2018/10/29 23:48
     * @return
     */
    List<Map<String, String>> queryUserInfo();

}
