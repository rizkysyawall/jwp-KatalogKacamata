<%-- 
    Document   : login
    Created on : 16-Dec-2017, 13:42:47
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
        <nav class="navbar navbar-light bg-light">
            <a href="index"><img class="navbar-brand" src="../img/logo.png" width="50"><b>Sunglases Cataloge</b></a>
            <ul class="nav nav-pills">
                <li class="nav-item">
                    <a class="nav-link bg-light" href="login">Login</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link bg-light" href="daftar">Regist</a>
                </li>
            </ul>

        </nav>   

        <div id="section1" class="container row-center mt-5">
            <div class="main-login main-center">
                <form class="form-horizontal" method="post" action="save">

                    <h4 class="text-center">LOGIN USER</h4>
                    <div class="form-group">
                        <label for="email" class="cols-sm-2 control-label"><b>Your Email</b></label>
                        <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon">E</span>
                                <input type="text" class="form-control" name="email" id="email"  placeholder="Enter your Email"/>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="password" class="cols-sm-2 control-label"><b>Password</b></label>
                        <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon">P</span>
                                <input type="password" class="form-control" name="password" id="password"  placeholder="Enter your Password"/>
                            </div>
                        </div>
                    </div>


                    <div class="form-group ">
                        <input type="submit" class="btn btn-primary btn-lg btn-block login-button" value="Login" name="login">
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

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
    </body>
</html>
