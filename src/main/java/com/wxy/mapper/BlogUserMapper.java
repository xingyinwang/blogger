package com.wxy.mapper;

import com.wxy.entity.BlogUser;

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


}
