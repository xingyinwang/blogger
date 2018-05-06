package com.wxy.mapper;

import com.wxy.entity.BlogUser;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Cser_W on 2018/4/30.
 */
public interface BlogUserMapper {
    /**
     * 用户注册
     */
    int register(BlogUser BlogUser);

    // 通过主键进行更新用户信息
    int updateUserById(int id);

    BlogUser getBlogUserById(int id);

    //根据用户名称和密码查找用户
    BlogUser getBlogUserByNameAndPassword(@Param("userName") String userName, @Param("password") String password);


}
