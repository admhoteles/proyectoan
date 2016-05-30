package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class generarf_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("   \r\n");
      out.write("        \r\n");
      out.write("        <html>\r\n");
      out.write("   \r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\r\n");
      out.write("     \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t<h1 class=\"page-header\">Facturar</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div><!--/.row-->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">Factura</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t<table data-toggle=\"table\">\r\n");
      out.write("\t\t\t\t\t\t    <thead>\r\n");
      out.write("\t\t\t\t\t\t    <tr>\r\n");
      out.write("\t\t\t\t\t\t        <th data-field=\"state\" data-checkbox=\"true\" > ID</th>\r\n");
      out.write("\t\t\t\t\t\t        <th data-field=\"id\" data-sortable=\"true\">Detalle</th>\r\n");
      out.write("\t\t\t\t\t\t        <th data-field=\"name\"  data-sortable=\"true\">Descripcion</th>\r\n");
      out.write("\t\t\t\t\t\t        <th data-field=\"price\" data-sortable=\"true\">Total a pagar</th>\r\n");
      out.write("                                                          \r\n");
      out.write("\t\t\t\t\t\t    </tr>\r\n");
      out.write("\t\t\t\t\t\t    </thead>\r\n");
      out.write("                                                    \r\n");
      out.write("                                                     <tbody>\r\n");
      out.write("     \r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>10</td>\r\n");
      out.write("            <td>cuarto con aire acondicionado, y nevera</td>\r\n");
      out.write("            <td>cuarto para 4 personas</td>\r\n");
      out.write("            <td>$120000</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    \r\n");
      out.write("       \r\n");
      out.write("    </tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success btn-lg\">Imprimir</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t</div><!--/.row-->\t\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">Informacion Servicios Adicionales</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t<table data-toggle=\"table\" >\r\n");
      out.write("\t\t\t\t\t\t    <thead>\r\n");
      out.write("\t\t\t\t\t\t    <tr>\r\n");
      out.write("\t\t\t\t\t\t        <th data-field=\"id\" data-align=\"right\">Item ID</th>\r\n");
      out.write("\t\t\t\t\t\t        <th data-field=\"name\">Item Name</th>\r\n");
      out.write("\t\t\t\t\t\t        <th data-field=\"price\">Item Price</th>\r\n");
      out.write("\t\t\t\t\t\t    </tr>\r\n");
      out.write("\t\t\t\t\t\t    </thead>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">Huesped a Facturar</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t<table data-toggle=\"table\" id=\"table-style\"  data-row-style=\"rowStyle\">\r\n");
      out.write("\t\t\t\t\t\t    <thead>\r\n");
      out.write("\t\t\t\t\t\t    <tr>\r\n");
      out.write("\t\t\t\t\t\t        <th data-field=\"id\" data-align=\"right\" >id</th>\r\n");
      out.write("\t\t\t\t\t\t        <th data-field=\"name\" >Nombre</th>\r\n");
      out.write("\t\t\t\t\t\t        <th data-field=\"price\" >Nacionlaidad</th>\r\n");
      out.write("\t\t\t\t\t\t    </tr>\r\n");
      out.write("\t\t\t\t\t\t    </thead>\r\n");
      out.write("                                                                                   <tbody>\r\n");
      out.write("     \r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>10</td>\r\n");
      out.write("            <td>huesped1  </td>\r\n");
      out.write("            <td>Colombiana</td>\r\n");
      out.write("            \r\n");
      out.write("        </tr>\r\n");
      out.write("    \r\n");
      out.write("       \r\n");
      out.write("    </tbody>\r\n");
      out.write("\t\t\r\n");
      out.write("                                                    \r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div><!--/.row-->\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div><!--/.main-->\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/chart.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/chart-data.js\"></script>\r\n");
      out.write("\t<script src=\"js/easypiechart.js\"></script>\r\n");
      out.write("\t<script src=\"js/easypiechart-data.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap-datepicker.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap-table.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
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
