<%-- 
    Document   : addproducto
    Created on : 28-may-2016, 16:06:33
    Author     : macaco
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="co.ufps.edu.dto.Servicios"%>
<%@page import="facade.ControladorNegocio"%>
<%@page import="co.ufps.edu.dto.Cliente"%>
<%@page import="co.ufps.edu.dto.Reserva"%>
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
                                                    <form  method="GET" action="addproducto.jsp" >
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
        List<Servicios>servicios=c.ListarSErvicio();
         
         
         
        %>
       
        <table class="table">
    <thead>
        <tr>
            <th>id</th>
            <th>Nombre producto</th>
             <th>Precio</th>
              <th>Elegir</th>
           
           
        </tr>
    </thead>
    <form action="agregarproducto.jsp" method="POST">
    <tbody>
         
       
     
       
       
       
      
        <tr>
    
        <%for(Servicios s:servicios){%>
            <td><%=s.getId()%></td>
           
             <td><%=s.getNombre()%></td>
           
            <td><%=s.getPrecio()%></td>
             
            <td><input type="checkbox" name="servicios" value="<%=s.getId()%>">  </td>             
            
          
            
        </tr>
    <%}
        
        %>
          
    </tbody>
  <td> <input type="submit" value="agregar servicios" class="btn btn-info" min="0"/></td>
         </form>
</table>
        
        
        <%}
        
        %>			
								
				
								
		 <br>
        <br>
        <br>						
								
							</div>
        
        
        
        <br>
        <br>
        <br>
        
        <div class="col-md-12" id="respuesta-ej5" style="display: none;" >
            
            <%
            String arreglo[]=request.getParameterValues("servicios");
            
            if(arreglo!=null){
                
           List<Servicios>servicios2= new ArrayList();
            %>
            
            
            <p>Usted ha elegido estos servicios por favor confirme con la cantidad</p>
            
            
            
              <table class="table">
    <thead>
        <tr>
           
            <th>Nombre producto</th>
             <th>Cantidad</th>
             
           
           
        </tr>
    </thead>
    <form action="confimadoproducto.jsp" method="POST">
    <tbody>
         
       
     
       
       
       
      
        <tr>
    
        <%for(Servicios s:servicios2){%>
            <td><%=s.getId()%></td>
           
             <td><%=s.getNombre()%></td>
           
            <td><input type="text" name="cantidad"></td>
             
                     
            
          
            
        </tr>
    <%}
        request.setAttribute("servicios",servicios2);
        %>
          
    </tbody>
  <td> <input type="submit" value="Confirmar" class="btn btn-info" min="0"/></td>
         </form>
</table>
            
            
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
</script>
</body>
</html>
