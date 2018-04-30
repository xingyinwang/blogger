package com.wxy.entity;

/**
 * Created by Cser_W on 2018/4/30.
 */
public class BlogReview {
    private int reviewId;
    private int articleId;
    private int userId;
    private String context;

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

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

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "BlogReview{" +
                "reviewId=" + reviewId +
                ", articleId=" + articleId +
                ", userId=" + userId +
                ", context='" + context + '\'' +
                '}';
    }
}
