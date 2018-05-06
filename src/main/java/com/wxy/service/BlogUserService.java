package com.wxy.service;

import com.wxy.entity.BlogUser;
import com.wxy.mapper.BlogUserMapper;

/**
 * Created by Cser_W on 2018/5/6.
 */
public interface BlogUserService {
    int blogUserRegister(BlogUser blogUser);
    BlogUser getBlogUserByNameAndPassword(String name, String password);
}
