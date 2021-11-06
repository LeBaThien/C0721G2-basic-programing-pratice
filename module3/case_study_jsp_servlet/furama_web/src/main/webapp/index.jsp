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
                        <li><a class="dropdown-item" href="/customerServlet">Edit Customer</a></li>
                        <li><a class="dropdown-item" href="/customerServlet">Delete Customer</a></li>
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
        <div class="col-lg-3 col-md-3 col-sm-3 bg-light">
            <div class="row fw-bold fs-5" style="margin-top: 50px">
                <form>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Email address</label>
                        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputPassword1" class="form-label">Password</label>
                        <input type="password" class="form-control" id="exampleInputPassword1">
                    </div>
                    <div class="mb-3 form-check">
                        <input type="checkbox" class="form-check-input" id="exampleCheck1">
                        <label class="form-check-label" for="exampleCheck1">Check me out</label>
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
            </div>
            <div class="row fw-bold fs-5"></div>
            <div class="row fw-bold fs-5"></div>
        </div>
        <div class="col-lg-9 col-md-9 col-sm-9 bg-light fs-6">
            <div class="container-fluid bg-3 text-center">
                <h3 class="margin text-center fs-3" style="margin-top: 30px">JOINING OUR CULINARY & RECREATIONAL EXPERIENCE</h3><br>
                <div class="row">
                    <div class="col-lg-4 col-md-4 col-sm-4">
                        <h4 class="fs-4 " style="color:darkgoldenrod;">CULINARY</h4>
                        <img src="https://furamavietnam.com/wp-content/uploads/2018/08/06-2.jpg" class="img-responsive margin" style="width:100%" alt="Image">
                        <p>The resort’s culinary experience features a mixture of the authentic and locally inspired Vietnamese,
                            Asian, Italian and other European cuisines plus the best imported steaks. The resort presents
                            guests with varied gastronomic venues – the hip and breezy bar overlooking the beach, the exclusive
                            Lagoon pool surrounded by a tropical garden, the true Italian flare offered at the Don Cipriani’s,
                            the refined Asian touch at Café Indochine or the authentic central Vietnam cuisine at the Danaksara.

                        </p>
<%--                        <img src="" class="img-responsive margin" style="width:100%" alt="Image">--%>

                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-4">
                        <h4 class="fs-4 " style="color:darkgoldenrod;">MEETING & EVENT</h4>
                        <img src="https://furamavietnam.com/wp-content/uploads/2018/10/02.-ICP-ICP_Furama_Danang_-Ball-Room-4.jpg" class="img-responsive margin" style="width:100%" alt="Image">
                        <p>A well-appointed International Convention Palace with ballrooms can accommodate up to 1,000 people in style,
                            with another ten function rooms for 50 to 300 people each. A variety of cultural-themed parties on the beach
                            or around the lagoon, in the ballrooms or outside the resort, with the surprising arrivals of VIPs from Helicopter
                            landing on the resort’s own Helipad…</p>

                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-4">
                        <h4 class="fs-4 " style="color:darkgoldenrod;">RECREATION</h4>
                        <img src="https://furamavietnam.com/wp-content/uploads/2018/07/RECREATION.jpg" class="img-responsive margin" style="width:100%" alt="Image">
                        <p>A full range of Water Sports will keep you busy. Stop by the Water Sport House where our
                            experienced staff are waiting to assist or train you in the use of any of our equipment.</p>
                    </div>
                </div>
            </div>
            <div class="row fw-bold fs-5"></div>
            <div class="row fw-bold fs-5"></div>

        </div>
    </div>

<script rel="script" src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
