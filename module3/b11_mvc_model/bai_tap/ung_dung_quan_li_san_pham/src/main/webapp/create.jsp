<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 10/28/2021
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/product_servlet">Back to Product List</a>
<br>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<fieldset> Creation Product Form
    <form  method="post">
<%--        <input type="hidden" name="action" value="create">--%>

        <p>Product id: <input type="text" name="productId"></p>
        <p>Product name: <input type="text" name="productName"></p>
        <p>Price: <input type="text" name="productPrice"></p>
        <p>Description: <input type="text" name="productDescription"></p>
        <p>Producer <input type="text" name="producer"></p>
        <p><input type="submit" value="addition"></p>

</fieldset>
</form>

</body>
</html>
