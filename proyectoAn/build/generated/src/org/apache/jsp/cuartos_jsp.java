package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import co.ufps.edu.dto.empleado;
import co.ufps.edu.dto.habitaciones;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayList;
import co.ufps.edu.dto.cuarto;
import facade.ControladorNegocio;

public final class cuartos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        \r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/datepicker3.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!--Icons-->\r\n");
      out.write("<script src=\"js/lumino.glyphs.js\"></script>\r\n");
      out.write("        <title>Cuartos</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("<body>\r\n");
      out.write("   \r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t");

  ControladorNegocio c4 = new ControladorNegocio();
 empleado emp=(empleado)session.getAttribute("EmpleadoLogin");
 if(emp!=null){
 
 
      out.write("\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("                                     <form action=\"verinfo.jsp\" method=\"POST\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("                                           \r\n");
      out.write("                      \r\n");
      out.write("\t\t\t\t\t\t<div class=\"icon-grid\">\r\n");
      out.write("                                                    \r\n");
      out.write("                                                    \r\n");
      out.write("                                                    \r\n");
      out.write("                                                    \r\n");
      out.write("                                                     ");
 
        ControladorNegocio c= new ControladorNegocio();
  List<habitaciones> habitaciones=c.listarh();
   
   
    
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("                                                    ");
for(habitaciones c1:habitaciones){
                                                        
                                                        
                                                    
      out.write("\r\n");
      out.write("                                                    \r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-3 col-md-4 col-sm-6\">\r\n");
      out.write("                                                            <strong>Cuarto ");
      out.print(c1.getId());
      out.write("</strong> <em>");
      out.print(c1.getEstado());
      out.write("</em><br>\r\n");
      out.write("                                                            <strong>tipo</strong> ");
      out.print(c1.getTipo());
      out.write("\r\n");
      out.write("                                                            <svg class=\"glyph stroked app-window\"> <IMG SRC=\"");
      out.print(c1.getFoto());
      out.write("\" WIDTH=200 HEIGHT=200></svg>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                                                               \r\n");
      out.write("                                                            \r\n");
      out.write("                                                           <pre> <button type=\"submit\" class=\"btn btn-success btn-lg\">ver info</button></pre>\r\n");
      out.write("                                                     \r\n");
      out.write("                                                           <p><input type=\"hidden\"  name=\"id\" value=\"");
      out.print(c1.getId());
      out.write("\"></p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                         \r\n");
      out.write("\t\t\t\t\t\t\t  \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("                                                        \r\n");
      out.write("                                                        \r\n");
      out.write("                                                        \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("                                                </form>\r\n");
      out.write("\t\t\t\t\t<nav>\r\n");
      out.write("  <ul class=\"pagination pagination-lg\">\r\n");
      out.write("    <li>\r\n");
      out.write("      <a href=\"#\" aria-label=\"Previous\">\r\n");
      out.write("        <span aria-hidden=\"true\">&laquo;</span>\r\n");
      out.write("      </a>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li><a href=\"#\">1</a></li>\r\n");
      out.write("    <li><a href=\"#\">2</a></li>\r\n");
      out.write("    <li><a href=\"#\">3</a></li>\r\n");
      out.write("    <li><a href=\"#\">4</a></li>\r\n");
      out.write("    <li><a href=\"#\">5</a></li>\r\n");
      out.write("    <li>\r\n");
      out.write("      <a href=\"#\" aria-label=\"Next\">\r\n");
      out.write("        <span aria-hidden=\"true\">&raquo;</span>\r\n");
      out.write("      </a>\r\n");
      out.write("    </li>\r\n");
      out.write("  </ul>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div><!--/.row-->\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div><!--/.main-->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/chart.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/chart-data.js\"></script>\r\n");
      out.write("\t<script src=\"js/easypiechart.js\"></script>\r\n");
      out.write("\t<script src=\"js/easypiechart-data.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap-datepicker.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t!function ($) {\r\n");
      out.write("\t\t\t$(document).on(\"click\",\"ul.nav li.parent > a > span.icon\", function(){\t\t  \r\n");
      out.write("\t\t\t\t$(this).find('em:first').toggleClass(\"glyphicon-minus\");\t  \r\n");
      out.write("\t\t\t}); \r\n");
      out.write("\t\t\t$(\".sidebar span.icon\").find('em:first').addClass(\"glyphicon-plus\");\r\n");
      out.write("\t\t}(window.jQuery);\r\n");
      out.write("\r\n");
      out.write("\t\t$(window).on('resize', function () {\r\n");
      out.write("\t\t  if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t$(window).on('resize', function () {\r\n");
      out.write("\t\t  if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("        \r\n");
      out.write("        ");
}
 else{
     response.sendRedirect("login.jsp"); 
 }

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
