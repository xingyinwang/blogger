package com.wxy.service.impl;

import com.wxy.entity.BlogArticle;
import com.wxy.entity.BlogUser;
import com.wxy.mapper.BlogArticleMapper;
import com.wxy.service.BlogArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by Cser_W on 2018/5/8.
 */
@Service
public class BlogArticleServiceImpl implements BlogArticleService {

    @Autowired
    BlogArticleMapper blogArticleMapper;
    @Override
    public int writeBlog(BlogArticle blogArticle) {
        System.out.println(blogArticle.toString());
        int res = blogArticleMapper.writeBlog(blogArticle);
        return res;
    }

    @Override
    public void deleteArticleById(int id) {
        blogArticleMapper.deleteArticleById(id);
    }

    @Override
    public void updateArticleById(BlogArticle blogArticle) {
        blogArticleMapper.updateArticleById(blogArticle);
    }

    @Override
    public BlogArticle getArticleById(int id) {
        BlogArticle blogArticle = blogArticleMapper.getArticleById(id);
        return blogArticle;
    }

    @Override
    public ArrayList<BlogArticle> getAllArticle() {
        ArrayList<BlogArticle> allArticles = blogArticleMapper.getAllArticle();
        return allArticles;
    }

    @Override
    public ArrayList<BlogArticle> getUserArticles(BlogUser blogUser) {
        ArrayList<BlogArticle> userArticles = blogArticleMapper.getUserArticles(blogUser);
        return userArticles;
    }
}
