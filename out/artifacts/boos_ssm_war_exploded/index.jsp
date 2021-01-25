<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>首页</title>
    <style type="text/css">

    </style>
</head>
<body>

<h3>
    <form action="${pageContext.request.contextPath }/login"
          method="post">
        用户名：<input type="text" name="username" /><br />
        密&nbsp;&nbsp;&nbsp;码：<input type="text" name="password" /><br />
        <input type="submit" value="登录"/>
    </form>
</h3>
</body>
</html>