package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!--         Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>                        \n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">SUNGLASSES CATALOGE</a>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li><a href=\"daftaradmin\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("                            <li><a href=\"loginadmin\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>    \n");
      out.write("\n");
      out.write("        <div id=\"section1\" class=\"container-fluid\">\n");
      out.write("            <div class=\"main-login main-center\">\n");
      out.write("                <form class=\"form-horizontal\" method=\"get\" action=\"../upload\">\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"username\" class=\"cols-sm-2 control-label\">Username</label>\n");
      out.write("                        <div class=\"cols-sm-10\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <span class=\"input-group-addon\"><i class=\"fa fa-users fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"username\" id=\"username\"  placeholder=\"Enter your Username\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"name\" class=\"cols-sm-2 control-label\">Your Name</label>\n");
      out.write("                        <div class=\"cols-sm-10\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <span class=\"input-group-addon\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"nama\" id=\"nama\"  placeholder=\"Enter your Name\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"email\" class=\"cols-sm-2 control-label\">Your Email</label>\n");
      out.write("                        <div class=\"cols-sm-10\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <span class=\"input-group-addon\"><i class=\"fa fa-envelope fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"email\" id=\"email\"  placeholder=\"Enter your Email\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"password\" class=\"cols-sm-2 control-label\">Password</label>\n");
      out.write("                        <div class=\"cols-sm-10\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <span class=\"input-group-addon\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\"  placeholder=\"Enter your Password\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"jenkel\" class=\"cols-sm-2 control-label\">Jenis Kelamin</label>\n");
      out.write("                        <div class=\"cols-sm-10\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <p>\n");
      out.write("                                <input name=\"jenkel\" type=\"radio\" id=\"test1\" value=\"Pria\"/>\n");
      out.write("                                <label for=\"test1\">Laki-Laki</label>\n");
      out.write("                                <input name=\"jenkel\" type=\"radio\" id=\"test2\" value=\"Wanita\"/>\n");
      out.write("                                <label for=\"test2\">Perempuan</label>\n");
      out.write("                            </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group \">\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-primary btn-lg btn-block login-button\" value=\"Registration\" name=\"regist\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
