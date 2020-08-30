<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>
        Customer List
    </title>

</head>
<body>

<div>
    <table>
        <tr>
            <th>
                Id
            </th>
            <th>
                First name
            </th>
            <th>
                Last name
            </th>
            <th>
                Free Passes
            </th>
            <th>
                Postal Code
            </th>
            <th>
                Course Code
            </th>
        </tr>

        <c:forEach var="customer" items="${customers}">

            <c:url var="updateLink" value="/customer/showFormUpdateCustomer">
                <c:param name="customerId" value="${customer.id}"/>
            </c:url>

            <c:url var="deleteLink" value="/customer/delete">
                <c:param name="customerId" value="${customer.id}"/>
            </c:url>
            <tr>
                <td>${customer.id}</td>
                <td>${customer.firstName}</td>
                <td>${customer.lastName}</td>
                <td>${customer.freePasses}</td>
                <td>${customer.postalCode}</td>
                <td>${customer.courseCode}</td>
                <td>
            <%--            display the update link--%>
                    <a href="${updateLink}">Update</a>
                    |
                    <a href="${deleteLink}"
                       onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
                </td>
            </tr>
        </c:forEach>

    </table>
</div>

<br>

<a href="/customer/showForm">Registration Form</a>

</body>
</html>