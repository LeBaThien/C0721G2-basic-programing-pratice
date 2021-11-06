<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 11/3/2021
  Time: 2:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Management</title>
    <%--    DataTables 1.10.21 support bootstrap <= 4.1.3--%>
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.min.css"/>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <form action="/customerServlet?action=findCustomer" method="post">
<%--        <input type="text" name="findName" placeholder="Nhập tên">--%>
<%--        <input type="text" name="findCustomerType" placeholder="Nhập CustomerType">--%>
<%--            <a href="/customerServlet?action=findCustomer">Tìm Kiếm</a>--%>
            <input type="text" name="findPhone" placeholder="Nhập phone" >
            <button type="submit"  > TÌm kiếm</button>

            </form>
            <%--            <button type="button" class="bg-success fw-bold " ><a href="/">Home</a></button>--%>
            <a class="btn btn-primary" href="/" role="button">Home</a>
            <table id="tableStudent" class="table table-striped table-bordered" style="width:100%">
                <thead>
                <tr style="height: 50px" class="text-center">
                    <th>Customer id</th>
                    <th>Name</th>
                    <th>Customer birthday</th>
                    <th>Gender</th>
                    <th>Id card</th>
                    <th>Phone</th>
                    <%--                    <th>Email</th>--%>
                    <th>Address</th>
                    <th>Customer Type</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="customer" items="${requestScope['customerList']}" varStatus="count">
                    <tr>
                        <td>${customer.customerId}</td>
                        <td>${customer.getCustomerName()}</td>
                        <td>${customer.getCustomerBirthDay()}</td>
                        <td>
                            <c:if test='${customer.getCustomerGender() == 1}'>
                                Nam
                            </c:if>
                            <c:if test='${customer.getCustomerGender() == 0}'>
                                Nữ
                            </c:if>

                        </td>
                        <td>${customer.getCustomerIdCard()}</td>
                        <td>${customer.getCustomerPhone()}</td>
                            <%--                        <td>${customer.getCustomerEmail()}</td>--%>
                        <td>${customer.getCustomerAddress()}</td>
                        <td>${customer.getCustomerType().getCustomerTypeName()}</td>

                        <td class="text-center">
                            <a href="/customerServlet?action=edit&id=${customer.getCustomerId()}"
                                <%--                            <a href="/customerServlet?action=edit"--%>
                               role="button" class="btn btn-large btn-warning">Edit</a>
<%--                            <a href="/customerServlet?action=delete&id=${customer.getCustomerId()}"--%>
<%--                                &lt;%&ndash;                            <a href="/customerServlet?action=edit"&ndash;%&gt;--%>
<%--                               role="button" class="btn btn-large btn-warning">Delete</a>--%>
                                                            <button type="button" class="btn btn-primary" data-toggle="modal"
                                                                    data-target="#exampleModal-${customer.getCustomerId()}">
                                                                Delete
                                                            </button>
                        </td>
                    </tr>
                    <!-- Modal -->
                    <div class="modal fade" id="exampleModal-${customer.getCustomerId()}" tabindex="-1" role="dialog"
                         aria-labelledby="exampleModalLabel" aria-hidden="true">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                    Bạn có chắc muốn xóa Customer có Id = ${customer.customerId} và Tên
                                    là: ${customer.customerName}
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                    <a href="/customerServlet?action=delete&id=${customer.customerId}" role="button"
                                       class="btn-danger"> Xác nhận </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../datatables/js/jquery.dataTables.min.js"></script>
<script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableStudent').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 4
        });
    });
</script>
</body>
</html>

