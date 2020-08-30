<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    Student Confirmation Form
    <title>Student Confirmation Form</title>
    <link rel="stylesheet" type="text/css"
    <%--the correct app name in curly braces--%>
    href="${pageContext.request.contextPath}/resources/css/my-test.css">
</head>
<body>
<p>
    The student is confirmed
    <br>
    Student FN: "${student.firstName}"
    <br>
    Student LN: "${student.lastName}"
    <br>
    Student Age: "${student.age}"
    <br>
    Student country: "${student.country}"
    <br>
    Favorite language: "${student.favoriteLang}"
    <br>
    Operation systems:
    <ol>
    <c:forEach var="customer" items="${student.operationSystemOptions}">
    <li>${customer}</li>
    </c:forEach>
    </ol>
</p>
<br>
<p>


</p>
</body>
</html>