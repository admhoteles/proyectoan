package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import co.ufps.edu.dto.principal;
import co.ufps.edu.dao.principaldao;

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
      out.write(" ");
      co.ufps.edu.dao.principaldao consul = null;
      synchronized (session) {
        consul = (co.ufps.edu.dao.principaldao) _jspx_page_context.getAttribute("consul", PageContext.SESSION_SCOPE);
        if (consul == null){
          consul = new co.ufps.edu.dao.principaldao();
          _jspx_page_context.setAttribute("consul", consul, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("    ");

   
      
    
   principal m= consul.consultardatos();
    
    //System.out.println(msg);

      out.write("\n");
      out.write("<!DOCTYPE>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<title>Hotel</title>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"author\" content=\"pixelhint.com\">\n");
      out.write("\t<meta name=\"description\" content=\"La casa free real state fully responsive html5/css3 home page website template\"/>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0\" />\n");
      out.write("\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./prin/css/reset.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./prin/css/responsive.css\">\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\" src=\"./prin/js/jquery.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"./prin/js/main.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<section class=\"hero\">\n");
      out.write("\t\t<header>\n");
      out.write("\t\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"./prin/img/logo.png\" class=\"logo\" alt=\"\" title=\"\"/></a>\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"hamburger\"></a>\n");
      out.write("\t\t\t\t<nav>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Inicio</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Habitaciones</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Servicios</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Contacto</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"login_btn\">Login</a>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</header><!--  end header section  -->\n");
      out.write("\n");
      out.write("\t\t\t<section class=\"caption\">\n");
      out.write("                            <h2 class=\"caption\">");
out.print(m.getNombre()); 
      out.write("</h2>\n");
      out.write("\t\t\t\t<h3 class=\"properties\">");
out.print(m.getSlogan()); 
      out.write("</h3>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t</section><!--  end hero section  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<section class=\"search\">\n");
      out.write("\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"search\" name=\"search\" placeholder=\"What are you looking for?\"  autocomplete=\"off\"/>\n");
      out.write("\t\t\t\t<input type=\"submit\" id=\"submit_search\" name=\"submit_search\"/>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t<a href=\"#\" class=\"advanced_search_icon\" id=\"advanced_search_btn\"></a>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"advanced_search\">\n");
      out.write("\t\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t\t<span class=\"arrow\"></span>\n");
      out.write("\t\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t\t<div class=\"search_fields\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"float\" id=\"check_in_date\" name=\"check_in_date\" placeholder=\"Check In Date\"  autocomplete=\"off\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<hr class=\"field_sep float\"/>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"float\" id=\"check_out_date\" name=\"check_out_date\" placeholder=\"Check Out Date\"  autocomplete=\"off\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"search_fields\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"float\" id=\"min_price\" name=\"min_price\" placeholder=\"Min. Price\"  autocomplete=\"off\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<hr class=\"field_sep float\"/>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"float\" id=\"max_price\" name=\"max_price\" placeholder=\"Max. price\"  autocomplete=\"off\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"keywords\" name=\"keywords\" placeholder=\"Keywords\"  autocomplete=\"off\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" id=\"submit_search\" name=\"submit_search\"/>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!--  end advanced search section  -->\n");
      out.write("\t</section><!--  end search section  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<section class=\"listings\">\n");
      out.write("\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t<ul class=\"properties_list\">\n");
      out.write("                            ");

                                out.print(consul.habitacionesMostrar());
                                
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<div class=\"more_listing\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"more_listing_btn\">View More Listings</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\t<!--  end listing section  -->\n");
      out.write("\n");
      out.write("\t<footer>\n");
      out.write("\t\t<div class=\"wrapper footer\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li class=\"links\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Contacto: </a></li>\n");
      out.write("\t\t\t\t\t\t<li><a>Dirección: ");
out.print(m.getDir()); 
      out.write("</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a>Telefono: ");
out.print(m.getTel()); 
      out.write("</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a>Celular: ");
out.print(m.getCel()); 
      out.write("</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"about\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://facebook.com/pixelhint\" class=\"facebook\" target=\"_blank\"></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://twitter.com/pixelhint\" class=\"twitter\" target=\"_blank\"></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://plus.google.com/+Pixelhint\" class=\"google\" target=\"_blank\"></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"skype\"></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"copyrights wrapper\">\n");
      out.write("\t\t\tCopyright © 2015 <a href=\"http://pixelhint.com\" target=\"_blank\" class=\"ph_link\" title=\"Download more free Templates\">Pixelhint.com</a>. All Rights Reserved.\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer><!--  end footer  -->\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("</html>");
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
