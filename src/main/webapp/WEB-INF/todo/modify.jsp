<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2025-05-06
  Time: 오후 4:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todo Modify</title>
</head>
<body>
    <form id="form1" action="/todo/modify" method="post">
        <div>
            <input type="text" name="tno" value="${dto.tno}" readonly>
        </div>
        <div>
            <input type="text" name="title" value="${dto.title}" readonly>
        </div>
        <div>
            <input type="date" name="dueDate" value="${dto.dueDate}">
        </div>
        <div>
            <input type="checkbox" name="finished" ${dto.finished ? "checked": ""} readonly>
        </div>
        <div>
            <button type="submit">Modify</button>
        </div>
    </form>

    <form id="form2" action="/todo/remove" method="post">
        <input type="hidden" name="tno" value="${dto.tno}" readonly>
        <div>
            <button type="submit">Remove</button>
        </div>
    </form>
</body>
</html>
