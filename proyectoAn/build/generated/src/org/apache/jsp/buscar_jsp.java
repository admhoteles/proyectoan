package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import co.ufps.edu.dto.empleado;
import co.ufps.edu.dto.Reserva;
import co.ufps.edu.dto.Cliente;
import co.ufps.edu.dto.cuarto;
import facade.ControladorNegocio;
import java.util.List;
import co.ufps.edu.dto.Huesped;

public final class buscar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("     <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/datepicker3.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/bootstrap-table.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!--Icons-->\r\n");
      out.write("<script src=\"js/lumino.glyphs.js\"></script>\r\n");
      out.write("\r\n");
      out.write(" ");

  ControladorNegocio c4 = new ControladorNegocio();
 empleado emp=(empleado)session.getAttribute("EmpleadoLogin");
 if(emp!=null){
 
 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <title>Buscar</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t<h1 class=\"page-header\">Buscar Huesped</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div><!--/.row-->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">Huesped</div>\r\n");
      out.write("                                         ");

        Reserva reserva=(Reserva)session.getAttribute("rhecha");
        if(reserva!=null){
            
        
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("      <div class=\"alert alert-success\">\r\n");
      out.write("  <button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\r\n");
      out.write("  <strong>¡Felicdades!</strong> Reservar hecha satifastoriamente.\r\n");
      out.write("</div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        ");
Cliente huesped = (Cliente)session.getAttribute("huesped");
        
        
        if(huesped!=null){
                
      out.write("\r\n");
      out.write("      <div class=\"alert alert-success\">\r\n");
      out.write("  <button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\r\n");
      out.write("  <strong>¡Felicdades!</strong>Registro el Huesped correctamente\r\n");
      out.write("</div>\r\n");
      out.write("     ");

            
            session.setAttribute("huesped",null);
        
   
   }
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("                                                    <form  method=\"GET\" action=\"buscar.jsp\" >\r\n");
      out.write("\t\t\t\t\t\t\t<form role=\"form\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Digite la cedula del huesped</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"form-control\" placeholder=\"Cedula\" name=\"cc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("                                                                    \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Buscar</button>\r\n");
      out.write("                                                                 \r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t </form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t ");

                                             
                                             //objetos sessiones
                                             
                                            
                                            
                                             
                                             
                                             
                                             //busqueda
                                             String busqueda=request.getParameter("cc");
        if(busqueda!=null){
            
        
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        ");
//hay busqueda
        ControladorNegocio c= new ControladorNegocio();
        int bus=Integer.parseInt(busqueda);
        Cliente cliente=c.ListarClientepor(bus);
        
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        <table class=\"table\">\r\n");
      out.write("    <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th>id</th>\r\n");
      out.write("            <th>cc</th>\r\n");
      out.write("            <th>Nombre</th>\r\n");
      out.write("            <th>Nacionalidad</th>\r\n");
      out.write("            <th>Elegir</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("    <tbody>\r\n");
      out.write("         \r\n");
      out.write("       \r\n");
      out.write("     \r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("           \r\n");
      out.write("       \r\n");
      out.write("        <tr>\r\n");
      out.write("    <form action=\"facturar.jsp\" method=\"POST\">\r\n");
      out.write("            <td>");
      out.print(cliente.getId());
      out.write("</td>\r\n");
      out.write("             <td>");
      out.print(cliente.getCedula());
      out.write("</td>\r\n");
      out.write("            <td> ");
      out.print(cliente.getNombre());
      out.write("  </td>\r\n");
      out.write("            <td> ");
      out.print(cliente.getNacionalidad());
      out.write("</td>\r\n");
      out.write("              ");
session.setAttribute("cliente",cliente);
      out.write("\r\n");
      out.write("            <td> <input type=\"submit\" value=\"Elegir\" class=\"btn btn-info\" min=\"0\"/></td>\r\n");
      out.write("            \r\n");
      out.write("            </form>\r\n");
      out.write("        </tr>\r\n");
      out.write("   \r\n");
      out.write("      \r\n");
      out.write("    </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        ");
}
        
        
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("        <div class =\"col-md-12\"  style=\"text-align: center;\"> <a href=\"#\" id=\"alternar-respuesta-ej5\" class=\"btn btn-info\" >Desea Registrar un Huesped?</a></div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"col-md-12\" id=\"respuesta-ej5\" style=\"display: none;\" >\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("               <form  action=\"registrado.jsp\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("            <div>\r\n");
      out.write("                <p class=\"label label-primary\"> cc: </p><input type=\"text\" name=\"cedula\"  required>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <p class=\"label label-primary\"> Nombre: </p><input type=\"text\" name=\"nombre\" required >\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("                      <div>\r\n");
      out.write("                <p class=\"label label-primary\"> Apellidos </p><input type=\"text\" name=\"apellidos\" required >\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("                   \r\n");
      out.write("                      <div>\r\n");
      out.write("                <p class=\"label label-primary\"> Direccion </p><input type=\"text\" name=\"direccion\" required >\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("                   \r\n");
      out.write("                      <div>\r\n");
      out.write("                <p class=\"label label-primary\"> Telefono </p><input type=\"text\" name=\"telefono\" required >\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("                   \r\n");
      out.write("                            <div>\r\n");
      out.write("                <p class=\"label label-primary\"> Pasaporte </p><input type=\"text\" name=\"pasaporte\" required >\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("                   \r\n");
      out.write("                   \r\n");
      out.write("            <div><p class=\"label label-primary\"> Nacionalidad: </p><input type=\"text\" name=\"nacionalidad\" required >\r\n");
      out.write("</div>\r\n");
      out.write("         <div><p class=\"label label-primary\"> Procedencia </p><input type=\"text\" name=\"procedencia\" required >\r\n");
      out.write("</div> \r\n");
      out.write("                   <input type=\"submit\" value=\"Registrar\" class=\"btn btn-info\" min=\"0\"/>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div><!-- /.col-->\r\n");
      out.write("\t\t</div><!-- /.row -->\r\n");
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
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("          <script src=\"https://code.jquery.com/jquery-1.11.1.min.js\"></script> \r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-migrate-1.2.1.min.js\"></script> \r\n");
      out.write("<script>\r\n");
      out.write("// jQuery\r\n");
      out.write("$(document).ready(function(){ \r\n");
      out.write("  \r\n");
      out.write("    $('#alternar-respuesta-ej5').toggle( \r\n");
      out.write("  \r\n");
      out.write("        // Primer click\r\n");
      out.write("        function(e){ \r\n");
      out.write("            $('#respuesta-ej5').slideDown();\r\n");
      out.write("            $(this).text('Esconder Formulario');\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("        }, // Separamos las dos funciones con una coma\r\n");
      out.write("      \r\n");
      out.write("        // Segundo click\r\n");
      out.write("        function(e){ \r\n");
      out.write("            $('#respuesta-ej5').slideUp();\r\n");
      out.write("            $(this).text('Desea Registrar un Huesped?');\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("        }\r\n");
      out.write("  \r\n");
      out.write("    );\r\n");
      out.write("  \r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
}
 else{
     response.sendRedirect("login.jsp"); 
 }

      out.write("\r\n");
      out.write("</script>\r\n");
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
