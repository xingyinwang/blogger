package com.wxy.entity;

/**
 * Created by Cser_W on 2018/4/30.
 */
public class BlogArticle {
    private int articleId;
    private int userId;
    private String title;
    private String context;
    private int hasRead;

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getHasRead() {
        return hasRead;
    }

    public void setHasRead(int hasRead) {
        this.hasRead = hasRead;
    }

    @Override
    public String toString() {
        return "BlogArticle{" +
                "articleId=" + articleId +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", context='" + context + '\'' +
                ", hasRead=" + hasRead +
                '}';
    }
}
