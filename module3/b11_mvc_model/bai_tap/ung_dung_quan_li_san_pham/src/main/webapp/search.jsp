<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 10/31/2021
  Time: 2:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search form</title>
</head>
<body>
<p><a href="/product_servlet">Back to product list</a></p>
<form method="post">
<table>
    <tr>
        <td>Input Name: </td>
        <td><input value="${requestScope["productList"].getProductName()}"> </td>
    </tr>
    <tr>
        <td><input type="submit" value="Find product"></td>
    </tr>
</table>
</form>

</body>
</html>
