<%-- 
    Document   : Datos_hotel
    Created on : 4/05/2016, 06:45:15 AM
    Author     : EDINSON
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
   
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>DATOS DEL HOTEL</title>

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
				<h1 class="page-header">Datos del Hotel</h1>
			</div>
		</div><!--/.row-->
									
		<div class="row">
			<div class="col-xs-12 col-md-6 col-lg-4">
				<div class="panel panel-blue panel-widget ">
					<div class="row no-padding">
						<div class="col-sm-3 col-lg-5 widget-left">
                                                    <svg class="glyph stroked bag"><svg class="glyph stroked tag"><use xlink:href="#stroked-tag"/></svg>
						</div>
						<div class="col-sm-9 col-lg-7 widget-right">
							
                                                    <div class="text-muted"><a href="Datos_habitacion.jsp">Registro de Habitaciones</a> </div>
						</div>
					</div>
				</div>
			</div>
			
			
			
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-default">
					<div class="panel-heading"><svg class="glyph stroked email"><use xlink:href="#stroked-email"></use></svg> Formulario Datos del hotel</div>
					<div class="panel-body">
						<form class="form-horizontal" action="registradoHotel.jsp" method="post">
							<fieldset>
								<!-- Name input-->
								<div class="form-group">
									<label class="col-md-2 control-label" for="name">Nombre del hotel</label>
									<div class="col-md-10">
									<input id="name" name="name" type="text" placeholder="Nombre" class="form-control" required>
									</div>
								</div>
                                                                <!-- Slogan input-->
								<div class="form-group">
									<label class="col-md-2 control-label" for="slogan">Slogan del hotel</label>
									<div class="col-md-10">
									<input id="slog" name="slog" type="text" placeholder="Slogan" class="form-control" required>
									</div>
								</div>
                                                                <!-- direccion input-->
								<div class="form-group">
									<label class="col-md-2 control-label" for="direccion">Dirección</label>
									<div class="col-md-10">
										<input id="iden" name="dir" type="text" placeholder="Dirección" class="form-control" required>
									</div>
								</div>
                                                                <!-- Telefono input-->
								<div class="form-group">
									<label class="col-md-2 control-label" for="telefono">Telefono</label>
									<div class="col-md-10">
										<input id="tel" name="tel" type="number"  class="form-control" required>
									</div>
								</div>
							
								<!-- celular input-->
								<div class="form-group">
									<label class="col-md-2 control-label" for="cel">Celular</label>
									<div class="col-md-10">
										<input id="cel" name="cel" type="number" class="form-control" required>
									</div>
								</div>
                                                                
 
                                                                   </div>	
									</div>
								</div>
								
								<!-- Form actions -->
								<div class="form-group">
									<div class="col-md-12 widget-right btn btn-danger">
										<button type="submit" class="btn btn-info btn-md pull-right">Guardar</button>
									</div>
								</div>
							</fieldset>
						</form>
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
</html>
