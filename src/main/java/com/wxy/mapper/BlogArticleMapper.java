package com.wxy.mapper;

import com.wxy.entity.BlogArticle;
import com.wxy.entity.BlogUser;

import java.util.ArrayList;

/**
 * Created by Cser_W on 2018/4/30.
 */
public interface BlogArticleMapper {

    int writeBlog(BlogArticle blogArticle);

    void deleteArticleById(int id);

    void updateArticleById(BlogArticle blogArticle);

    BlogArticle getArticleById(int id);

    ArrayList<BlogArticle> getAllArticle();

    ArrayList<BlogArticle> getUserArticles(BlogUser blogUser);

}
