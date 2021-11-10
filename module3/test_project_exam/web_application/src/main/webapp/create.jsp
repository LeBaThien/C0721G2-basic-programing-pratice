<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 11/7/2021
  Time: 11:23 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add customer</title>
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.min.css"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</head>
<body>
<h2>borrow</h2>
<div class="wrapper ">
    <div class="main-panel">
        <!-- Navbar -->
        <!-- End Navbar -->
        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-12 text-center">
                        <%--                        <h1>Thêm khách hàng</h1>--%>
                    </div>
                    <%--                    <c:if test='${requestScope["message"] != null}'>--%>
                    <%--                        <span class="col-12 border bg-light">${requestScope["message"]}</span>--%>
                    <%--                    </c:if>--%>
                    <form class="col-12" method="post">
                        <div class="form-group col-12">
                            <label class="col-12 float-left" for="exampleInputRa1">Mã Sách Mượn</label>
                            <input type="text" name="idBookCard" class="form-control col-12 float-left mt-2"
                                   id="exampleInputRa1" placeholder="Enter ">
                            <p style="color: red">
                                <c:if test="${idError != null}">
                                    ${idError}
                                </c:if>
                            </p>
                        </div>
                        <div class="form-group col-12">
                            <label class="col-12 float-left" for="exampleInputRa2">Tên Sách</label>
                            <input type="text" name="name" class="form-control col-12 float-left mt-2"
                                   id="exampleInputRa2" placeholder="Enter ">
                        </div>
                        <div class="form-group col-12">
                            <label class="col-12 float-left mt-1" for="exampleInputPosition1">Trạng thái</label>
                            <select name="status" id="exampleInputPosition1" class="form-control col-12 float-left">
                                <option>Chose option ...</option>
<%--                                <c:forEach var="item" items="${requestScope['status']}">--%>
<%--                                    &lt;%&ndash;                                    <option value="${item.getCustomerTypeId()}"> ${item.getCustomerTypeId()} - ${item.getCustomerType()} </option>&ndash;%&gt;--%>
<%--                                    <option value="${item.getCustomerTypeId()}"> ${item.getCustomerTypeId()} - ${item.getCustomerTypeName()} </option>--%>
<%--                                </c:forEach>--%>
                            </select>
                        </div>

                        <div class="form-group col-12">
                            <label class="col-12 float-left" for="exampleInputVao">Tên học sinh:</label>
                            <input type="text" name="nameStudent" class="form-control col-12 float-left mt-2"
                                   id="exampleInputVao" placeholder="Enter ">
                            <p style="color: red">
                                <c:if test="${nameError != null}">
                                    ${nameError}
                                </c:if>
                            </p>
                        </div>
                        <div class="form-group col-12">
                            <label class="col-12 float-left" for="exampleInputRa">Ngày Mượn sách</label>
                            <input type="date" name="startDate" class="form-control col-12 float-left mt-2"
                                   id="exampleInputRa" placeholder="Enter ">
                            <p style="color: red">
                                <c:if test="${dateError != null}">
                                    ${dateError}
                                </c:if>
                            </p>
                        </div>
                        <div class="form-group col-12">
                            <label class="col-12 float-left" for="exampleInputRa3">Ngày trả sách</label>
                            <input type="date" name="endDate" class="form-control col-12 float-left mt-2"
                                   id="exampleInputRa3" placeholder="Enter ">
                        </div>
<%--                        <div class="form-group col-12">--%>
<%--                            <label class="col-12 float-left" for="exampleInputLyDo">Gender:</label>--%>
<%--                            <select name="gender" id="exampleInputLyDo" class="form-control col-12 float-left">--%>
<%--                                <option value="1">Nam</option>--%>
<%--                                <option value="0">Nữ</option>--%>

<%--                                &lt;%&ndash;                            <input type="text" name="gender" class="form-control col-12 float-left mt-2"&ndash;%&gt;--%>
<%--                                &lt;%&ndash;                                   id="exampleInputLyDo" placeholder="Enter ">&ndash;%&gt;--%>
<%--                            </select>--%>
<%--                        </div>--%>
                        <div class="form-group col-12">
                            <p style="color: red">
<%--                                <c:if test="${idCardError != null}">--%>
<%--                                    ${idCardError}--%>
<%--                                </c:if>--%>
                            </p>
                        </div>

                        <br>
                        <button type="submit" class="btn btn-primary float-right">Borrow</button>
                        <a href="/productServlet"><button type="button" class="btn btn-info float-right">Back</button></a>
                    </form>
                </div>
            </div>
        </div>
        <%-- Footer --%>
    </div>
</div>

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
