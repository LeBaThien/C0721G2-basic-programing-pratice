<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 10/27/2021
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h2>Customer List</h2>
<table border="1">
    <tr>
        <th>Customer id</th>
        <th>Name of Customer</th>
        <th>Date of birth</th>
        <th>Address</th>
        <th>Image</th>
    </tr>
    <c:forEach var="customerObj" items="${customerListServlet}" varStatus="loop">
        <tr>
            <td>${loop.count}</td>
                <%--        Loop . index thì tính bằng o , count thi tinh bằng 1--%>
            <td><c:out value="${customerObj.nameCustomer}"/></td>
            <td><c:out value="${customerObj.dateOfBirth}"/></td>
            <td><c:out value="${customerObj.customerAddress}"/></td>
            <td width="300px" style="text-align: center"><img src="<c:out value="${customerObj.customerImage}"/>" height="150px" width="150px"/>
            </td>

        </tr>
    </c:forEach>
</table>

</body>
</html>