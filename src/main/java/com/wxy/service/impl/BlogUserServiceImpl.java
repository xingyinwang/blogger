package com.wxy.service.impl;

import com.wxy.entity.BlogUser;
import com.wxy.mapper.BlogUserMapper;
import com.wxy.service.BlogUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Cser_W on 2018/5/6.
 */
@Service
public class BlogUserServiceImpl implements BlogUserService {
    @Autowired
    BlogUserMapper blogUserMapper;

    @Override
    public int blogUserRegister(BlogUser blogUser) {
        return blogUserMapper.register(blogUser);
    }

    @Override
    public BlogUser getBlogUserByNameAndPassword(String name, String password) {
        return blogUserMapper.getBlogUserByNameAndPassword(name, password);
    }
}
