<%--
  Created by IntelliJ IDEA.
  User: Cser_W
  Date: 2018/5/6
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
    <title>注册页面</title>

    <meta name="keywords" content="注册网页,西安电子科技大学,韩春">
    <meta name="description" content="a simple demo to Web APP">
    <meta name="content-type" content="text/html; charset=UTF-8">

</head>

<body>

<h2 align=center>注册页面</h2>
<center>

    <form action="/wxy/register" method="post">
        <table border="1">
            <tr>
                <td>登录名：</td>
                <td><input name="userName"></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input name="password" type="password"></td>
            </tr>
            <tr>
                <td>重复密码：</td>
                <td><input name="conPassword" type="password"></td>
            </tr>
            <tr>
                <td>昵称：</td>
                <td><input name="nickName"></td>
            </tr>
            <tr>
                <td>密保问题：</td>
                <td><input name="question"></td>
            </tr>
            <tr>
                <td>密保答案：</td>
                <td><input name="answer"></td>
            </tr>
            <tr align="center">
                <td colspan="2"><input type="submit" value="提交注册"></td>
            </tr>
        </table>
    </form>

    您有账号？<a href="/wxy/toLogin"><front color="GREEN" >点击直接登录</front></a>
</center>
</body>
</html>