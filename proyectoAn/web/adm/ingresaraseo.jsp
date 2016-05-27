<%-- 
    Document   : ingresaraseo
    Created on : 26/05/2016, 01:28:00 PM
    Author     : EDINSON
--%>

<jsp:useBean id="facade" class="co.ufps.edu.dao.limpiezaDAO" scope="session"></jsp:useBean>
<jsp:useBean id="dato" class="co.ufps.edu.dto.limpieza" scope="session"></jsp:useBean>

<%
    
    String var = request.getParameter("vari").toString();
    System.out.println("esteee:::::" );
    dato.setId_emp(Integer.parseInt(var));
    dato.setId_hab(Integer.parseInt(var));
    String msg = facade.insertar(dato);
    System.out.println("esteee:::::" + var);
    
    
    out.print(msg);
%>