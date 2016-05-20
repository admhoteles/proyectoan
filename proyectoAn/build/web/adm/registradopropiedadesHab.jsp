<%-- 
    Document   : registradopropiedadesHab
    Created on : 6/05/2016, 07:45:30 AM
    Author     : EDINSON
--%>

<jsp:useBean id="prop" class="co.ufps.edu.dao.propiedadeshabDAO" scope="session"></jsp:useBean>
<jsp:useBean id="datos" class="co.ufps.edu.dto.propiedadeshab " scope="session"></jsp:useBean>   
<%
    
    int incr  = Integer.parseInt(request.getParameter("inc"));
    String name=request.getParameter("name");
   
   
    
  
    datos.setInc(incr);
    datos.setDescripcion(name);
    prop.insertar(datos);
    
    response.sendRedirect("Datos_propiedadesHab.jsp");
    
    
%>
