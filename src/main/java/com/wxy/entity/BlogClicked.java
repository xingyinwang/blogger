package com.wxy.entity;

/**
 * Created by Cser_W on 2018/4/30.
 */
public class BlogClicked {
    private int clickId;
    private int articleId;
    private String ip;

    public int getClickId() {
        return clickId;
    }

    public void setClickId(int clickId) {
        this.clickId = clickId;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "BlogClicked{" +
                "clickId=" + clickId +
                ", articleId=" + articleId +
                ", ip='" + ip + '\'' +
                '}';
    }
}
