<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>
        Customer Confirmation Form
    </title>
<%--    <style>--%>
<%--        .error{--%>
<%--            color: chartreuse;--%>
<%--        }--%>
<%-- </style>--%>

</head>
<body>

User ${customer.firstName} ${customer.lastName} is confirmed with ${customer.freePasses} free passes
<br>
Postal Code: ${customer.postalCode}

</body>
</html>