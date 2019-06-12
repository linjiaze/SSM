<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" width="300">
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>MONEY</th>
    </tr>
    <c:forEach items="${accountList}" var="ac">
        <tr>
            <td>${ac.id}</td>
            <td>${ac.name}</td>
            <td>${ac.money}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
