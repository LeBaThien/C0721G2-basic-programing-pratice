<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 11/1/2021
  Time: 5:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Furama Management</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="">
    <link rel="stylesheet" href="css_add/furamastyle.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-success fs-5 fw-bold ">
    <div class="container-fluid">
        <a class="navbar-brand" href="#"><img
                src="https://cardy.vn/upload/images/san-pham/logo-diem-uu-dai/640x480/2/fvd.jpg"
                height="50px" width="100px"></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse " id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">About</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown1" role="button"
                       data-bs-toggle="dropdown" aria-expanded="false">
                        Employee
                    </a>
                    <ul class="dropdown-menu fs-6 bg-secondary fw-bold " aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="#">Add Employee</a></li>
                        <li><a class="dropdown-item" href="#">Edit Employee</a></li>
                        <li><a class="dropdown-item" href="#">Delete Employee</a></li>
                        <li><a class="dropdown-item" href="">Show Employee</a></li>
                    </ul>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown2" role="button"
                       data-bs-toggle="dropdown" aria-expanded="false">
                        Customer
                    </a>
                    <ul class="dropdown-menu fs-6 bg-secondary fw-bold" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="/customerServlet?action=create">Add Customer</a></li>
                        <li><a class="dropdown-item" href="#">Edit Customer</a></li>
                        <li><a class="dropdown-item" href="#">Delete Customer</a></li>
                        <li><a class="dropdown-item" href="/customerServlet">Show Customer</a></li>
                    </ul>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                       data-bs-toggle="dropdown" aria-expanded="false">
                        Service
                    </a>
                    <ul class="dropdown-menu fs-6 bg-secondary fw-bold" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="#">Add Service</a></li>
                        <li><a class="dropdown-item" href="#">Edit Service</a></li>
                        <li><a class="dropdown-item" href="#">Delete Service</a></li>
                        <li><a class="dropdown-item" href="#">Show Service</a></li>

                    </ul>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown3" role="button"
                       data-bs-toggle="dropdown" aria-expanded="false">
                        Contract
                    </a>
                    <ul class="dropdown-menu fs-6 bg-secondary fw-bold" aria-labelledby="navbarDropdown3">
                        <li><a class="dropdown-item" href="#">Add Contract</a></li>
                        <li><a class="dropdown-item" href="#">Edit Contract</a></li>
                        <li><a class="dropdown-item" href="#">Delete Contract</a></li>
                        <li><a class="dropdown-item" href="#">Show Contract</a></li>

                    </ul>
                </li>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>

<%--body--%>

<%--<div class="container">--%>
    <div class="row" style="height: 100%" >
        <div class="col-lg-3 col-md-3 col-sm-3 bg-primary">
            <div class="row fw-bold fs-5">Link1</div>
            <div class="row fw-bold fs-5">Link2</div>
            <div class="row fw-bold fs-5">Link3</div>
        </div>
        <div class="col-lg-7 col-sm-7 col-sm-7 bg-light fs-6">col-7</div>
    </div>
<%--</div>--%>



<%--<div class="container" id="footer" style="bottom: auto; width: 100%" >--%>
<%--    <footer class="py-5">--%>
<%--        <div class="row" >--%>
<%--            <div class="col-2">--%>
<%--                <h5>Developer</h5>--%>
<%--                <ul class="nav flex-column">--%>
<%--                    <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Home</a></li>--%>
<%--                    <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Features</a></li>--%>
<%--                    <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Pricing</a></li>--%>
<%--                    <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">FAQs</a></li>--%>
<%--                    <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">About</a></li>--%>
<%--                </ul>--%>
<%--            </div>--%>

<%--            <div class="col-2">--%>
<%--                <h5>Enterprise</h5>--%>
<%--                <ul class="nav flex-column">--%>
<%--                    <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Home</a></li>--%>
<%--                    <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Features</a></li>--%>
<%--                    <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Pricing</a></li>--%>
<%--                    <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">FAQs</a></li>--%>
<%--                    <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">About</a></li>--%>
<%--                </ul>--%>
<%--            </div>--%>

<%--            <div class="col-2">--%>
<%--                <h5>Company</h5>--%>
<%--                <ul class="nav flex-column">--%>
<%--                    <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Home</a></li>--%>
<%--                    <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Features</a></li>--%>
<%--                    <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Pricing</a></li>--%>
<%--                    <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">FAQs</a></li>--%>
<%--                    <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">About</a></li>--%>
<%--                </ul>--%>
<%--            </div>--%>

<%--            <div class="col-4 offset-1">--%>
<%--                <form>--%>
<%--                    <h5>Subscribe to our newsletter</h5>--%>
<%--                    <p>Monthly digest of whats new and exciting from us.</p>--%>
<%--                    <div class="d-flex w-100 gap-2">--%>
<%--                        <label for="newsletter1" class="visually-hidden">Email address</label>--%>
<%--                        <input id="newsletter1" type="text" class="form-control" placeholder="Email address">--%>
<%--                        <button class="btn btn-primary" type="button">Subscribe</button>--%>
<%--                    </div>--%>
<%--                </form>--%>
<%--            </div>--%>
<%--        </div>--%>

<%--        <div class="d-flex justify-content-between py-4 my-4 border-top">--%>
<%--            <p>&copy; 2021 Company, Inc. All rights reserved.</p>--%>
<%--            <ul class="list-unstyled d-flex">--%>
<%--                <li class="ms-3"><a class="link-dark" href="#">--%>
<%--                    <svg class="bi" width="24" height="24">--%>
<%--                        <use xlink:href="#twitter"/>--%>
<%--                    </svg>--%>
<%--                </a></li>--%>
<%--                <li class="ms-3"><a class="link-dark" href="#">--%>
<%--                    <svg class="bi" width="24" height="24">--%>
<%--                        <use xlink:href="#instagram"/>--%>
<%--                    </svg>--%>
<%--                </a></li>--%>
<%--                <li class="ms-3"><a class="link-dark" href="#">--%>
<%--                    <svg class="bi" width="24" height="24">--%>
<%--                        <use xlink:href="#facebook"/>--%>
<%--                    </svg>--%>
<%--                </a></li>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--    </footer>--%>
<%--</div>--%>
<script rel="script" src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
