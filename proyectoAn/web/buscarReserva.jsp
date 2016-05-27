

<%@page import="java.text.SimpleDateFormat"%>
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

 



        <title>Buscar</title>
    </head>
    <body>
       
        
        
       
        
        
        
        
        
        
        <jsp:include page="menu.jsp" />
        
	
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Buscar Reserva</h1>
			</div>
		</div><!--/.row-->
				
		
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Reservas</div>
                                        
        
            
     
        
					<div class="panel-body">
						<div class="col-md-6">
                                                    <form  method="GET" action="buscarReserva.jsp" >
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
        Reserva reserva2=c.buscarReservaporHuesped(bus);
         SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
         
         
        %>
       
        <table class="table">
    <thead>
        <tr>
            <th>id</th>
            <th>cliente</th>
              <th>habitacion</th>
            <th>Fecha inicial</th>
            <th>Fecha final</th>
            <th>Elegir</th>
        </tr>
    </thead>
    <tbody>
         
       
     
       
       
       
      
        <tr>
    <form action="generarf.jsp" method="POST">
            <td><%=reserva2.getId()%></td>
            <%Cliente  creservado=c.ListarClientePorid(reserva2.getId_cliente());%>
             <td><%=creservado.getNombre()%></td>
            <td>106  </td>
            <td><%=sdf.format(reserva2.getFechainicio().getTime())%></td>
               <td><%=sdf.format(reserva2.getFechafin().getTime())%></td>
              <%//session.setAttribute("reserva",reserva);%>
            <td> <input type="submit" value="Generar Factura" class="btn btn-info" min="0"/></td>
            
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
        <div class ="col-md-12"  style="text-align: center;"> <a href="#" id="alternar-respuesta-ej5" class="btn btn-info" >Buscar Por Cuarto</a></div>
        
        
        <br>
        <br>
        <br>
        
        <div class="col-md-12" id="respuesta-ej5" style="display: none;" >
            
            
            <form  method="GET" action="buscar.jsp" >
							<form role="form">
							
								<div class="form-group">
									<label>Digite el numero del cuarto</label>
									<input class="form-control" placeholder="Cedula" name="cc">
								</div>
																
								<div class="form-group">
                                                                    
									
								<button type="submit" class="btn btn-primary">Buscar</button>
                                                                 
								
								</div>
								 </form>
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
            $(this).text('Buscar Por cuarto');
            e.preventDefault();
        }
  
    );
  
});
</script>
</body>
</html>
