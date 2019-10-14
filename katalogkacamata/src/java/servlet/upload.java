/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Putra Panji
 */

@MultipartConfig(maxFileSize = 16177215)
public class upload extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        ServletOutputStream out = response.getOutputStream();
      
         
        if(request.getParameter("tambah") != null && request.getParameter("tambah").equals("Tambah")){
            
        
        
        int Result= 0;
        String Nkacamata= request.getParameter("Nkacamata");
        int Harga = Integer.parseInt(request.getParameter("harga"));
        Harga = Harga;
        String deskripsi = request.getParameter("deskripsi");
        String kategori = request.getParameter("kategori");
        Part part = request.getPart("photo");
        
        String photo=  "../img/";
       
            try {
                String sql ="INSERT INTO datakacamata (nama,harga,deskripsi,kategori,photo) VALUES(?,?,?,?,?)";
                PreparedStatement statement = koneksi.koneksi.getConnection().prepareStatement(sql);
                InputStream is = part.getInputStream();
                statement.setString(1, Nkacamata);
                statement.setInt(2, Harga);
                statement.setString(3, deskripsi);
                statement.setString(4, kategori);
                statement.setBlob(5, is);
      
                Result=statement.executeUpdate();
                if(Result >0){
                    System.out.println("Sukses coyyyy");
                    response.sendRedirect("admin");
                }
            } catch (Exception e) {
                System.out.println("Error"+e.getMessage());
            }
            
            
        }else if(request.getParameter("edit") != null && request.getParameter("edit").equals("Edit")){
                
                String id = request.getParameter("id");
                String Nkacamata = request.getParameter("Nkacamata");
                int harga = Integer.parseInt(request.getParameter("harga"));
                String deskripsi = request.getParameter("deskripsi");
                String kategori = request.getParameter("kategori");
               // Part part = request.getPart("photo");
                int Result = 0;
                String sql ="UPDATE datakacamata SET nama=?, harga=?, deskripsi=?, kategori=? WHERE id=?";
                
                try{
                    PreparedStatement statement = koneksi.koneksi.getConnection().prepareStatement(sql);
                    //InputStream is = part.getInputStream();                    
                    statement.setString(1, Nkacamata);
                    statement.setInt(2, harga);
                    statement.setString(3, deskripsi);
                    statement.setString(4, kategori);
//                    statement.setBlob(5, is);
                    statement.setString(5, id);
                    Result=statement.executeUpdate();
                    if(Result > 0){
                        response.sendRedirect("admin");
                    }
                    
                    System.out.println("SUkses");
                }catch(Exception e){
                    System.out.println("Error"+e.getMessage());
                }
            }else if(request.getParameter("regist") != null && request.getParameter("regist").equals("Regist")){
           
                String username = request.getParameter("username");
                String nama = request.getParameter("nama");
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                String jenkel = request.getParameter("jenkel");
                
                String sql ="INSERT INTO admin (username, nama, email, password, jenkel)VALUES(?,?,?,?,?)";
                
                try{
                    PreparedStatement statement = koneksi.koneksi.getConnection().prepareStatement(sql);
                    statement.setString(1, username);
                    statement.setString(2, nama);
                    statement.setString(3, email);
                    statement.setString(4, password);
                    statement.setString(5, jenkel);
                    statement.executeUpdate();
                    System.out.println("SUkses");
                    response.sendRedirect("proses/loginadmin");
                }catch(Exception e){
                    System.out.println("Error"+e.getMessage());
                }
            }
                
            
    }
   

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   

}
