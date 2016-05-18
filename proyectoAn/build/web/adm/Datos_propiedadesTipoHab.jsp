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
<title>PROPIEDADES DEL TIPO DE HABITACION</title>

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
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#sidebar-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"><span>Hotel</span>Admin</a>
				<ul class="user-menu">
					<li class="dropdown pull-right">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> User <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> Profile</a></li>
							<li><a href="#"><svg class="glyph stroked gear"><use xlink:href="#stroked-gear"></use></svg> Settings</a></li>
							<li><a href="#"><svg class="glyph stroked cancel"><use xlink:href="#stroked-cancel"></use></svg> Logout</a></li>
						</ul>
					</li>
				</ul>
			</div>
							
		</div><!-- /.container-fluid -->
	</nav>
		
	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		<form role="search">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
			</div>
		</form>
		<ul class="nav menu">
			<li><a href="tables.html"><svg class="glyph stroked table"><use xlink:href="#stroked-table"></use></svg> Inicio</a></li>
                        <li><a href="index.html"><svg class="glyph stroked dashboard-dial"><use xlink:href="#stroked-dashboard-dial"></use></svg> Huespedes</a></li>
			<li class="active"><a href="apartado.html"><svg class="glyph stroked calendar"><use xlink:href="#stroked-calendar"></use></svg> Apartado</a></li>
			<li><a href="charts.html"><svg class="glyph stroked line-graph"><use xlink:href="#stroked-line-graph"></use></svg> Cheking</a></li>
			<li><a href="Datos_hotel.jsp"><svg class="glyph stroked app-window"><use xlink:href="#stroked-app-window"></use></svg> Datos del Hotel</a></li>
			
			<li class="parent ">
				
				<ul class="children collapse" id="sub-item-1">
					<li>
						<a class="" href="#">
							<svg class="glyph stroked chevron-right"><use xlink:href="#stroked-chevron-right"></use></svg> Sub Item 1
						</a>
					</li>
					<li>
						<a class="" href="#">
							<svg class="glyph stroked chevron-right"><use xlink:href="#stroked-chevron-right"></use></svg> Sub Item 2
						</a>
					</li>
					<li>
						<a class="" href="#">
							<svg class="glyph stroked chevron-right"><use xlink:href="#stroked-chevron-right"></use></svg> Sub Item 3
						</a>
					</li>
				</ul>
			</li>
			<li role="presentation" class="divider"></li>
			<li><a href="login.html"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> Login Page</a></li>
		</ul>
		
	</div><!--/.sidebar-->
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">		
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#"><svg class="glyph stroked home"><use xlink:href="#stroked-home"></use></svg></a></li>
				<li class="active">Icons</li>
			</ol>
		</div><!--/.row-->
									
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Datos de las propiedades  del tipo de habitacion</h1>
			</div>
		</div><!--/.row-->
			
			
			
		
		
		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-default">
					<div class="panel-heading"><svg class="glyph stroked email"><use xlink:href="#stroked-email"></use></svg> Formulario Datos del hotel</div>
					<div class="panel-body">
						<form class="form-horizontal" action="registrado_tipo_prop.jsp" method="post">
							<fieldset>
								<!-- tipo input-->
								<div class="form-group">	
                                                                        <label class="col-md-2 control-label" for="idT">Tipo de la habitacion</label>
									<div class="col-md-10">
									<!-- seleccione tipo y guardar la id <input id="idT" name="idh" type="number"  class="form-control" required>-->
									</div>
								</div>
                                                                <!-- descripcion input-->
								<div class="form-group">
									<label class="col-md-2 control-label" for="idP">Nombre de la propiedad</label>
									<div class="col-md-10">
                                                                            <!-- aqui va una lista-->
									
									</div>
								</div>
                                                                <!-- propiedas que contiene -->
								<div class="form-group">
									<label class="col-md-7 control-label" for="estado">Propiedades actuales del tipo de Habitacion</label>
									<div class="col-md-10">
										<!-- aqui va una lista-->
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
