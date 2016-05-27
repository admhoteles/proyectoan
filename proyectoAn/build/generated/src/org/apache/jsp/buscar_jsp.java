package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("     <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/datepicker3.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/bootstrap-table.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!--Icons-->\n");
      out.write("<script src=\"js/lumino.glyphs.js\"></script>\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Buscar</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t<h1 class=\"page-header\">Buscar Huesped</h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!--/.row-->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">Huesped</div>\n");
      out.write("                                         ");

        Reserva reserva=(Reserva)session.getAttribute("rhecha");
        if(reserva!=null){
            
        
        
      out.write("\n");
      out.write("        \n");
      out.write("      <div class=\"alert alert-success\">\n");
      out.write("  <button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\n");
      out.write("  <strong>¡Felicdades!</strong> Reservar hecha satifastoriamente.\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
}
      out.write("\n");
      out.write("        \n");
      out.write("        ");
Cliente huesped = (Cliente)session.getAttribute("huesped");
        
        
        if(huesped!=null){
                
      out.write("\n");
      out.write("      <div class=\"alert alert-success\">\n");
      out.write("  <button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\n");
      out.write("  <strong>¡Felicdades!</strong>Registro el Huesped correctamente\n");
      out.write("</div>\n");
      out.write("     ");
}
      out.write("\n");
      out.write("        \n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("                                                    <form  method=\"GET\" action=\"buscar.jsp\" >\n");
      out.write("\t\t\t\t\t\t\t<form role=\"form\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Digite la cedula del huesped</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"form-control\" placeholder=\"Cedula\" name=\"cc\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("                                                                    \n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Buscar</button>\n");
      out.write("                                                                 \n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t </form>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t ");

                                             
                                             //objetos sessiones
                                             
                                            
                                            
                                             
                                             
                                             
                                             //busqueda
                                             String busqueda=request.getParameter("cc");
        if(busqueda!=null){
            
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");
//hay busqueda
        ControladorNegocio c= new ControladorNegocio();
        int bus=Integer.parseInt(busqueda);
        Cliente cliente=c.ListarClientepor(bus);
        
      out.write("\n");
      out.write("       \n");
      out.write("        <table class=\"table\">\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>id</th>\n");
      out.write("            <th>cc</th>\n");
      out.write("            <th>Nombre</th>\n");
      out.write("            <th>Nacionalidad</th>\n");
      out.write("            <th>Elegir</th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("         \n");
      out.write("       \n");
      out.write("     \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("           \n");
      out.write("       \n");
      out.write("        <tr>\n");
      out.write("    <form action=\"facturar.jsp\" method=\"POST\">\n");
      out.write("            <td>");
      out.print(cliente.getId());
      out.write("</td>\n");
      out.write("             <td>");
      out.print(cliente.getCedula());
      out.write("</td>\n");
      out.write("            <td> ");
      out.print(cliente.getNombre());
      out.write("  </td>\n");
      out.write("            <td> ");
      out.print(cliente.getNacionalidad());
      out.write("</td>\n");
      out.write("              ");
session.setAttribute("cliente",cliente);
      out.write("\n");
      out.write("            <td> <input type=\"submit\" value=\"Elegir\" class=\"btn btn-info\" min=\"0\"/></td>\n");
      out.write("            \n");
      out.write("            </form>\n");
      out.write("        </tr>\n");
      out.write("   \n");
      out.write("      \n");
      out.write("    </tbody>\n");
      out.write("</table>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
}
        
        
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("        <div class =\"col-md-12\"  style=\"text-align: center;\"> <a href=\"#\" id=\"alternar-respuesta-ej5\" class=\"btn btn-info\" >Desea Registrar un Huesped?</a></div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <div class=\"col-md-12\" id=\"respuesta-ej5\" style=\"display: none;\" >\n");
      out.write("            \n");
      out.write("            \n");
      out.write("               <form  action=\"registrado.jsp\" method=\"post\">\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <p class=\"label label-primary\"> cc: </p><input type=\"text\" name=\"cedula\"  required>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <p class=\"label label-primary\"> Nombre: </p><input type=\"text\" name=\"nombre\" required >\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("                      <div>\n");
      out.write("                <p class=\"label label-primary\"> Apellidos </p><input type=\"text\" name=\"apellidos\" required >\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("                   \n");
      out.write("                      <div>\n");
      out.write("                <p class=\"label label-primary\"> Direccion </p><input type=\"text\" name=\"direccion\" required >\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("                   \n");
      out.write("                      <div>\n");
      out.write("                <p class=\"label label-primary\"> Telefono </p><input type=\"text\" name=\"telefono\" required >\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("                   \n");
      out.write("                            <div>\n");
      out.write("                <p class=\"label label-primary\"> Pasaporte </p><input type=\"text\" name=\"pasaporte\" required >\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("            <div><p class=\"label label-primary\"> Nacionalidad: </p><input type=\"text\" name=\"nacionalidad\" required >\n");
      out.write("</div>\n");
      out.write("         <div><p class=\"label label-primary\"> Procedencia </p><input type=\"text\" name=\"procedencia\" required >\n");
      out.write("</div> \n");
      out.write("                   <input type=\"submit\" value=\"Registrar\" class=\"btn btn-info\" min=\"0\"/>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</br>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div><!-- /.col-->\n");
      out.write("\t\t</div><!-- /.row -->\n");
      out.write("\t\t\n");
      out.write("\t</div><!--/.main-->\n");
      out.write("\n");
      out.write("\t<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/chart.min.js\"></script>\n");
      out.write("\t<script src=\"js/chart-data.js\"></script>\n");
      out.write("\t<script src=\"js/easypiechart.js\"></script>\n");
      out.write("\t<script src=\"js/easypiechart-data.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap-datepicker.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t!function ($) {\n");
      out.write("\t\t\t$(document).on(\"click\",\"ul.nav li.parent > a > span.icon\", function(){\t\t  \n");
      out.write("\t\t\t\t$(this).find('em:first').toggleClass(\"glyphicon-minus\");\t  \n");
      out.write("\t\t\t}); \n");
      out.write("\t\t\t$(\".sidebar span.icon\").find('em:first').addClass(\"glyphicon-plus\");\n");
      out.write("\t\t}(window.jQuery);\n");
      out.write("\n");
      out.write("\t\t$(window).on('resize', function () {\n");
      out.write("\t\t  if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')\n");
      out.write("\t\t})\n");
      out.write("\t\t$(window).on('resize', function () {\n");
      out.write("\t\t  if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')\n");
      out.write("\t\t})\n");
      out.write("\t</script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("          <script src=\"https://code.jquery.com/jquery-1.11.1.min.js\"></script> \n");
      out.write("<script src=\"https://code.jquery.com/jquery-migrate-1.2.1.min.js\"></script> \n");
      out.write("<script>\n");
      out.write("// jQuery\n");
      out.write("$(document).ready(function(){ \n");
      out.write("  \n");
      out.write("    $('#alternar-respuesta-ej5').toggle( \n");
      out.write("  \n");
      out.write("        // Primer click\n");
      out.write("        function(e){ \n");
      out.write("            $('#respuesta-ej5').slideDown();\n");
      out.write("            $(this).text('Esconder Formulario');\n");
      out.write("            e.preventDefault();\n");
      out.write("        }, // Separamos las dos funciones con una coma\n");
      out.write("      \n");
      out.write("        // Segundo click\n");
      out.write("        function(e){ \n");
      out.write("            $('#respuesta-ej5').slideUp();\n");
      out.write("            $(this).text('Desea Registrar un Huesped?');\n");
      out.write("            e.preventDefault();\n");
      out.write("        }\n");
      out.write("  \n");
      out.write("    );\n");
      out.write("  \n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</body>\n");
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
