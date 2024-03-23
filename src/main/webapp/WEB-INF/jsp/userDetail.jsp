<%--
  Created by IntelliJ IDEA.
  User: faisalloe
  Date: 3/10/24
  Time: 7:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Okta Spring MVC Example</title>
</head>
<body>
<div>okta profile user name: ${userName}</div>

<ul>
    <c:forEach items="${authorities} " var="auth">
        <li>${auth}</li>
    </c:forEach>
</ul>
<p>
    <a href="/spring_mvc_example_war">Go back</a>
</p>
</body>
</html>