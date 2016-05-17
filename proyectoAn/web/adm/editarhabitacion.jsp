<%-- 
    Document   : editar
    Created on : 14/05/2016, 05:46:44 PM
    Author     : EDINSON
--%>

  
 <%
        int Param1= Integer.parseInt(request.getParameter ("id"));
        System.out.println(Param1+"eliminar");
        %>
  <%@page import="co.ufps.edu.dao.daohabitaciones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
    <head>
   
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>REGISTRO ACTUALIZACION DE HABITACIONES</title>

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
				<h1 class="page-header text-center">Actualizar datos de las habitacion</h1>
			</div>
		</div><!--/.row-->
		
		
		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-default">
                                    <%
                                        out.println("<div class=\"panel-heading\"><svg class=\"glyph stroked email\"><use xlink:href=\"#stroked-email\"></use></svg> Actualizacion datos de la habitacion "+Param1+"</div>");
					%>
                                                <div class="panel-body">
						<form class="form-horizontal" action="actualizarhabitacion.jsp" method="post">
							<fieldset>
								<!-- id input-->
								<% ;
                                                                    out.print("<div class=\"form-group\"> <label class=\"col-md-2 control-label\" for=\"idh\">Id Habitacion </label>"+
									"<div class=\"col-md-10\">"+
									"<input id=\"idh\" name=\"idh\"type=\"hidden\"  class=\"form-control\" value=\""+Param1+"placeholder=\""+Param1+"\">"+
									"<p class=\"form-control-static\"> Habitacion "+Param1+"</p>"+
                                                                            "</div></div>");
                                                                                %>
                                                                <!-- tipo input-->
								<div class="form-group">
									<label class="col-md-2 control-label" for="tipo">Tipo de Habitacion</label>
									<div class="col-md-10">
                                                                            <select class="form-control" name="tipo">
                                                                        <option selected value="0"> Elige una opción </option>
                                                                        <%
                                                                        daohabitaciones hab=new daohabitaciones();
                                                                        String m=hab.tiposHabitaciones();
                                                                        out.println(m);
                                                                        %>
									</select>
									</div>
								</div>
                                                                <!-- Estado input-->
								<div class="form-group">
									<label class="col-md-2 control-label" for="estado">Estado de la Habitacion</label>
									<div class="col-md-10">
										 <select class="form-control" name="estado">
                                                                        <option selected value="0"> Elige una opción </option>
                                                                        <%
                                                                        
                                                                        String n=hab.estados();
                                                                        out.println(n);
                                                                        %>
									</select>
									</div>
								</div>
							
								<!-- foto input-->
								<div class="form-group">
									<label class="col-md-2 control-label" for="foto">Direccion de la foto</label>
									<div class="col-md-10">
										<input id="foto" name="foto" type="text" placeholder="prin/img/property_3.jpg" class="form-control">
									</div>
								</div>
                                                                
 
                                                                   </div>	
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
                                            <div class="row">
			<div class="col-lg-12">
				<h1 class="page-header text-center">Listado de las habitaciones</h1>
			</div>
		</div><!--/.row-->
		<div class="col-md-12">
                                              <%
            daohabitaciones h=new daohabitaciones();
           out.print(h.habitaciones());
            %>
                </div>
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