<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 11/7/2021
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Edit Customer</title>

</head>
<body>
<%--<div class="wrapper ">--%>
<%--    <div class="main-panel">--%>
<%--        <!-- Navbar -->--%>
<%--        <!-- End Navbar -->--%>
<%--        <div class="content">--%>
<%--            <div class="container-fluid">--%>
<%--                <div class="row">--%>
<%--                    <div class="col-12 text-center">--%>
<%--                        <h1>Are You sure for deleting the Customer below???</h1>--%>
<%--                    </div>--%>
<%--                    <form class="col-12" method="post">--%>
<%--                        <div class="form-group col-12">--%>
<%--                            <label class="col-12 ">Id:</label>--%>
<%--                            <input type="text" name="id" class="form-control col-12  mt-2"--%>
<%--                            &lt;%&ndash;                                   value="<c:out value='${customer.getCustomerId()}'/>" readonly>&ndash;%&gt;--%>
<%--                                   value="${customer.getCustomerId()}" readonly>--%>
<%--                        </div>--%>

<%--                        <div class="form-group col-12">--%>
<%--                            <label class="" for="a1">Name:</label>--%>
<%--                            <input id="a1" type="text" name="name" class="form-control col-12  mt-2"--%>
<%--                                   value="${customer.getCustomerName()}" readonly>--%>
<%--                        </div>--%>
<%--                        <div class="form-group col-12">--%>
<%--                            <label class="" for="a2">BirthDay:</label>--%>
<%--                            <input id="a2" type="date" name="birthDay" class="form-control col-12  mt-2"--%>
<%--                                   value="${customer.getCustomerBirthDay()}" readonly>--%>
<%--                        </div>--%>
<%--                        <div class="form-group col-12">--%>
<%--                            <label class="" for="a">Gender:</label>--%>

<%--                            <select name="gender" id="a" class="form-control col-12 float-left">--%>
<%--                                &lt;%&ndash;                                <input id="" type="text" name="name" class="form-control col-12  mt-2"&ndash;%&gt;--%>
<%--                                &lt;%&ndash;                                       value="${customer.getCustomerGender()}">&ndash;%&gt;--%>
<%--                                <c:if test="${customer.getCustomerGender() == 1}">--%>
<%--                                    <option value="1" readonly="" selected >Nam</option>--%>
<%--                                    <option value="0" readonly="" >Nữ</option>--%>
<%--                                </c:if>--%>
<%--                                <c:if test="${customer.getCustomerGender() == 0}">--%>
<%--                                    <option value="1" readonly="" >Nam</option>--%>
<%--                                    <option value="0" readonly="" selected>Nữ</option>--%>
<%--                                    &lt;%&ndash;                                    Selected là chọn mặc định&ndash;%&gt;--%>
<%--                                </c:if>--%>

<%--                            </select>--%>
<%--                        </div>--%>
<%--                        <div class="form-group col-12">--%>
<%--                            <label class="col-12 float-left">Id Card:</label>--%>
<%--                            <input type="text" name="idCard" class="form-control col-12  mt-2"--%>
<%--                                   value="${customer.getCustomerIdCard()}" readonly>--%>
<%--                        </div>--%>

<%--                        <div class="form-group col-12">--%>
<%--                            <label class="col-12 ">Phone:</label>--%>
<%--                            <input type="text" name="phone" class="form-control col-12 fmt-2"--%>
<%--                                   value="${customer.getCustomerPhone()}" readonly>--%>
<%--                        </div>--%>
<%--                        <div class="form-group col-12">--%>
<%--                            <label class="col-12 ">Address:</label>--%>
<%--                            <input type="text" name="address" class="form-control col-12 fmt-2"--%>
<%--                                   value="${customer.getCustomerAddress()}" readonly>--%>
<%--                        </div>--%>
<%--                        <div class="form-group col-12">--%>
<%--                            <label class="col-12 float-left">Customer Type:</label>--%>
<%--                            <select class="form-control" name="customerType">--%>
<%--                                <c:forEach var="type" items="${customerType}" >--%>
<%--                                    <c:choose>--%>
<%--                                        <c:when test="${type.customerTypeId == customer.getCustomerType().getCustomerTypeId()}">--%>
<%--                                            <option value="${type.customerTypeId}"--%>
<%--                                                    selected readonly=""> ${type.customerTypeName}</option>--%>
<%--                                        </c:when>--%>
<%--                                        <c:otherwise>--%>
<%--                                            <option value="${type.customerTypeId}" readonly="">${type.customerTypeName}</option>--%>
<%--                                        </c:otherwise>--%>
<%--                                    </c:choose>--%>
<%--                                </c:forEach>--%>

<%--                            </select>--%>
<%--                        </div>--%>
<%--                        <button type="submit" class="btn btn-primary float-right">Xóa</button>--%>
<%--                        <a href="/customerServlet"--%>
<%--                           role="button" class="btn btn-large btn-warning float-right">Back</a>--%>
<%--                    </form>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>
