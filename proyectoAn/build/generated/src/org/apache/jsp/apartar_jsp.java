package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class apartar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/datepicker3.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!--Icons-->\n");
      out.write("<script src=\"js/lumino.glyphs.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-md-6 col-lg-4\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-blue panel-widget \">\n");
      out.write("\t\t\t\t\t<div class=\"row no-padding\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-3 col-lg-5 widget-left\">\n");
      out.write("                                                    <svg class=\"glyph stroked bag\"><svg class=\"glyph stroked tag\"><use xlink:href=\"#stroked-tag\"/></svg>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-9 col-lg-7 widget-right\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"large\">5</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-muted\">Consulta Habitaciones disponibles</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-md-6 col-lg-4\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-teal panel-widget\">\n");
      out.write("\t\t\t\t\t<div class=\"row no-padding\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-3 col-lg-5 widget-left\">\n");
      out.write("\t\t\t\t\t\t\t<svg class=\"glyph stroked male-user\"><use xlink:href=\"#stroked-male-user\"></use></svg>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-9 col-lg-7 widget-right\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"large\"></div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-muted\">Consulta Huespedes</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div><!--/.row-->\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\"><svg class=\"glyph stroked email\"><use xlink:href=\"#stroked-email\"></use></svg> Formulario de  Apartado</div>\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t<form class=\"form-horizontal\" action=\"\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Name input-->\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\" for=\"name\">Nombre</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input id=\"name\" name=\"name\" type=\"text\" placeholder=\"Nombre\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                <!-- cedula input-->\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\" for=\"identificacion\">Identificacion</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input id=\"iden\" name=\"iden\" type=\"text\" placeholder=\"Identificacion\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                <!-- Telefono input-->\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\" for=\"telefono\">Telefono</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input id=\"tel\" name=\"tel\" type=\"number\" placeholder=\"Telefono\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Email input-->\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\" for=\"email\">E-mail</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input id=\"email\" name=\"email\" type=\"email\" placeholder=\"email\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                <!-- Dias de hospedaje input-->\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-xs-3 control-label\" for=\"dias\">Cantidad de dias</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input id=\"tel\" name=\"dias\" type=\"number\" placeholder=\"Dias\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                <!-- Calendario -->\n");
      out.write("                                                                <div class=\"panel panel-red\">\n");
      out.write("                                                                    <div class=\"panel-heading dark-overlay \"><svg class=\"glyph stroked calendar \"></svg>Fecha a apartar</div>\n");
      out.write("                                                                    <div class=\"panel-body\">\n");
      out.write("                                                                            <div id=\"calendar\"></div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                                <!-- Tipo de Habitacion -->\n");
      out.write("                                                            <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\" for=\"tipo\">Seleccione el tipo de Habitacion</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"btn-group\">\n");
      out.write("  <button type=\"button\" class=\"btn btn-danger\">Habitaciones</button>\n");
      out.write(" \n");
      out.write("  <button type=\"button\" class=\"btn btn-danger dropdown-toggle\"\n");
      out.write("          data-toggle=\"dropdown\">\n");
      out.write("    <span class=\"caret\"></span>\n");
      out.write("    <span class=\"sr-only\">Desplegar menú</span>\n");
      out.write("\n");
      out.write("  </button>\n");
      out.write(" \n");
      out.write("  <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("    <li><a href=\"#\">Standard</a></li>\n");
      out.write("    <li><a href=\"#\">Standard doble</a></li>\n");
      out.write("    <li><a href=\"#\">Multiple</a></li>\n");
      out.write("    <li><a href=\"#\">Multiple</a></li>\n");
      out.write("    <li><a href=\"#\">Suite</a></li>\n");
      out.write("  </ul>\n");
      out.write("</div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Message body -->\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\" for=\"message\">Observaciones</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<textarea class=\"form-control\" id=\"message\" name=\"message\" placeholder=\"Observaciones...\" rows=\"5\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                    \n");
      out.write("                                                                \n");
      out.write("\t\t\t\t\t\t\t\t<!-- Form actions -->\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-12 widget-right btn btn-danger\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-info btn-md pull-right\">Guardar</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div><!--/.col-->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t</div><!--/.col-->\n");
      out.write("\t\t</div><!--/.row-->\n");
      out.write("\t</div>\t<!--/.main-->\n");
      out.write("\t\t  \n");
      out.write("\n");
      out.write("\t<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/chart.min.js\"></script>\n");
      out.write("\t<script src=\"js/chart-data.js\"></script>\n");
      out.write("\t<script src=\"js/easypiechart.js\"></script>\n");
      out.write("\t<script src=\"js/easypiechart-data.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap-datepicker.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t$('#calendar').datepicker({\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t!function ($) {\n");
      out.write("\t\t    $(document).on(\"click\",\"ul.nav li.parent > a > span.icon\", function(){          \n");
      out.write("\t\t        $(this).find('em:first').toggleClass(\"glyphicon-minus\");      \n");
      out.write("\t\t    }); \n");
      out.write("\t\t    $(\".sidebar span.icon\").find('em:first').addClass(\"glyphicon-plus\");\n");
      out.write("\t\t}(window.jQuery);\n");
      out.write("\n");
      out.write("\t\t$(window).on('resize', function () {\n");
      out.write("\t\t  if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')\n");
      out.write("\t\t})\n");
      out.write("\t\t$(window).on('resize', function () {\n");
      out.write("\t\t  if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')\n");
      out.write("\t\t})\n");
      out.write("\t</script>\t\n");
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
