<%-- 
    Document   : home
    Created on : 16-Dec-2017, 16:16:23
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
        <%
            String name = (String) session.getAttribute("user");

            if (name == null) {
                response.sendRedirect("../proses/login");
            }
        %>
        <nav class="navbar navbar-light bg-light">
            <a href="index"><img class="navbar-brand" src="../img/logo.png" width="50"><b>Sunglases Cataloge</b></a>
            <ul class="nav nav-pills">
                <li class="nav-item">
                    <a class="nav-link bg-light" href="logout">Logout</a>
                </li>
            </ul>

        </nav>
        <div class="">
            <div class="container-fluid">
                <form action="home" method="get">
                    <div class="form-group p-3">
                        <label><b>Sort By :</b></label>
                        <label>Pilih Kategori</label>
                        <select name="kategori">
                            <option value="Default">Kategori</option>
                            <option value="anak">Anak-anak</option>
                            <option value="minus">Minus</option>
                            <option value="wanita">Wanita</option>
                            <option value="pria">Pria</option>
                        </select>
                        <!--                    </div>
                                            <div class="form-group">-->
                        <label>Pilih Harga</label>
                        <select name="harga">
                            <option value="Default">Harga</option>
                            <option value="Mahal">Termahal</option>
                            <option value="Murah">Termurah</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <input type="submit" class="form-control btn btn-secondary"  value="Search" name="search">
                    </div>
                </form>
            </div>
        </div>

        <div class="container-fluid mb-3">
            <%
                if (request.getParameter("search") != null) {
                    String Kategori = request.getParameter("kategori");
                    String Harga = "";
                    Harga = request.getParameter("harga");
//                    out.print(Harga );
//                    out.print(Kategori);
                    if (Kategori.equals("Default") && Harga.equals("Murah")) {
                        try {
                            String sql = "SELECT nama, harga, deskripsi,kategori, photo FROM datakacamata ORDER BY harga";
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
                <div class="col-sm-3">

                    <div class="card mb-2" style="width:300px" >
                        <div class="card-header">
                            <h4 class="card-title text-center"><%= rs.getString("nama")%></h4>
                        </div>
                        <div class="card-body">
                            <img src="data:img/png;base64,<%= imgDataBase64%>" width="260">
                            <div class="card-text text-center "><%= rs.getString("kategori")%></div>
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
                    System.out.println(e.getMessage());
                }

            } else if (Kategori.equals("Default") && Harga.equals("Mahal")) {
                try {
                    String sql = "SELECT nama, harga, deskripsi,kategori, photo FROM datakacamata ORDER BY harga DESC";
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
                <div class="col-sm-3">

                    <div class="card mb-2" style="width:300px" >
                        <div class="card-header">
                            <h4 class="card-title text-center"><%= rs.getString("nama")%></h4>
                        </div>
                        <div class="card-body">
                            <img src="data:img/png;base64,<%= imgDataBase64%>" width="260">
                            <div class="card-text text-center "><%= rs.getString("kategori")%></div>
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
                    System.out.println(e.getMessage());
                }

            } else if (Kategori != null && Harga.equals("Default")) {
                try {
                    String sql = "SELECT nama, harga, deskripsi,kategori, photo FROM datakacamata WHERE kategori=?";
                    ResultSet rs = null;
                    PreparedStatement st = koneksi.koneksi.getConnection().prepareStatement(sql);
                    st.setString(1, Kategori);

                    rs = st.executeQuery();%>
            <div class="row">
                <%
                    while (rs.next()) {
                        Blob blob = rs.getBlob("photo");
                        byte[] imgData = null;
                        imgData = blob.getBytes(1, (int) blob.length());
                        String imgDataBase64 = new String(Base64.getEncoder().encode(imgData));
                %>
                <div class="col-sm-3">

                    <div class="card mb-2" style="width:300px" >
                        <div class="card-header">
                            <h4 class="card-title text-center"><%= rs.getString("nama")%></h4>
                        </div>
                        <div class="card-body">
                            <img src="data:img/png;base64,<%= imgDataBase64%>" width="260">
                            <div class="card-text text-center "><%= rs.getString("kategori")%></div>
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
                    System.out.println(e.getMessage());
                }

            } else if (Kategori != null && Harga.equals("Mahal")) {
                try {
                    String sql = "SELECT nama, harga, deskripsi,kategori,photo FROM datakacamata WHERE kategori=? ORDER BY harga DESC";
                    ResultSet rs = null;
                    PreparedStatement st = koneksi.koneksi.getConnection().prepareStatement(sql);
                    st.setString(1, Kategori);

                    rs = st.executeQuery();%>
            <div class="row">
                <%
                    while (rs.next()) {
                        Blob blob = rs.getBlob("photo");
                        byte[] imgData = null;
                        imgData = blob.getBytes(1, (int) blob.length());
                        String imgDataBase64 = new String(Base64.getEncoder().encode(imgData));
                %>
                <div class="col-sm-3">

                    <div class="card mb-2" style="width:300px" >
                        <div class="card-header">
                            <h4 class="card-title text-center"><%= rs.getString("nama")%></h4>
                        </div>
                        <div class="card-body">
                            <img src="data:img/png;base64,<%= imgDataBase64%>" width="260">
                            <div class="card-text text-center "><%= rs.getString("kategori")%></div>
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
                    System.out.println(e.getMessage());
                }

            } else if (Kategori != null && Harga.equals("Murah")) {
                try {
                    String sql = "SELECT nama, harga, deskripsi,kategori,photo FROM datakacamata WHERE kategori=? ORDER BY harga";
                    ResultSet rs = null;
                    PreparedStatement st = koneksi.koneksi.getConnection().prepareStatement(sql);
                    st.setString(1, Kategori);

                    rs = st.executeQuery();%>
            <div class="row">
                <%
                    while (rs.next()) {
                        Blob blob = rs.getBlob("photo");
                        byte[] imgData = null;
                        imgData = blob.getBytes(1, (int) blob.length());
                        String imgDataBase64 = new String(Base64.getEncoder().encode(imgData));
                %>
                <div class="col-sm-3">

                    <div class="card mb-2" style="width:300px" >
                        <div class="card-header">
                            <h4 class="card-title text-center"><%= rs.getString("nama")%></h4>
                        </div>
                        <div class="card-body">
                            <img src="data:img/png;base64,<%= imgDataBase64%>" width="260">
                            <div class="card-text text-center "><%= rs.getString("kategori")%></div>
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
                        System.out.println(e.getMessage());
                    }

                }
            } else {
                try {
                    String sql = "SELECT nama, harga, deskripsi,kategori, photo FROM datakacamata";
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
                <div class="col-sm-3">

                    <div class="card mb-2" style="width:300px" >
                        <div class="card-header">
                            <h4 class="card-title text-center"><%= rs.getString("nama")%></h4>
                        </div>
                        <div class="card-body">
                            <img src="data:img/png;base64,<%= imgDataBase64%>" width="260">
                            <div class="card-text text-center "><%= rs.getString("kategori")%></div>
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
                        System.out.println(e.getMessage());
                    }
                }

            %>
        </div>
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
            <form action="save" method="post"> 
            <div class="float-right">
                <span>Komentar</span>
                <textarea class="form-control" name="isikomen"></textarea>
             <a><input class="button bg-light" type="submit" name="koment" value="Koment"></a>
            </div>
            </form>
        </div>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
    </body>
</html>
