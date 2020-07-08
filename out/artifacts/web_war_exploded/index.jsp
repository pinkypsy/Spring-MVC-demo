<!DOCTYPE html> <html>

<head>

  <link rel="stylesheet" type="text/css"

        href="${pageContext.request.contextPath}/resources/css/my-test.css">

  <script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>

</head>

<body>
<%%>
<h2>Spring MVC Demo - Home Page</h2>

<a href="reqform">Request Form</a>
<br>
<a href="student/showForm">Student Processing Form</a>

<br>
<a href="customer/showForm">Customer Registration Form</a>

<br>

<img src="${pageContext.request.contextPath}/resources/images/spring-logo.png" />

<br><br>

<input type="button" onclick="doSomeWork()" value="Click Me Baby"/>
<br><br><br>

</body>

</html>