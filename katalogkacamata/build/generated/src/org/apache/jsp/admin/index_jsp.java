package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <!--         Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String name = (String) session.getAttribute("user");
            if (name == null) {
                response.sendRedirect("../proses/login");
            }
        
      out.write("\n");
      out.write("        <!--Import jQuery before materialize.js-->\n");
      out.write("        <div class=\"fluid-container\">\n");
      out.write("            <nav>\n");
      out.write("                <div class=\"nav-wrapper\">\n");
      out.write("                    <ul class=\"left\">\n");
      out.write("                        <li><a href=\"../proses/tambah\">Tambah Data</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    <a href=\"../proses/index\" class=\"brand-logo center\">Mobil Gue</a>\n");
      out.write("                    <ul id=\"nav-mobile\" class=\"right hide-on-med-and-down\">\n");
      out.write("                        <li><a href=\"badges.html\">Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"row\" style=\"height: 400px;\">\n");
      out.write("                ");

                    try {
                        String sql = "SELECT * FROM datakacamata";
                        ResultSet rs = null;
                        PreparedStatement st = koneksi.koneksi.getConnection().prepareStatement(sql);
                        rs = st.executeQuery();
      out.write("\n");
      out.write("                <table class=\"highlight\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Id</th>\n");
      out.write("                            <th>Nama Kacamata</th>\n");
      out.write("                            <th>Merk</th>\n");
      out.write("                            <th>Harga</th>\n");
      out.write("                            <th>Deskripsi</th>\n");
      out.write("                            <th>Action</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                while (rs.next()) {
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print( rs.getString("id"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("nama"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("merk"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("harga"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("deskripsi"));
      out.write("</td>\n");
      out.write("                            <td><a href=\"../proses/edit?id=");
      out.print( rs.getString("id"));
      out.write("\">EDIT</a> |  <a href=\"../proses/delete?id=");
      out.print( rs.getString("id"));
      out.write("&submit=hapus\">Hapus</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
                        
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("                ");
} catch (Exception e) {

                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
