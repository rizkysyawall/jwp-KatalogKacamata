package org.apache.jsp;

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
      out.write("    <body data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>                        \n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index\">SUNGLASSES CATALOGE</a>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li><a href=\"#section1\">HOME</a></li>\n");
      out.write("                            <li><a href=\"#section2\">ABOUT</a></li>\n");
      out.write("                            <li><a href=\"#section3\">CONTACT</a></li>\n");
      out.write("                            <li><a href=\"daftar\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("                            <li><a href=\"login\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>    \n");
      out.write("\n");
      out.write("        <div id=\"section1\" class=\"\">\n");
      out.write("            <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <!-- Indicators -->\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("                </ol>\n");
      out.write("\n");
      out.write("                <!-- Wrapper for slides -->\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"item active\">\n");
      out.write("                        <img src=\"../img/model1.png\" alt=\"Los Angeles\" width=\"1500\" height=\"900\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"../img/model2.png\" alt=\"Chicago\" width=\"1500\" height=\"900\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"../img/model3.png\" alt=\"New York\" width=\"1500\" height=\"900\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Left and right controls -->\n");
      out.write("                <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("                    <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"section2\" class=\"container-fluid\">\n");
      out.write("            <!-- Third Container (Grid) -->\n");
      out.write("            <div class=\"container-fluid bg-3 text-center\">    \n");
      out.write("                <h3 class=\"margin\">What We Number 1?</h3><br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <p>Katalog yang kami sediakan mudah untuk digunakan bagi semua kalangan. dengan sistem yang baik dan responsif</p>\n");
      out.write("                        <img src=\"../img/easy.png\" class=\"img-responsive margin center-block\" style=\"width:80%\" alt=\"Image\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\"> \n");
      out.write("                        <p>Katalog kacamata yang kami tampilkan terpercaya dari seluruh dunia. dan data yang sudah anda daftarkan menjadi tanggung jawab kami.</p>\n");
      out.write("                        <img src=\"../img/trusted.png\" class=\"img-responsive margin center-block\" style=\"width:80%\" alt=\"Image\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\"> \n");
      out.write("                        <p>Katalog kacamata kami selalu update minimal satu minggu sekali, guna untuk memuaskan pengguna dan sebagai katalog yang baik.</p>\n");
      out.write("                        <img src=\"../img/update.png\" class=\"img-responsive margin center-block\" style=\"width:80%\" alt=\"Image\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");

            try {
                String sql = "SELECT nama, harga, deskripsi,kategori, photo FROM datakacamata LIMIT 6";
                ResultSet rs = null;
                PreparedStatement st = koneksi.koneksi.getConnection().prepareStatement(sql);
                rs = st.executeQuery();
      out.write("\n");
      out.write("        <div class=\"row bg-success\">\n");
      out.write("            <div class=\"col lg-12\">\n");
      out.write("                ");

                    while (rs.next()) {
      out.write("\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"card bg-danger\" style=\"width:400px\" >\n");
      out.write("                        <div class=\"card-header\">\n");
      out.write("                            <h4 class=\"card-title\" style=\"margin-left: 30%;\">");
      out.print( rs.getString("nama"));
      out.write("</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <img class=\"card-img center-block\" src=\"");
      out.print( rs.getString("photo"));
      out.write("\">\n");
      out.write("                            <div class=\"card-text \" style=\"margin-left: 30%;\">");
      out.print( rs.getString("kategori"));
      out.write("</div>\n");
      out.write("                            <div class=\"card-text \" style=\"margin-left: 30%;\">\n");
      out.write("                                <p>");
      out.print( rs.getString("deskripsi"));
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer\">\n");
      out.write("                            <span class=\"white-text \" style=\"margin-left: 30%;\">Harga Rp.");
      out.print( rs.getString("harga"));
      out.write("</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");
}
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
} catch (Exception e) {
                out.print(e.getMessage());
            }
        
      out.write("\n");
      out.write("        <div id=\"section3\" class=\"container-fluid panel-footer\">\n");
      out.write("            <!-- Footer -->\n");
      out.write("            <footer class=\"container-fluid bg-4 text-left\">\n");
      out.write("                <p><a href=\"#\"><span class=\"glyphicon glyphicon-envelope\"></span></a> Rizqiesyawall@gmail.com</p>\n");
      out.write("                <p><a href=\"#\"><span class=\"glyphicon glyphicon-phone\"></span></a> 089602738485</p>\n");
      out.write("                <p><a href=\"#\"><span class=\"glyphicon glyphicon-home\"></span></a> www.majuterus.com</p>\n");
      out.write("                <div class=\"container-fluid bg-4 text-center\">\n");
      out.write("                    <p><b>@CopyRight by Muhammad Rizky Syawalludin_1511500827</b></p>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("\n");
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
