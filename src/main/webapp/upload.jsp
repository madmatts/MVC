<%--
  Created by IntelliJ IDEA.
  User: Matts
  Date: 19.04.2017
  Time: 09:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>upload</title>
</head>
<body>
<form action="/upload" method="post">
    Value
    <input id="value" name="value"/>
    <button id="submit" type="submit">Submit</button>
</form>

<form action="/uploadJson" method="post">
    Value (json)
    <textarea id="value" name="value"></textarea>

    <button id="submit" type="submit">Submit</button>
</form>
</body>
</html>
