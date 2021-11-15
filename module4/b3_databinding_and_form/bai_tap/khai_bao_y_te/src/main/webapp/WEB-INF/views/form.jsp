<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 11/15/2021
  Time: 3:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>$Title$</title>
    <style>
        table {
            border: 1px solid black;
            border-collapse: collapse;
        }

    </style>
</head>
<body>
<h2 style="text-align: center">TỜ KHAI Y TẾ</h2>
<h4 STYLE="text-align:center">ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CÁC CƠ QUAN Y TẾ LIÊN LAC KHI
    CẦN THIÊT ĐỂ PHÒNG CHỐNG DỊCH </h4>
<h6 style="text-align: center;color: red"> Khuyễn cáo: Khai thông tin sai là vi phạm pháp luât</h6>
<form:form action="/result" method="post" modelAttribute="citizen">
    <table style="font-weight: bold;width: 100%; ; background-color: aqua">
        <tr>
            <td><form:label path="name" for="name1"><strong>Họ và tên: </strong></form:label></td>

        </tr>
        <tr>
            <td><form:input path="name" id="name1"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="birthday">Năm sinh</form:label></td>
            <td><form:label path="gender">Giới tính</form:label></td>
            <td><form:label path="national">Quốc tịch</form:label></td>
        </tr>
        <tr>
            <td><form:input path="birthday" type="date"></form:input></td>
            <td><form:select path="gender">
                <form:options items="${gender}"></form:options>
            </form:select></td>
            <td><form:select path="national">
                <form:options items="${national}"></form:options>
            </form:select></td
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td><form:label path="idCard" for="cmnd">CMND (The can cuoc cong dan): </form:label></td>
        </tr>
        <tr>
            <td><form:input path="idCard" id="cmnd"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="vehicleMove" for="vehicle">Thông tin đi lại: </form:label></td>
        </tr>
        <tr>
            <td><form:radiobuttons path="vehicleMove" id="vehicle" items="${vehicle}"></form:radiobuttons></td>
        </tr>
        <tr>
            <td><form:label path="vehicleNumber" for="vehicleNumber">Số hiệu phương tiện : </form:label></td>
        </tr>
        <tr>
            <td><form:input path="vehicleNumber" id="vehicleNumber"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="startDate" for="startDate">Ngày khởi hành </form:label></td>
            <td><form:label path="endDate" for="endDate">Ngày kết thúc </form:label></td>

        </tr>
        <tr>
            <td><form:input path="startDate" id="startDate" type="date"></form:input></td>
            <td><form:input path="endDate" id="endDate" type="date"></form:input></td>
        </tr>
        <tr>
            <td>Địa chỉ liên lạc</td>
        </tr>
        <tr>
            <td><form:label path="cityName" for="cityName"></form:label>Tỉnh/thành phố</td>
            <td><form:label path="districtName" for="district"></form:label>Quận/huyện</td>
            <td><form:label path="wardsName" for="wardsName"></form:label>Phường/xã</td>
            <td></td>
        </tr>
        <td><form:select path="cityName" id="cityName">
            <form:options items="${cityName}"></form:options>
        </form:select></td>
        <td><form:select path="districtName" id="districtName">
            <form:options items="${districtName}"></form:options>
        </form:select></td>
        <td><form:select path="wardsName" id="wardsName">
            <form:options items="${wardsName}"></form:options>
        </form:select></td>
        <tr>
            <td><form:label path="phone" for="phone"></form:label>Số điện thoai</td>
            <td><form:label path="email" for="email"></form:label>Email</td>
        </tr>
        <tr>
            <td><form:input path="phone" id="phone"></form:input> </td>
            <td><form:input path="email" id="email"></form:input> </td>
        </tr>
        <tr>
            <td><input type="submit" value="Send"></td>
        </tr>
    </table>
    <h3 style="color: red; font-weight: bold"> Dữ liệu bạn cung cấp hoàn toàn bảo mật và chỉ phục vụ cho việc phòng chống dịch</h3>
</form:form>
</body>
</html>
