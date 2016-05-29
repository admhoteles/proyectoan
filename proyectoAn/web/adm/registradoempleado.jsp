<%-- 
    Document   : registradoempleado
    Created on : 24/05/2016, 08:26:36 PM
    Author     : EDINSON
--%>

<jsp:useBean id="emp" class="co.ufps.edu.dao.empleadoDAO" scope="session"></jsp:useBean>
<jsp:useBean id="datos" class="co.ufps.edu.dto.empleado" scope="session"></jsp:useBean> 
<%
    
    
   String name= request.getParameter("name");
   String apell=request.getParameter("apell");
   int cedula= Integer.parseInt(request.getParameter("cedula"));
   String contr= request.getParameter("cont");
   String email= request.getParameter("email");
   int tel=Integer.parseInt(request.getParameter("tel"));
   int cargo=Integer.parseInt(request.getParameter("cargo"));             
   System.out.println(name+""+apell+""+cedula+""+contr+""+email+""+tel+""+cargo);
 
    if(cargo !=0){
   datos.setCedula(cedula);
   datos.setApellidos(apell);
   datos.setNombre(name);
   datos.setEmail(email);
   datos.setContraseña(contr);
   datos.setTelefono(tel);
   datos.setCargo(cargo);
   
    
   String msg= emp.insertar(datos);
    out.print(msg);
    
   // response.sendRedirect("Datos_empleado.jsp");
    }//else{
       //response.sendRedirect("erroremp.jsp"); 
    //}
    
%>