<%-- 
    Document   : editar_empleado
    Created on : 25/05/2016, 06:05:01 AM
    Author     : EDINSON
--%>

<%@page import="co.ufps.edu.dao.empleadoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

     <%
        int Param1= Integer.parseInt(request.getParameter ("id"));
        String Param2= request.getParameter ("tabla");
        %>
 

<!DOCTYPE>
<html>
    <head>
   
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>ACTUALIZACION DE EMPLEADO</title>

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
		<jsp:include page="menuadm.jsp"></jsp:include>
									
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header text-center">Actualizar datos del empleado</h1>
			</div>
		</div><!--/.row-->
		
		
		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-default">
                                    <%
                                        out.println("<div class=\"panel-heading\"><svg class=\"glyph stroked email\"><use xlink:href=\"#stroked-email\"></use></svg> Actualizacion datos del empleado "+Param1+"</div>");
					%>
                                                <div class="panel-body">
						<form class="form-horizontal" action="actualizarempleado.jsp" method="post">
							<fieldset>
								<!-- id input-->
								<% 
                                                                    out.print("<div class=\"form-group\"> <label class=\"col-md-2 control-label\" for=\"idh\">Id del empleado </label>"+
									"<div class=\"col-md-10\">"+
									"<input id=\"idh\" name=\"idh\"type=\"hidden\"  class=\"form-control\" value=\""+Param1+"placeholder=\""+Param1+"\">"+
									"<p class=\"form-control-static\">"+Param1+" Empleado "+Param2+"</p>"+
                                                                            "</div></div>");
                                                                                %>
                                                              
								<!-- Name input-->
								<div class="form-group">
									<label class="col-md-2 control-label" for="name">Nombre del empleado</label>
									<div class="col-md-10">
									<input id="name" name="name" type="text" placeholder="Nombre" class="form-control" required>
									</div>
								</div>
                                                                <!-- apellido input-->
								<div class="form-group">
									<label class="col-md-2 control-label" for="apell">Apellido del empleado</label>
									<div class="col-md-10">
									<input id="apell" name="apell" type="text" placeholder="Apellidos" class="form-control" required>
									</div>
								</div>
                                                                  <!-- cedula input-->
								<div class="form-group">
									<label class="col-md-2 control-label" for="cedula">Documento de identificacion</label>
									<div class="col-md-10">
										<input id="cedula" name="cedula" type="number"  class="form-control" required>
									</div>
								</div>
                                                                 
                                                                  <!-- contraseña input-->
								<div class="form-group">
									<label class="col-md-2 control-label" for="contr">Contraseña del usuario</label>
									<div class="col-md-10">
									<input id="cont" name="contr" type="text" placeholder="xxxxxxx" class="form-control" required>
									</div>
								</div>
							
                                                                <!-- direccion email input-->
								<div class="form-group">
									<label class="col-md-2 control-label" for="email">Email</label>
									<div class="col-md-10">
										<input id="email" name="email" type="email" placeholder="ejemplo@ejm.com" class="form-control">
									</div>
								</div>
                                                                   <!-- contraseña input-->
								<div class="form-group">
									<label class="col-md-2 control-label" for="contr">Contraseña del usuario</label>
									<div class="col-md-10">
									<input id="contr" name="contr" type="text" placeholder="xxxxxxx" class="form-control" required>
									</div>
								</div>
							
                                                                <!-- Telefono input-->
								<div class="form-group">
									<label class="col-md-2 control-label" for="telefono">Telefono</label>
									<div class="col-md-10">
										<input id="tel" name="tel" type="number"  class="form-control" required>
									</div>
								</div>
							
								<!-- tipo  input-->
								<div class="form-group">
									<label class="col-md-2 control-label" for="cargo">Cargo del empleado</label>
									<div class="col-md-10">
									 <select class="form-control" name="tipo">
                                                                        <option selected value="0"> Elige una opción </option>
                                                                        <%
                                                                        empleadoDAO em=new empleadoDAO();
                                                                        String m=em.cargos();
                                                                        out.println(m);
                                                                        %>
									</select>	
									</div>
								</div>
                                                                
 
								<!-- Form actions -->
								<div class="form-group">
									<div class="col-md-12 widget-right btn btn-danger">
										<button type="submit" class="btn btn-info btn-md pull-right">Modificar</button>
									</div>
								</div>
							</fieldset>
						</form>
                                                                          </div>	
									</div>
								</div>
                                                                        </div>
                                       <div class="row">
			<div class="col-md-12">
				<h1 class="page-header text-center">Listado empleados</h1>
			</div>
		</div><!--/.row-->
		<div class="col-md-12">
                                              <%
            empleadoDAO h=new empleadoDAO();
           out.print(h.todosempleados());
            %>
                </div>
					
				</div>
				
        
 
		  

	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/chart.min.js"></script>
	<script src="js/chart-data.js"></script>
	<script src="js/easypiechart.js"></script>
	<script src="js/easypiechart-data.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script>
		

		$(window).on('resize', function () {
		  if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		})
		$(window).on('resize', function () {
		  if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		})
	</script>	
</body>

</html>

