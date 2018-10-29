package com.chenyuhan.demo.userManage.service;

import com.chenyuhan.demo.userManage.mapper.UserManageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jerrywang
 * @create 2018/10/29.
 */
@Service
public class UserManageServiceImpl implements UserManageService {

    @Autowired
    private UserManageDao userManageDao;

    /**
     * @return
     * @Description 查询用户信息
     * @author JerryWang
     * @date 2018/10/29 23:46
     */
    @Override
    public List<Map<String, String>> queryUserInfo() {

        List<Map<String, String>> resultList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Map<String, String> map = new HashMap<>();

            map.put("userName", "姓名"+i);
            map.put("passWord", "123456");

            resultList.add(map);
        }

//        List<Map<String, String>> result = userManageDao.queryList();
        return resultList;
    }
}
