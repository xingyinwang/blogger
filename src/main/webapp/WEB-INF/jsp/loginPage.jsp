<%--
  Created by IntelliJ IDEA.
  User: Cser_W
  Date: 2018/5/6
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <title>登陆页面</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta name="keywords" content="注册网页,西安电子科技大学,韩春">
    <meta name="description" content="a simple demo to Web APP">
    <meta name="content-type" content="text/html; charset=UTF-8">
</head>

<body>
<h2 align=center>欢迎您</h2>
<center>
    <form action="/wxy/CheckLogin" method="post">
        <table border="1">
            <tr>
                <td>用户名：</td>
                <td><input name="userName"></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input name="password" type="password"></td>
            </tr>
            <tr align="center">
                <td colspan="2"><input type="submit" value="点击登陆"></td>
            </tr>
        </table>
    </form>
    还没注册？<a href="/wxy/toRegister">点击注册吧</a>
</center>
</body>
</html>
