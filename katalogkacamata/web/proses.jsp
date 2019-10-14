<%-- 
    Document   : proses
    Created on : 16-Dec-2017, 13:47:42
    Author     : rizky
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if (request.getParameter("regist") != null && request.getParameter("regist").equals("Regist")) {

                String username = request.getParameter("username");
                String nama = request.getParameter("nama");
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                String jenkel = request.getParameter("jenkel");

                String sql = "INSERT INTO user (username, nama, email, password, jenkel)VALUES(?,?,?,?,?)";

                try {
                    PreparedStatement statement = koneksi.koneksi.getConnection().prepareStatement(sql);

                    statement.setString(1, username);
                    statement.setString(2, nama);
                    statement.setString(3, email);
                    statement.setString(4, password);
                    statement.setString(5, jenkel);
                    statement.executeUpdate();
                    System.out.println("SUkses");
                    response.sendRedirect("login");
                } catch (Exception e) {
                    System.out.println("Error" + e.getMessage());
                }
            } else if (request.getParameter("login") != null && request.getParameter("login").equals("Login")) {
                String email = request.getParameter("email");
                String password = request.getParameter("password");

                String sql = "SELECT password FROM user WHERE email=?";
                try {
                    ResultSet rs = null;
                    PreparedStatement statement = koneksi.koneksi.getConnection().prepareStatement(sql);
                    statement.setString(1, email);
                    rs = statement.executeQuery();
                    if (rs.next()) {
                        String resultpass = rs.getString("password");

                        if (email != null && password != null && resultpass != null && password.equals(resultpass)) {
                            session.setAttribute("user", email);
                            response.sendRedirect("home");
                        } else {
                            response.sendRedirect("login");
                        }

                    }

                } catch (Exception e) {
                    System.out.println("Error" + e.getMessage());
                }
            } else if (request.getParameter("submit") != null && request.getParameter("submit").equals("hapus")) {
                int Result = 0;
                String id = request.getParameter("id");
                System.out.println(id);
                String sql = "DELETE FROM datakacamata WHERE id=?";
                try {
                    PreparedStatement statement = koneksi.koneksi.getConnection().prepareStatement(sql);
                    statement.setString(1, id);
                    Result = statement.executeUpdate();
                    if (Result > 0) {
                        response.sendRedirect("admin");
                    } else {
                        System.out.println(Result);
                    }

                } catch (Exception e) {
                    System.out.println("Error" + e.getMessage());
                }

            } else if (request.getParameter("loginadmin") != null && request.getParameter("loginadmin").equals("Login")) {
                String email = request.getParameter("email");
                String password = request.getParameter("password");

                String sql = "SELECT password FROM admin WHERE email=?";
                try {
                    ResultSet rs = null;
                    PreparedStatement statement = koneksi.koneksi.getConnection().prepareStatement(sql);
                    statement.setString(1, email);
                    rs = statement.executeQuery();
                    if (rs.next()) {
                        String resultpass = rs.getString("password");

                        if (email != null && password != null && resultpass != null && password.equals(resultpass)) {
                            session.setAttribute("user", email);
                            response.sendRedirect("admin");
                        } else {
                            response.sendRedirect("loginadmin");
                        }

                    }

                } catch (Exception e) {
                    System.out.println("Error" + e.getMessage());
                }
            }else if (request.getParameter("koment") != null && request.getParameter("koment").equals("Koment")) {
                String isikomen = request.getParameter("isikomen");
                String email = request.getParameter("email");
                int Result=0;
                String sql = "INSERT into komentar (email, isikomen) VALUES (?,?)";
                try {
                    ResultSet rs = null;
                    PreparedStatement statement = koneksi.koneksi.getConnection().prepareStatement(sql);
                    statement.setString(1, email);
                    statement.setString(2, isikomen);
                    Result = statement.executeUpdate();
                    if(Result >0){
                    System.out.println("Sukses coyyyy");
                                        response.sendRedirect("home");
                }else{
                    out.print("error");}

//                    rs = statement.executeQuery();
//                    if (rs.next()) {
//                        String resultpass = rs.getString("password");
//
//                        if (email != null && password != null && resultpass != null && password.equals(resultpass)) {
//                            session.setAttribute("user", email);
//                            response.sendRedirect("admin");
//                        } else {
//                            response.sendRedirect("loginadmin");
//                        }
//
//                    }

                } catch (Exception e) {
                    System.out.println("Error" + e.getMessage());
                }
            }
        %>
    </body>
</html>
