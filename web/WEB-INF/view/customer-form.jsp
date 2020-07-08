<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>
        Customer Registration Form
    </title>
    <style>
        .error{
            color: coral;
        }
    </style>

</head>
<body>

<form:form action="processedForm" modelAttribute="customer">

    Fill out the form:
    <br>
    First name: <form:input path="firstName"/>
    <br>
    Last name: (*) <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br>
    Free Passes: (0-10) <form:input path="freePasses"/>
    <form:errors path="freePasses" cssClass="error"/>
    <br>
    Postal Code: (5 chars/digits) <form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="error"/>
    <br>
    Course Code: <form:input path="courseCode"/>
    <form:errors path="courseCode" cssClass="error"/>
    <br>
    <input type="submit" value="Register">

</form:form>
</body>
</html>