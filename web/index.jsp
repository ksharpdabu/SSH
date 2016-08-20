<%--
  Created by IntelliJ IDEA.
  User: AlexY
  Date: 2016/8/20
  Time: 2:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>注册</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/userAction_register" method="post">
    用户名：<input type="text" name="username"/> <br/>
    密码：<input type="password" name="password"/> <br/>
    年龄：<input type="text" name="age"/> <br/>
    <input type="submit" />
  </form>
  </body>
</html>
