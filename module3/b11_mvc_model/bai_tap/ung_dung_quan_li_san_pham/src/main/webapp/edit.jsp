<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 10/29/2021
  Time: 7:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit customer</title>
</head>
<body>
<h1>Edit customer</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/product_servlet">Back to customer list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
<%--            <tr>--%>
<%--                <td>Product Id: </td>--%>
<%--                <td><input type="text" name="productId" id="productId" value="${requestScope["productList"].getProductId()}"></td>--%>
<%--            </tr>--%>
            <tr>
                <td>Product Name: </td>
                <td><input type="text" name="productName" id="productName" value="${requestScope["productList"].getProductName()}" ></td>

            </tr>
            <tr>
                <td>Price: </td>
                <td><input type="text" name="productPrice" id="productPrice" value="${requestScope["productList"].getProductPrice()}"></td>
            </tr>
            <tr>
                <td>Description: </td>
                <td><input type="text" name="productDescription" id="productDescription" value="${requestScope["productList"].getDescriptionProduct()}"></td>

            </tr>
            <tr>
                <td>Producer: </td>
                <td><input type="text" name="producer" id="producer" value="${requestScope["productList"].getProducer()}"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Update product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>