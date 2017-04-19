<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Matts
  Date: 19.04.2017
  Time: 09:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>stats</title>
</head>
<body>
Values<br>
<c:forEach items="${valuesList}" var="v">
    <c:out value="${v.value}"></c:out><br>
</c:forEach>
<br>
Stats<br>
<c:out value="${statsJson}"></c:out>
</body>
</html>
