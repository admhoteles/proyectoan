<%-- 
    Document   : eliminar
    Created on : 13/05/2016, 09:37:35 PM
    Author     : EDINSON
--%>

   <%@page import="co.ufps.edu.dao.daohabitaciones"%>
<!DOCTYPE>
<html>
    <head>
   
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>R</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/datepicker3.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">

<!--Icons-->
<script src="js/lumino.glyphs.js"></script>

<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->

</head>

<body>
   <% String Param1= request.getParameter ("id");
        String Param2= request.getParameter ("tabla");
        System.out.println(Param1+" de la tabla   eliminar"+Param2);
      
       switch (Param2){
 
        case "habitaciones": daohabitaciones h= new daohabitaciones();
                               h.eliminar(Integer.parseInt(Param1));
                               response.sendRedirect("Datos_habitacion.jsp");
                               break;
 
        default:
     
        break;
 
 }
 %>
</body>

</html>




