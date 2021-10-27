<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 10/27/2021
  Time: 12:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/calculate" method="post">

<%--    action ni phải dùng như vậy nó mới chinh xác--%>
    <h2>First operand <input type="text" name="first-Operand"></h2>
    <h2>Operand <select name="operator">
      <option value="+">Addition</option>
      <option value="-">Subtraction</option>
      <option value="*">Multiplication</option>
      <option value="/">Division</option>
    </select></h2>
    <h2>Second operand <input type="text" name="second-Operand"></h2>
    <h2><input type="submit" value="Calculate"></h2>
<%--    <%=request.getAttribute("resultFromServlet")%>--%>

  </form>
  <h2>result is: <c:out value="${resultFromServlet}"/></h2>
  </body>
</html>