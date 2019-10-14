<%-- 
    Document   : edit
    Created on : 16-Dec-2017, 15:37:04
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
    <body>
        <%
            String name = (String) session.getAttribute("user");
            if (name == null) {
                response.sendRedirect("../proses/login");
            }
        %>
        <!--Import jQuery before materialize.js-->
        <div class="fluid-container">
            <nav class="navbar navbar-light bg-light">
                <a href="index"><img class="navbar-brand" src="../img/logo.png" width="50"><b>Sunglases Cataloge</b></a>
                <ul class="nav nav-pills">
                    <li class="nav-item">
                        <a class="nav-link bg-light" href="logout">Logout</a>
                    </li>
                </ul>

            </nav> 
            <div id="section1" class="container-fluid mt-5">
                <div class="main-login main-center">
                    <%try {
                            String query = "SELECT * FROM datakacamata WHERE id=?";
                            ResultSet rs = null;
                            String id = request.getParameter("id");
                            PreparedStatement st = koneksi.koneksi.getConnection().prepareStatement(query);
                            st.setString(1, id);
                            rs = st.executeQuery();
                            while (rs.next()) {%>
                    <form class="form-horizontal" action="../upload" method="post" enctype="multipart/form-data">
                        <h3 style="text-align: center">EDIT KACAMATA</h3>
                        <input type="text" hidden name="id"  value="<%= rs.getString("id")%>"><br>
                        <div class="container">
                            <div class="form-group">
                                <label for="Nkacamata" class="cols-sm-2 control-label font-weight-bold">Nama Kacamata</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon">N</span>
                                        <input type="text" class="form-control" id="Nkacamata" name="Nkacamata"  value="<%= rs.getString("nama")%>"/>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="harga" class="cols-sm-2 control-label font-weight-bold">Harga</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon">H</span>
                                        <input type="text" class="form-control" id="harga" name="harga"  value="<%= rs.getString("harga")%>"/>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="deskripsi" class="cols-sm-2 control-label font-weight-bold">Deskripsi</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon">D</span>
                                        <textarea class="form-control" id="deskripsi" name="deskripsi"><%= rs.getString("deskripsi")%></textarea>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="kategori" class="cols-sm-2 control-label font-weight-bold">Kategori</label>
                                <select class="form-control" name="kategori">
                                    <option value="" disabled selected>Pilih Kategori</option>
                                    <option value="anak" <%= rs.getString("kategori").equals("anak") ? "selected" : ""%>>Anak-anak</option>
                                    <option value="minus" <%= rs.getString("kategori").equals("minus") ? "selected" : ""%>>Minus</option>
                                    <option value="wanita" <%= rs.getString("kategori").equals("wanita") ? "selected" : ""%>>Wanita</option>
                                    <option value="pria" <%= rs.getString("kategori").equals("pria") ? "selected" : ""%>>Pria</option>
                                </select>
                            </div>


                            <div class="form-group ">
                                <input type="submit" class="btn btn-primary btn-lg btn-block login-button" value="Edit" name="edit">
                            </div>
                        </div>


                    </form>     

                </div>
                <%}
                    } catch (Exception e) {
                        System.out.println("Error" + e.getMessage());
                    }
                %>
            </div>
            <div class="container-fluid bg-light mt-5 ">
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

    </body>
</html>
