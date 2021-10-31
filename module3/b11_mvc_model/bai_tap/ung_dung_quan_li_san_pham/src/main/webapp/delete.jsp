<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 10/29/2021
  Time: 7:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Product</title>
</head>
<body>
<h1>Delete Product</h1>
<div>
    <c:if test="${message!=null}">
        <span class="message">${message}</span>
    </c:if>
</div>
<div>
    <a href="/product_servlet">Back to Product List</a>
</div>
<form method="post">
    <h3>Are you sure for deleting this product?</h3>
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td>${requestScope["productList"].getProductName()}</td>
            </tr>
            <tr>
                <td>Description:</td>
                <td>${requestScope["productList"].getDescriptionProduct()}</td>
            </tr>
            <tr>
                <td>Price:</td>
                <td>${requestScope["productList"].getProductPrice()}</td>
            </tr>
            <tr>
                <td>Brand:</td>
                <td>${requestScope["productList"].getProducer()}</td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <button type="submit">Delete Product</button>
                </td>
            </tr>
        </table>
    </fieldset>

</form>
</body>
</html>