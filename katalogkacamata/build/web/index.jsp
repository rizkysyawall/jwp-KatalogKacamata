<%-- 
    Document   : index
    Created on : 16-Dec-2017, 14:15:01
    Author     : rizky
--%>

<%@page import="java.util.Base64"%>
<%@page import="java.sql.Blob"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </head>
    <body>
        <nav class="navbar fixed-top navbar-light bg-light">
            <a href="index"><img class="navbar-brand" src="../img/logo.png" width="50"><b>Sunglases Cataloge</b></a>
            <ul class="nav nav-pills">
                <li class="nav-item">
                    <a class="nav-link bg-4" href="#h1">Photo</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link bg-4" href="#h2">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link bg-4" href="#h3">What Did They Say ?</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link bg-4" href="#h4">New Product</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link bg-4" href="#h5">Contact</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link bg-light" href="login">Login</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link bg-light" href="daftar">Regist</a>
                </li>
            </ul>

        </nav>
        <div data-spy="scroll" data-target="#navbar-example2" data-offset="0">
            <div id="h1">
                <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                        <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img class="d-block w-100" src="../img/model1.png" alt="First slide">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100" src="../img/model2.png" alt="Second slide">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100" src="../img/model3.png" alt="Third slide">
                        </div>
                    </div>
                    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
            </div>

            <div id="h2">


                <div class="jumbotron jumbotron-fluid">
                    <div class="container-fluid bg-3 text-center">    
                        <h3 class="margin">What We Number 1?</h3><br>
                        <div class="row">
                            <div class="col-sm-4">
                                <p>Website kami mudah digunakan untuk berbagai pihak dan berbagai kalangan. Website ini diatur dengan design yang baik dan responsif.</p>
                                <img src="../img/easy.png" class="img-responsive margin" style="width:80%" alt="Image">
                            </div>
                            <div class="col-sm-4"> 
                                <p>Website kami mengandung sistem yang aman sehingga para pengguna tidak perlu takut data-data nya akan tercuri atau dibajak.</p>
                                <img src="../img/trusted.png" class="img-responsive margin" style="width:80%" alt="Image">
                            </div>
                            <div class="col-sm-4"> 
                                <p>Website kami selalu update di setiap minggunya, data-data kacamata selalu mengikuti mode masa kini. sehingga pengguna akan terus dimanjakan</p>
                                <img src="../img/update.png" class="img-responsive margin" style="width:80%" alt="Image">
                            </div>
                        </div>
                    </div>
                </div>
            </div>


            <div id="h3">

                <div class="jumbotron-fluid bg-light mb-3 mt-4"> 
                    <h3 class="d-block text-center">What Did They Say ?</h3>
                    <%
                        try {
                            String sql = "SELECT * FROM komentar order by id DESC LIMIT 6";
                            ResultSet rs = null;
                            PreparedStatement st = koneksi.koneksi.getConnection().prepareStatement(sql);
                            rs = st.executeQuery();%>
                    <div class="row">
                        <%
                            while (rs.next()) {
                        %>
                        <div class="col-sm-4 mt-4">
                            <div class="card mb-3" style="width:350px" >
                                <div class="card-header">
                                    <span class="card-title text-center"><b>Anonim</b></span><br>
<!--                                    <span class="card-title text-center"><%-- <%= rs.getString("id")%>--%></span>-->
                                    <span class="card-title text-center"><%= rs.getString("isikomen")%></span>
                                </div>
                            </div>
                        </div>

                        <%}
                        %>
                    </div>
                    <%} catch (Exception e) {
                            out.print(e.getMessage());
                        }
                    %>
                </div>
            </div>

            <div id="h4">
                <div class="container-fluid bg-3"> 
                    <%
                        try {
                            String sql = "SELECT nama, harga, deskripsi,kategori, photo FROM datakacamata order by id DESC LIMIT 6";
                            ResultSet rs = null;
                            PreparedStatement st = koneksi.koneksi.getConnection().prepareStatement(sql);
                            rs = st.executeQuery();%>
                    <div class="row">
                        <%
                            while (rs.next()) {
                                Blob blob = rs.getBlob("photo");
                                byte[] imgData = null;
                                imgData = blob.getBytes(1, (int) blob.length());
                                String imgDataBase64 = new String(Base64.getEncoder().encode(imgData));
                        %>
                        <div class="col-sm-4">
                            <div class="card mb-3" style="width:350px" >
                                <div class="card-header">
                                    <h4 class="card-title text-center"><%= rs.getString("nama")%></h4>
                                </div>
                                <div class="card-body">
                                    <img src="data:img/png;base64,<%= imgDataBase64%>" width="310">
                                    <div class="card-text text-center"><%= rs.getString("kategori")%></div>
                                    <div class="card-text text-center"><p><%= rs.getString("deskripsi")%></p>
                                    </div>
                                </div>
                                <div class="card-footer">
                                    <span class="white-text " style="margin-left: 30%;">Harga Rp.<%= rs.getString("harga")%></span>
                                </div>
                            </div>
                        </div>

                        <%}
                        %>
                    </div>
                    <%} catch (Exception e) {
                            out.print(e.getMessage());
                        }
                    %>
                </div>
            </div>



            <div id="h5">
                <div class="container-fluid bg-light ">
                    <h1 class="display-5">Hello, Good People!</h1>
                    <p class="lead">Ini adalah website kami dalam bidang informasi kacamata. kami harap kami dapat membantu kalian</p>
                    <hr class="my-4">
                    <p>Agar dapat lebih dekat dengan kami, kamu bisa klik akun kami dibawah ini :</p>
                    <ul class="float-left">
                        <li><a href="https://www.instagram.com/rizky_syawall/">Instagram</a></li>
                        <li><a href="https://web.facebook.com/rizky.phonser?ref=bookmarks">Facebook</a></li>
                        <li><a href="https://plus.google.com/u/1/109860317349491091279">Goggle +</a></li>

                    </ul>
                </div>
            </div>
        </div>
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
    </body>
</html>
