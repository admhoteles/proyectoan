<%-- 
    Document   : registradoHotel
    Created on : 6/05/2016, 07:45:30 AM
    Author     : EDINSON
--%>

<jsp:useBean id="hotel" class="co.ufps.edu.dao.datoshoteldao" scope="session"></jsp:useBean>>
<jsp:useBean id="datos" class="co.ufps.edu.dto.principal" scope="session"></jsp:useBean>>    
<%
    String nombre = request.getParameter("name");
    String slogan = request.getParameter("slog");
    String dir = request.getParameter("dir");
    int tel=Integer.parseInt(request.getParameter("tel"));
    int cel=Integer.parseInt(request.getParameter("cel"));
   
    
   datos.setNombre(nombre);
    datos.setSlogan(slogan);
    datos.setDir(dir);
    datos.setTel(tel);
    datos.setCel(cel);
    System.out.println(datos.toString());
    hotel.agregar(datos);
    
    /*System.out.println(msg);
    session.setAttribute("mensaje", msg);*/
    
    response.sendRedirect("Datos_hotel.jsp");
%>
