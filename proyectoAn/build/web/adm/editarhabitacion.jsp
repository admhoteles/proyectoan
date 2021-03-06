<%-- 
    Document   : editar
    Created on : 14/05/2016, 05:46:44 PM
    Author     : EDINSON
--%>

  
 <%
        int Param1= Integer.parseInt(request.getParameter ("id"));
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
		<jsp:include page="menuadm.jsp"></jsp:include>
									
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
								<% 
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
			<div class="col-lg-12">
				<h1 class="page-header text-center">Listado tipo de las habitaciones</h1>
			</div>
		</div><!--/.row-->
		<div class="col-md-12">
                                              <%
            daohabitaciones h=new daohabitaciones();
           out.print(h.habitaciones());
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
