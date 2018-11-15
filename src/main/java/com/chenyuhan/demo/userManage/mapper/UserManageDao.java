package com.chenyuhan.demo.userManage.mapper;

import com.chenyuhan.demo.userManage.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author jerrywang
 * @create 2018/10/30.
 */
@Component
@Mapper
public interface UserManageDao {

    /**
     * @Description
     * @author JerryWang
     * @date 2018/10/30 00:07
     * @return
     */
    List<Map<String, String>> queryList();

    int addUser(User user);
}
