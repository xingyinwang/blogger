package com.wxy.service;

import com.wxy.entity.BlogArticle;
import com.wxy.entity.BlogUser;

import java.util.ArrayList;

/**
 * Created by Cser_W on 2018/5/8.
 */
public interface BlogArticleService {

    int writeBlog(BlogArticle blogArticle);

    void deleteArticleById(int id);

    void updateArticleById(BlogArticle blogArticle);

    BlogArticle getArticleById(int id);

    ArrayList<BlogArticle> getAllArticle();

    ArrayList<BlogArticle> getUserArticles(BlogUser blogUser);
}
