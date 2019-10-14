<%-- 
    Document   : tambah
    Created on : 16-Dec-2017, 15:37:14
    Author     : rizky
--%>

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
                response.sendRedirect("../proses/loginadmin");
            }
        %>
        <!--Import jQuery before materialize.js-->
        <div class="fluid-container mb-5">
            <nav class="navbar navbar-light bg-light">
                <a href="index"><img class="navbar-brand" src="../img/logo.png" width="50"><b>Sunglases Cataloge</b></a>
                <ul class="nav nav-pills">
                    <li class="nav-item">
                        <a class="nav-link bg-light" href="logout">Logout</a>
                    </li>
                </ul>

            </nav> 

            <div class="container row-center mt-5">
                <div class="main-login main-center">
                    <form class="form-horizontal " action="../upload" method="post" enctype="multipart/form-data">
                        <h3 style="text-align: center">Tambah Data</h3>

                        <div class="form-group">
                            <label for="Nkacamata" class="cols-sm-2 control-label"><b>Nama Kacamata</b></label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon">N</span>
                                    <input type="text" class="form-control" id="Nkacamata" name="Nkacamata"  placeholder="Enter your sunglasses"/>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="harga" class="cols-sm-2 control-label"><b>Harga</b></label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon">H</span>
                                    <input type="text" class="form-control" id="harga" name="harga"  placeholder="Enter your Price"/>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="deskripsi" class="cols-sm-2 control-label"><b>Deskripsi</b></label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon">D</span>
                                    <textarea class="form-control" id="deskripsi" name="deskripsi"  placeholder="Enter your Desciption"></textarea>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="kategori" class="cols-sm-2 control-label"><b>Kategori</b></label>
                            <select class="form-control" name="kategori">
                                <option value="" disabled selected>Pilih Kategori</option>
                                <option value="anak">Anak-anak</option>
                                <option value="minus">Minus</option>
                                <option value="wanita">Wanita</option>
                                <option value="pria">Pria</option>
                            </select>
                        </div>

                        <div class="form-group">
                            <div class="btn">
                                <span><b>Pilih Foto</b></span>
                                <input type="file" name="photo">
                            </div>
                            <!--                            <div class="file-path-wrapper">
                                                            <input class="file-path validate" type="text" placeholder="Upload Photo">
                                                        </div>-->
                        </div>


                        <div class="form-group ">
                            <input type="submit" class="btn btn-primary btn-lg btn-block login-button" value="Tambah" name="tambah">
                        </div>

                    </form>
                </div>
            </div>

            <div class="container-fluid bg-light mt-5">
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
