package com.wxy.mapper;

import com.wxy.entity.BlogUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Cser_W on 2018/4/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class BlogUserMapperTest {

    @Autowired
    private BlogUserMapper blogUserMapper ;

    @Test
    public void getBlogUserByNameAndPassword() throws Exception {
        BlogUser user = blogUserMapper.getBlogUserByNameAndPassword("wxy","123");
        System.out.println(user.toString());
    }

    @Test
    public void getBlogUserById() throws Exception {
        BlogUser blogUser = blogUserMapper.getBlogUserById(2);
        System.out.println(blogUser.toString());
    }

    @Test
    public void register() throws Exception {
        BlogUser blogUser = new BlogUser();
        blogUser.setUserId(7);
        blogUser.setUserName("zcj");
        blogUser.setPassword("321");
        blogUser.setNickName("haha");
        blogUser.setQuestion("how are you?");
        blogUser.setAnswer("good boy");
        blogUserMapper.register(blogUser);
        System.out.println(blogUser.toString());

    }

    @Test
    public void updateUserById() throws Exception {
    }

}