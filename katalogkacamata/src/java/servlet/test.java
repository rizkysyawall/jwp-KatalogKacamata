/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.util.List;
import javax.print.attribute.standard.MediaSize;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Putra Panji
 */
public class test extends HttpServlet {

    public static String kk = "";
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    private final String UPLOAD_DIRECTORY = "D:\\UAS JWP\\jwp fix\\katalogkacamata\\web\\image\\";
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ServletOutputStream out = response.getOutputStream();
        //process only if its multipart content
        if(ServletFileUpload.isMultipartContent(request)){
            String kk="";
            String ll="";
            int Result= 0;
            try {
                List<FileItem> multiparts = new ServletFileUpload(
                                         new DiskFileItemFactory()).parseRequest(request);
              
                for(FileItem item : multiparts){
                    if(!item.isFormField()){
                        String name = new File(item.getName()).getName();
                        kk = name.toString();
                        String uu = "image/";
                        ll = uu+kk;
//                        out.print(ll);
//                        out.println(kk);
                        item.write( new File(UPLOAD_DIRECTORY + File.separator + name));
                    }
                }
               String ss = "lolo";
                String sql = "INSERT INTO datakacamata (poto1) VALUES(?)";
                PreparedStatement statement = koneksi.koneksi.getConnection().prepareStatement(sql);
                statement.setString(1, ss);
                Result=statement.executeUpdate();
                if(Result>0){
                    System.out.println("Sukses");
                }else{
                    System.out.println("Failed");
                }
                 
                out.println(ss);
               //File uploaded successfully
               request.setAttribute("message", "File Uploaded Successfully");
            } catch (Exception ex) {
               request.setAttribute("message", "File Upload Failed due to " + ex);
            }          
         
        }else{
            request.setAttribute("message",
                                 "Sorry this Servlet only handles file upload request");
        }

//        response.setContentType("text/html;charset=UTF-8");
//        ServletOutputStream out = response.getOutputStream();
//        //process only if its multipart content
//        String name = "default", uu, ll="", hasil = "", y = "";
//        if (ServletFileUpload.isMultipartContent(request)) {
//            try {
//                
//                List<FileItem> multiparts = new ServletFileUpload(
//                        new DiskFileItemFactory()).parseRequest(request);
//
//                for (FileItem item : multiparts) {
//                    if (!item.isFormField()) {
//                        name = new File(item.getName()).getName();
//                        kk = name.toString();
//                        uu = "image/";
//                        ll = uu+kk;
//                        item.write(new File(UPLOAD_DIRECTORY + File.separator + name));
//                        
//                        //SIMPAN DATA
//                        int Result = 0;
//                        String NMobil = request.getParameter("Nmobil");
//                        String Harga = request.getParameter("harga");
//                        Harga = "Rp." + Harga;
//                        String deskripsi = request.getParameter("deskripsi");
//                        
//                        out.print(request.getParameter("p1"));
//                        
//                        String poto2 = "/home/panji/Desktop/jualbelimobil/web/image/download.jpg";
//                        String poto3 = "/home/panji/Desktop/jualbelimobil/web/image/download.jpg";
//                        String sql = "INSERT INTO datamobil (nama,harga,deskripsi,poto1,poto2,poto3) VALUES(?,?,?,?,?,?)";
//                        PreparedStatement statement = koneksi.koneksi.getConnection().prepareStatement(sql);
////               
//                        statement.setString(1, NMobil);
//                        statement.setString(2, Harga);
//                        statement.setString(3, deskripsi);
//                        statement.setString(4, ll);
//                        statement.setString(5, poto2);
//                        statement.setString(6, poto3);
//                        Result = statement.executeUpdate();
//                        if (Result > 0) {
//                            System.out.println("Sukses coyyyy");
//                            response.sendRedirect("admin");
//                        }
//                    }
//                }
//                
//                //File uploaded successfully
//                request.setAttribute("message", "File Uploaded Successfully");
//            } catch (Exception ex) {
//                request.setAttribute("message", "File Upload Failed due to " + ex);
//            }
//        } else {
//            request.setAttribute("message",
//                    "Sorry this Servlet only handles file upload request");
//            out.print("GAGAL");
//        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
