<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 11/1/2021
  Time: 10:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>find user by country</title>
</head>
<body>
<h2>
    <a href="users?action=users">List All Users</a>
</h2>

<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <tr>
                <th>Input Country Name:</th>
                <td>
                    <input type="text" name="country" id="country" size="15"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
