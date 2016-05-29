package org.apache.jsp.adm;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import co.ufps.edu.dao.empleadoDAO;

public final class Datos_005fempleado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("   \r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>DATOS DEL EMPLEADO</title>\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/datepicker3.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\">\r\n");
      out.write("<!--Icons-->\r\n");
      out.write("<script src=\"js/lumino.glyphs.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\">\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("<script src=\"js/respond.min.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menuadm.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t<h1 class=\"page-header\">Datos del empleado</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div><!--/.row-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\"><svg class=\"glyph stroked email\"><use xlink:href=\"#stroked-email\"></use></svg> Formulario datos del empleado</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Name input-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-md-2 control-label\" for=\"name\">Nombre del empleado</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input id=\"name\" name=\"name\" type=\"text\" placeholder=\"Nombre\" class=\"form-control\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                                <br>\r\n");
      out.write("                                                                <br>\r\n");
      out.write("                                                                <!-- apellido input-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-md-2 control-label\" for=\"apell\">Apellido del empleado</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input id=\"apell\" name=\"apell\" type=\"text\" placeholder=\"Apellidos\" class=\"form-control\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                                <br>\r\n");
      out.write("                                                                <br>\r\n");
      out.write("                                                                <!-- cedula input-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-md-2 control-label\" for=\"cedula\">Documento de identificacion</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input id=\"cedula\" name=\"cedula\" type=\"number\"  class=\"form-control\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                                <br> \r\n");
      out.write("                                                                <br>\r\n");
      out.write("                                                                \r\n");
      out.write("                                                                  <!-- contraseña input-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-md-2 control-label\" for=\"contr\">Contraseña del usuario</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input id=\"cont\" name=\"contr\" type=\"text\" placeholder=\"xxxxxxx\" class=\"form-control\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("                                                        <br>\r\n");
      out.write("                                                                <!-- direccion email input-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-md-2 control-label\" for=\"email\">Email</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input id=\"email\" name=\"email\" type=\"email\" placeholder=\"ejemplo@ejm.com\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                                <br> \r\n");
      out.write("                                                                <br>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("                                                                <!-- Telefono input-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-md-2 control-label\" for=\"telefono\">Telefono</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input id=\"tel\" name=\"tel\" type=\"number\"  class=\"form-control\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("                                                        <br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- tipo  input-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-md-2 control-label\" for=\"cargo\">Cargo del empleado</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <select class=\"form-control\" name=\"cargo\" id=\"cargo\">\r\n");
      out.write("                                                                        <option selected value=\"0\"> Elige una opción </option>\r\n");
      out.write("                                                                        ");

                                                                        empleadoDAO em=new empleadoDAO();
                                                                        String m=em.cargos();
                                                                        out.println(m);
                                                                        
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                                <br>\r\n");
      out.write("                                                                <br>\r\n");
      out.write(" \r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Form actions -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-12 widget-right btn btn-danger\">\r\n");
      out.write("                                                                            <button type=\"submit\" class=\"btn btn-info btn-md pull-right\" onclick=\"Ingresarempleado()\">Guardar</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t<h1 class=\"page-header text-center\">Listado empleados</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div><!--/.row-->\r\n");
      out.write("\t\t<div class=\"col-md-12\">\r\n");
      out.write("                                              ");

            empleadoDAO h=new empleadoDAO();
           out.print(h.todosempleados());
            
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/chart.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/chart-data.js\"></script>\r\n");
      out.write("\t<script src=\"js/easypiechart.js\"></script>\r\n");
      out.write("\t<script src=\"js/easypiechart-data.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap-datepicker.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("        <script src=\"js/ajax.js\"></script>\r\n");
      out.write("        <script src=\"js/blockUI.js\"></script>\r\n");
      out.write("        <script src=\"js/toastr.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t$(window).on('resize', function () {\r\n");
      out.write("\t\t  if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t$(window).on('resize', function () {\r\n");
      out.write("\t\t  if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\t\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
