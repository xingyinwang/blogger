package com.wxy.entity;

/**
 * Created by Cser_W on 2018/4/30.
 */
public class BlogPersonalSetting {
    private int personalSetting;
    private int userId;
    private String logTitle;
    private String dioGraph;

    public int getPersonalSetting() {
        return personalSetting;
    }

    public void setPersonalSetting(int personalSetting) {
        this.personalSetting = personalSetting;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLogTitle() {
        return logTitle;
    }

    public void setLogTitle(String logTitle) {
        this.logTitle = logTitle;
    }

    public String getDioGraph() {
        return dioGraph;
    }

    public void setDioGraph(String dioGraph) {
        this.dioGraph = dioGraph;
    }

    @Override
    public String toString() {
        return "BlogPersonalSetting{" +
                "personalSetting=" + personalSetting +
                ", userId=" + userId +
                ", logTitle='" + logTitle + '\'' +
                ", dioGraph='" + dioGraph + '\'' +
                '}';
    }
}
