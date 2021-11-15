<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 11/15/2021
  Time: 4:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, th, td {
        border: 1px solid black;
        border-collapse: collapse;
        }

    </style>
</head>
<body>
<h2>Citizen information</h2>
<table style="">
    <tr>
        <th>birthday</th>
        <th>gender</th>
        <th>national</th>
        <th>idCard</th>
        <th>vehicleMove</th>
        <th>vehicleNumber</th>
        <th>chairNumber</th>
    </tr>
    <tr>
        <td>${citizen.birthday}</td>
        <td>${citizen.gender}</td>
        <td>${citizen.national}</td>
        <td>${citizen.idCard}</td>
        <td> ${citizen.vehicleMove}</td>
        <td> ${citizen.vehicleNumber}</td>
        <td> ${citizen.chairNumber}</td>

    </tr>
    <tr>
        <th>startDate</th>
        <th>endDate</th>
        <th>movingInfo</th>
        <th>cityName</th>
        <th>districtName</th>
        <th>wardsName</th>
        <th>phone </th>
        <th>email</th>
    </tr>
    <tr>
        <td> ${citizen.startDate}</td>
        <td> ${citizen.endDate}</td>
        <td> ${citizen.movingInfo}</td>
        <td> ${citizen.cityName}</td>
        <td> ${citizen.districtName}</td>
        <td> ${citizen.wardsName}</td>
        <td>${citizen.phone}</td>
        <td>
            ${citizen.email}</td>
    </tr>
</table>

</body>
</html>
