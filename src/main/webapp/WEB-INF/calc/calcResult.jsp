<%--
  Created by IntelliJ IDEA.
  User: omea9
  Date: 2025-06-07
  Time: 오전 2:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>NUM1 ${param.num1}</h1>
    <h1>NUM2 ${param.num2}</h1>

    <!-- 문자열타입으로 정수화해야됨 -->
    <h1>SUM ${Integer.parseInt(param.num1) + Integer.parseInt(param.num2)}</h1>
</body>
</html>
