<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 11/11/2021
  Time: 11:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post">
  <p>Input amount of USD: <input type="text" name="usd" placeholder="input usd"></p>
  <p>Input exchange rate (USD/VND): <input type="text" name="exchangeRate" placeholder="input exchange rate "></p>
  <button type="submit" value="result"> Result</button>
  </form>

  <span>Result is <p style="color: red"> ${exchange}</p> </span>
  </body>
</html>
