<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="for" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    Student Registration Form
    <title>Student Registration Form</title>
    <link rel="stylesheet" type="text/css"

          href="${pageContext.request.contextPath}/resources/css/my-test.css">
</head>
<body>
<p>Response!</p>
<br>
<p>

    <form:form action="processedForm" modelAttribute="student">
        First name: <form:input path="firstName"/>
        <br>
        Last name: <form:input path="lastName"/>
        <br>
        Age: <form:input path="age"/>
        <br>
        Country:
<%--        Get items from map:--%>
                <form:select path="country">
                    <form:options items="${theCountryOptions}" /> <%--It means student.getCountries() which returns Hash Map countries--%>
                </form:select>
        <br>

        Choose favorite language: <form:radiobuttons path="favoriteLang" items="${student.favoriteLanguageOptions}"/>
        <br>

        Choose operation system:
        <form:checkboxes path="operationSystemOptions" items="${student.operationSystemMap}"/>

        <%--        It's hardcoded variant--%>
        <%--        Choose operation system:--%>
<%--        Linux <form:checkbox path="operationSystemOptions" value="Linux"/>--%>
<%--        Windows <form:checkbox path="operationSystemOptions" value="Windows"/>--%>
<%--        MacOS <form:checkbox path="operationSystemOptions" value="MacOS"/>--%>

        <%--        It's hardcoded variant--%>
<%--        Favourite programming language:--%>
<%--        Java: <for:radiobutton path="favoriteLang" value="Java"/>--%>
<%--        Ruby: <for:radiobutton path="favoriteLang" value="Ruby"/>--%>
<%--        C++: <for:radiobutton path="favoriteLang" value="C++"/>--%>
<%--        C#: <for:radiobutton path="favoriteLang" value="C#"/>--%>

<%--        It's hardcoded variant--%>
<%--        <form:select path="country">--%>
<%--        <form:option value="UKR" label="Ukraine"/>--%>
<%--        <form:option value="USA" label="United States"/>--%>
<%--        <form:option value="GBR" label="Great Britain"/>--%>
<%--    </form:select>--%>
        <br>
        <input type="submit" value="Save and Submit"/>

    </form:form>

</p>
</body>
</html>