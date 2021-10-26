<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 10/26/2021
  Time: 1:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
  <title>Price discount calculator</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Price discount calculator</h2>
<form action="/calculator" method="post">
  <input placeholder="Enter product description: " type="text" name="productDescription" />
  <input placeholder="Enter list price: " type="text" name="listPrice" />
  <input placeholder="Enter discount percent: " type="text" name="discountPercent" />
  <input type = "submit" id = "submit" value = "Calculator discount"/>
</form>

</body>
</html>