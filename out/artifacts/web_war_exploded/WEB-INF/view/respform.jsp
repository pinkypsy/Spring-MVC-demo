<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" type="text/css"

          href="${pageContext.request.contextPath}/resources/css/my-test.css">
</head>
<body>
<p>Response!</p>
<br>
<p>Student name: ${param.studentName}</p>

<a href="respform2?studentName=${param.studentName}">Say Yo!</a>

</body>
</html>