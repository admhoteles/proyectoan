<%-- 
    Document   : prueba2
    Created on : 28-may-2016, 15:46:14
    Author     : macaco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%String arreglo[]=request.getParameterValues("vehicle");
        
        if(arreglo!=null){
            
        
        %>
        
        <p><%=arreglo[0]%></p>
         <p><%=arreglo.length%></p>
         <%}%>
         <form action="prueba2.jsp">
  <input type="checkbox" name="vehicle" value="Bike-car"> I have a bike<br>
  <input type="checkbox" name="vehicle" value="Car"> I have a car<br>
  <input type="submit" value="Submit">
</form>
    </body>
</html>
