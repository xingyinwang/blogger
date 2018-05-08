package com.wxy.service.impl;

import com.wxy.entity.BlogArticle;
import com.wxy.entity.BlogUser;
import com.wxy.service.BlogArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Cser_W on 2018/5/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-service.xml","classpath:spring/spring-dao.xml"})
public class BlogArticleServiceImplTest {
    @Autowired
    BlogArticleService blogArticleService;

    BlogArticle blogArticle = new BlogArticle();
    @Test
    public void writeBlog() throws Exception {

        //blogArticle.setArticleId(1);
        blogArticle.setContext("hello this is the test");
        blogArticle.setTitle("this is the title");
        blogArticle.setUserId(3);
        blogArticle.setHasRead(11);
        blogArticle.setDate("20180814");
        System.out.println(blogArticle.toString());
        blogArticleService.writeBlog(blogArticle);
    }

    @Test
    public void deleteArticleById() throws Exception {
        blogArticleService.deleteArticleById(4);
    }

    @Test
    public void updateArticleById() throws Exception {
        BlogArticle blogArticle = blogArticleService.getArticleById(3);
        blogArticle.setUserId(4);
        blogArticle.setTitle("xidian");
        blogArticle.setContext("xidian is a good school");
        blogArticleService.updateArticleById(blogArticle);
    }

    @Test
    public void getArticleById() throws Exception {
        BlogArticle blogArticle = blogArticleService.getArticleById(3);
        System.out.println(blogArticle);
    }

    @Test
    public void getAllArticle() throws Exception {
        ArrayList<BlogArticle> allArticle = blogArticleService.getAllArticle();
        for (BlogArticle blogArticle : allArticle)
            System.out.println(blogArticle.toString());
    }

    @Test
    public void getUserArticles() throws Exception {
        BlogUser blogUser = new BlogUser();
        blogUser.setUserId(2);
        ArrayList<BlogArticle> userArticles = blogArticleService.getUserArticles(blogUser);
        for (BlogArticle blogArticle : userArticles)
            System.out.println(blogArticle);
    }

}