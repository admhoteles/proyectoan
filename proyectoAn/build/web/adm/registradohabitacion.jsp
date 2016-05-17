<%-- 
    Document   : registradoHotel
    Created on : 6/05/2016, 07:45:30 AM
    Author     : EDINSON
--%>

<jsp:useBean id="hab" class="co.ufps.edu.dao.daohabitaciones" scope="session"></jsp:useBean>>
<jsp:useBean id="datos" class="co.ufps.edu.dto.habitaciones" scope="session"></jsp:useBean>>    
<%
    int id_hab = Integer.parseInt(request.getParameter("idh"));
    int tipo = Integer.parseInt(request.getParameter("tipo"));
    int estado = Integer.parseInt(request.getParameter("estado"));
    String foto=request.getParameter("foto");
   
   
    if(tipo !=0 && estado !=0){
   datos.setId(id_hab);
    datos.setTipo(tipo);
    datos.setEstado(estado);
    datos.setFoto(foto);
    hab.insertar(datos);
    
    response.sendRedirect("Datos_habitacion.jsp");
    }else{
       response.sendRedirect("errorHab.jsp"); 
    }
    
%>
