<%-- 
    Document   : index
    Created on : 16-Dec-2017, 15:15:36
    Author     : rizky
--%>

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
    <body data-spy="scroll" data-target=".navbar" data-offset="50">
        <%
            String name = (String) session.getAttribute("user");
            if (name == null) {
                response.sendRedirect("../proses/loginadmin");
            }
        %>
        <!--Import jQuery before materialize.js-->
        <div class="fluid-container">
            <nav class="navbar navbar-light bg-light">
                <a href="index"><img class="navbar-brand" src="../img/logo.png" width="50"><b>Sunglases Cataloge</b></a>
                <ul class="nav nav-pills">
                    <li class="nav-item">
                        <a class="nav-link bg-light" href="logoutadmin">Logout</a>
                    </li>
                </ul>

            </nav>  
            <div class="container mt-5">
                <h3 class="font-weight-bold text-center">Daftar List Kacamata</h3>
                <ul class="float-right">
                    <li><a href="../proses/tambah">Tambah Data</a></li>
                </ul>
            </div>
            <div class="container">
                <%
                    try {
                        String sql = "SELECT * FROM datakacamata";
                        ResultSet rs = null;
                        PreparedStatement st = koneksi.koneksi.getConnection().prepareStatement(sql);
                        rs = st.executeQuery();%>

                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nama Kacamata</th>
                            <th>Kategori</th>
                            <th>Harga</th>
                            <th>Deskripsi</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            while (rs.next()) {%>
                        <tr>
                            <td><%= rs.getString("id")%></td>
                            <td><%= rs.getString("nama")%></td>
                            <td><%= rs.getString("kategori")%></td>
                            <td><%= rs.getString("harga")%></td>
                            <td><%= rs.getString("deskripsi")%></td>
                            <td><a href="../proses/edit?id=<%= rs.getString("id")%>">EDIT</a> |  <a href="../proses/delete?id=<%= rs.getString("id")%>&submit=hapus">Hapus</a></td>
                        </tr>
                        <%}
                        %>
                    </tbody>
                </table>

                <%} catch (Exception e) {

                    }
                %>
            </div>
            <div class="container-fluid bg-light mt-4">
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
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
    </body>
</html>
