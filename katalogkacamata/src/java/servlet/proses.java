/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author syawall
 */
public class proses extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try(PrintWriter out = response.getWriter()){
            String path = request.getPathInfo();
                if(path.equals("/login")){
                        RequestDispatcher dispatcher = request.getRequestDispatcher("../login.jsp");
                        
                        dispatcher.forward(request, response);
                }else if(path.equals("/daftar")){
                        RequestDispatcher dispatcher = request.getRequestDispatcher("../register.jsp");
                        
                        dispatcher.forward(request, response);
                }else if(path.equals("/index")){
                        RequestDispatcher dispatcher = request.getRequestDispatcher("../index.jsp");
                        
                        dispatcher.forward(request, response);
                }else if(path.equals("/admin")){
                        RequestDispatcher dispatcher = request.getRequestDispatcher("../admin/index.jsp");
                        
                        dispatcher.forward(request, response);
                }else if(path.equals("/tambah")){
                        RequestDispatcher dispatcher = request.getRequestDispatcher("../admin/tambah.jsp");
                        
                        dispatcher.forward(request, response);
                }else if(path.equals("/edit")){
                        RequestDispatcher dispatcher = request.getRequestDispatcher("../admin/edit.jsp");
//                            RequestDispatcher dispatcher = request.getRequestDispatcher("../admin/edit.jsp?id=" + path.substring(path.indexOf("/edit") + 6));
                        
                        dispatcher.forward(request, response);
                }else if(path.equals("/delete")){
                        RequestDispatcher dispatcher = request.getRequestDispatcher("../proses.jsp");
//                            RequestDispatcher dispatcher = request.getRequestDispatcher("../admin/edit.jsp?id=" + path.substring(path.indexOf("/edit") + 6));
                        
                        dispatcher.forward(request, response);
                }else if(path.equals("/home")){
                        RequestDispatcher dispatcher = request.getRequestDispatcher("../home.jsp");
//                            RequestDispatcher dispatcher = request.getRequestDispatcher("../admin/edit.jsp?id=" + path.substring(path.indexOf("/edit") + 6));
                        
                        dispatcher.forward(request, response);
                }else if(path.equals("/daftaradmin")){
                        RequestDispatcher dispatcher = request.getRequestDispatcher("../admin/regist.jsp");
//                            RequestDispatcher dispatcher = request.getRequestDispatcher("../admin/edit.jsp?id=" + path.substring(path.indexOf("/edit") + 6));
                        
                        dispatcher.forward(request, response);
                }else if(path.equals("/loginadmin")){
                        RequestDispatcher dispatcher = request.getRequestDispatcher("../admin/login.jsp");
//                            RequestDispatcher dispatcher = request.getRequestDispatcher("../admin/edit.jsp?id=" + path.substring(path.indexOf("/edit") + 6));
                        
                        dispatcher.forward(request, response);
                }else if(path.equals("/logout")){
                        RequestDispatcher dispatcher = request.getRequestDispatcher("../logout.jsp");
//                            RequestDispatcher dispatcher = request.getRequestDispatcher("../admin/edit.jsp?id=" + path.substring(path.indexOf("/edit") + 6));
                        
                        dispatcher.forward(request, response);
                } else if(path.equals("/logoutadmin")){
                        RequestDispatcher dispatcher = request.getRequestDispatcher("../admin/logout.jsp");
//                            RequestDispatcher dispatcher = request.getRequestDispatcher("../admin/edit.jsp?id=" + path.substring(path.indexOf("/edit") + 6));
                        
                        dispatcher.forward(request, response);
                }
//                
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try(PrintWriter out = response.getWriter()){
                //out.println(request.getMethod());
//                String path = request.getPathInfo();
//                out.print(path);
                    String path = request.getPathInfo();
                  if(path.equals("/save")){
                      RequestDispatcher dispatcher = request.getRequestDispatcher("../proses.jsp");
                        
                        dispatcher.forward(request, response);
                  }
            }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   

}
