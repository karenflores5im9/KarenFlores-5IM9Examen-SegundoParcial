package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <title>Registro</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\"/>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/Linearicons-Free-v1.0.0/icon-font.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/daterangepicker/daterangepicker.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #003399;\">\n");
      out.write("\n");
      out.write("        <div class=\"limiter\">\n");
      out.write("            <div class=\"container-login100\">\n");
      out.write("                <div class=\"login100-more\" style=\"background-image: url('images/bg-01.jpg');\"></div>\n");
      out.write("\n");
      out.write("                <div class=\"wrap-login100 p-l-50 p-r-50 p-t-72 p-b-50\">\n");
      out.write("                    <form class=\"login100-form validate-form\"  name=\"registro\" action=\"RegistroServlet\">\n");
      out.write("                        <span class=\"login100-form-title p-b-59\">\n");
      out.write("                            REGISTRO\n");
      out.write("                        </span>\n");
      out.write("\n");
      out.write("                        <div class=\"wrap-input100 validate-input\" data-validate=\"Es necesario el nombre\">\n");
      out.write("                            <span class=\"label-input100\">Nombre: </span>\n");
      out.write("                            <input class=\"input100\" type=\"text\" name=\"nombre\">\n");
      out.write("                            <span class=\"focus-input100\"></span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"wrap-input100 validate-input\" data-validate=\"Es necesario el apellido paterno\" >\n");
      out.write("                            <span class=\"label-input100\">Apellido Paterno: </span>\n");
      out.write("                            <input class=\"input100\" type=\"text\" name=\"paterno\">\n");
      out.write("                            <span class=\"focus-input100\"></span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"wrap-input100 validate-input\" data-validate=\"Es necesario el apellido materno\">\n");
      out.write("                            <span class=\"label-input100\">Apellido Materno: </span>\n");
      out.write("                            <input class=\"input100\" type=\"text\" name=\"materno\">\n");
      out.write("                            <span class=\"focus-input100\"></span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"wrap-input100 validate-input\" data-validate=\"Es necesario la escuela\">\n");
      out.write("                            <span class=\"label-input100\">Escuela: </span>\n");
      out.write("                            <input class=\"input100\" type=\"text\" name=\"escuela\">\n");
      out.write("                            <span class=\"focus-input100\"></span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"wrap-input100 validate-input\" data-validate=\"Es necesario la materia\">\n");
      out.write("                            <span class=\"label-input100\">Materia Favorita: </span>\n");
      out.write("                            <input class=\"input100\" type=\"text\" name=\"materia\">\n");
      out.write("                            <span class=\"focus-input100\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"wrap-input100 validate-input\" data-validate=\"Es necesario el deporte\">\n");
      out.write("                            <span class=\"label-input100\">Deporte Favorito: </span>\n");
      out.write("                            <input class=\"input100\" type=\"text\" name=\"deporte\">\n");
      out.write("                            <span class=\"focus-input100\"></span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"container-login100-form-btn\">\n");
      out.write("                            <div class=\"wrap-login100-form-btn\">\n");
      out.write("                                <div class=\"login100-form-bgbtn\"></div>\n");
      out.write("                                <button  class=\"login100-form-btn\">\n");
      out.write("                                    Registrarse\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <a href=\"#\" class=\"dis-block txt3 hov1 p-r-30 p-t-10 p-b-10 p-l-30\">\n");
      out.write("                                Inicio\n");
      out.write("                                <i class=\"fa fa-long-arrow-right m-l-5\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
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
