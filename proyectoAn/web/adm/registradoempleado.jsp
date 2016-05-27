<%-- 
    Document   : registradoempleado
    Created on : 24/05/2016, 08:26:36 PM
    Author     : EDINSON
--%>

<jsp:useBean id="emp" class="co.ufps.edu.dao.empleadoDAO" scope="session"></jsp:useBean>>
<jsp:useBean id="datos" class="co.ufps.edu.dto.empleado" scope="session"></jsp:useBean>>    
<%
    
   String name= request.getParameter("name");
   String apell=request.getParameter("apell");
   int cedula= Integer.parseInt(request.getParameter("cedula"));
   String contr= request.getParameter("contr");
   String email= request.getParameter("email");
   int tel=Integer.parseInt(request.getParameter("tel"));
    int cargo=Integer.parseInt(request.getParameter("cargo"));             
   
    if(cargo !=0){
   datos.setCedula(cedula);
   datos.setApellidos(apell);
   datos.setNombre(name);
   datos.setEmail(email);
   datos.setContraseña(contr);
   datos.setTelefono(tel);
   datos.setCargo(cargo);
   
    
    emp.insertar(datos);
    
    response.sendRedirect("Datos_empleado.jsp");
    }else{
       response.sendRedirect("erroremp.jsp"); 
    }
    
%>