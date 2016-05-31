<%-- 
    Document   : buscar
    Created on : 09-may-2016, 15:05:14
    Author     : macaco
--%>

<%@page import="co.ufps.edu.dto.empleado"%>
<%@page import="co.ufps.edu.dto.Reserva"%>
<%@page import="co.ufps.edu.dto.Cliente"%>
<%@page import="co.ufps.edu.dto.cuarto"%>
<%@page import="facade.ControladorNegocio"%>
<%@page import="java.util.List"%>
<%@page import="co.ufps.edu.dto.Huesped"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        
        
        
        

        
        
        
        
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/datepicker3.css" rel="stylesheet">
<link href="css/bootstrap-table.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">

<!--Icons-->
<script src="js/lumino.glyphs.js"></script>

 <%
  ControladorNegocio c4 = new ControladorNegocio();
 empleado emp=(empleado)session.getAttribute("EmpleadoLogin");
 if(emp!=null){
 
 %>



        <title>Buscar</title>
    </head>
    <body>
       
        
        
       
        
        
        
        
        
        
        
        
	<jsp:include page="menu.jsp" />
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Buscar Huesped</h1>
			</div>
		</div><!--/.row-->
				
		
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Huesped</div>
                                         <%
        Reserva reserva=(Reserva)session.getAttribute("rhecha");
        if(reserva!=null){
            
        
        %>
        
      <div class="alert alert-success">
  <button type="button" class="close" data-dismiss="alert">&times;</button>
  <strong>¡Felicdades!</strong> Reservar hecha satifastoriamente.
</div>
        
        
        <%}%>
        
        <%Cliente huesped = (Cliente)session.getAttribute("huesped");
        
        
        if(huesped!=null){
                %>
      <div class="alert alert-success">
  <button type="button" class="close" data-dismiss="alert">&times;</button>
  <strong>¡Felicdades!</strong>Registro el Huesped correctamente
</div>
     <%
            
            session.setAttribute("huesped",null);
        
   
   }%>
        
					<div class="panel-body">
						<div class="col-md-6">
                                                    <form  method="GET" action="buscar.jsp" >
							<form role="form">
							
								<div class="form-group">
									<label>Digite la cedula del huesped</label>
									<input class="form-control" placeholder="Cedula" name="cc">
								</div>
																
								<div class="form-group">
                                                                    
									
								<button type="submit" class="btn btn-primary">Buscar</button>
                                                                 
								
								</div>
								 </form>
								
																
								
								
								
								
								
								
							</div>
							<div class="col-md-12">
							
								
					 <%
                                             
                                             //objetos sessiones
                                             
                                            
                                            
                                             
                                             
                                             
                                             //busqueda
                                             String busqueda=request.getParameter("cc");
        if(busqueda!=null){
            
        
        %>
        
        <%//hay busqueda
        ControladorNegocio c= new ControladorNegocio();
        int bus=Integer.parseInt(busqueda);
        Cliente cliente=c.ListarClientepor(bus);
        %>
       
        <table class="table">
    <thead>
        <tr>
            <th>id</th>
            <th>cc</th>
            <th>Nombre</th>
            <th>Nacionalidad</th>
            <th>Elegir</th>
        </tr>
    </thead>
    <tbody>
         
       
     
       
       
       
       
           
       
        <tr>
    <form action="facturar.jsp" method="POST">
            <td><%=cliente.getId()%></td>
             <td><%=cliente.getCedula()%></td>
            <td> <%=cliente.getNombre()%>  </td>
            <td> <%=cliente.getNacionalidad()%></td>
              <%session.setAttribute("cliente",cliente);%>
            <td> <input type="submit" value="Elegir" class="btn btn-info" min="0"/></td>
            
            </form>
        </tr>
   
      
    </tbody>
</table>
        
        
        <%}
        
        %>			
								
				
								
		 <br>
        <br>
        <br>						
								
							</div>
        <div class ="col-md-12"  style="text-align: center;"> <a href="#" id="alternar-respuesta-ej5" class="btn btn-info" >Desea Registrar un Huesped?</a></div>
        
        
        <br>
        <br>
        <br>
        
        <div class="col-md-12" id="respuesta-ej5" style="display: none;" >
            
            
               <form  action="registrado.jsp" method="post">

            <div>
                <p class="label label-primary"> cc: </p><input type="text" name="cedula"  required>

            </div>
            <div>
                <p class="label label-primary"> Nombre: </p><input type="text" name="nombre" required >

            </div>
                      <div>
                <p class="label label-primary"> Apellidos </p><input type="text" name="apellidos" required >

            </div>
                   
                      <div>
                <p class="label label-primary"> Direccion </p><input type="text" name="direccion" required >

            </div>
                   
                      <div>
                <p class="label label-primary"> Telefono </p><input type="text" name="telefono" required >

            </div>
                   
                            <div>
                <p class="label label-primary"> Pasaporte </p><input type="text" name="pasaporte" required >

            </div>
                   
                   
            <div><p class="label label-primary"> Nacionalidad: </p><input type="text" name="nacionalidad" required >
</div>
         <div><p class="label label-primary"> Procedencia </p><input type="text" name="procedencia" required >
</div> 
                   <input type="submit" value="Registrar" class="btn btn-info" min="0"/>
</div>

</br>


        </form>
        </div>
						</form>
					</div>
				</div>
			</div><!-- /.col-->
		</div><!-- /.row -->
		
	</div><!--/.main-->

	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/chart.min.js"></script>
	<script src="js/chart-data.js"></script>
	<script src="js/easypiechart.js"></script>
	<script src="js/easypiechart-data.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script>
		!function ($) {
			$(document).on("click","ul.nav li.parent > a > span.icon", function(){		  
				$(this).find('em:first').toggleClass("glyphicon-minus");	  
			}); 
			$(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		}(window.jQuery);

		$(window).on('resize', function () {
		  if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		})
		$(window).on('resize', function () {
		  if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		})
	</script>
        
        
        
        
        
          <script src="https://code.jquery.com/jquery-1.11.1.min.js"></script> 
<script src="https://code.jquery.com/jquery-migrate-1.2.1.min.js"></script> 
<script>
// jQuery
$(document).ready(function(){ 
  
    $('#alternar-respuesta-ej5').toggle( 
  
        // Primer click
        function(e){ 
            $('#respuesta-ej5').slideDown();
            $(this).text('Esconder Formulario');
            e.preventDefault();
        }, // Separamos las dos funciones con una coma
      
        // Segundo click
        function(e){ 
            $('#respuesta-ej5').slideUp();
            $(this).text('Desea Registrar un Huesped?');
            e.preventDefault();
        }
  
    );
  
});


<%}
 else{
     response.sendRedirect("login.jsp"); 
 }
%>
</script>
</body>
</html>
