<%@ page contentType="text/html; charset = UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Main page</title>
</head>
<body>
    <c:if test="${not empty stringParam}">
        <h2>Name: ${stringParam}</h2>
    </c:if>
    <c:if test="${not empty intParam}">
        <h2>Id: ${intParam}</h2>
    </c:if>
</body>
</html>
