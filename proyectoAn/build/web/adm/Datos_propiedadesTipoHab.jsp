<%-- 
    Document   : Datos_hotel
    Created on : 4/05/2016, 06:45:15 AM
    Author     : EDINSON
--%>

<%@page import="co.ufps.edu.dao.tipohabpropiedades"%>
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
		<jsp:include page="menuadm.jsp"></jsp:include>
									
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Datos de las propiedades  del tipo de habitacion</h1>
			</div>
		</div><!--/.row-->
			
			
			
		
		
		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-default">
					<div class="panel-heading"><svg class="glyph stroked email"><use xlink:href="#stroked-email"></use></svg> Formulario propiedades de los tipos de habitacion</div>
					<div class="panel-body">
						<form class="form-horizontal" action="registrado_prop_por_tipo.jsp" method="post">
							<fieldset>
								<!-- tipo input-->
								<div class="form-group">
									<label class="col-md-2 control-label" for="tipo">Tipo de Habitacion</label>
									<div class="col-md-10">
                                                                           <select class="form-control" name="tipo">
                                                                        <option selected value="0"> Elige una opción </option>
                                                                        <%
                                                                        tipohabpropiedades hab=new tipohabpropiedades();
                                                                       
                                                                        String m=hab.tipos();
                                                                        out.println(m);
                                                                        %>
									</select>
									
									</div>
								</div>
                                                                <!-- descripcion input-->
								<div class="form-group">
									<label class="col-md-2 control-label" for="idP">Nombre de la propiedad</label>
									<div class="col-md-10">
                                                                           <%
                                                                        
                                                                        String n=hab.propiedades();
                                                                        out.println(n);
                                                                        %>
									
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
				 </div>	
									</div>
								
        
              <div class="row">
			<div class="col-md-12">
				<h1 class="page-header text-center">Listado caracteristicas del tipo de habitaciones</h1>
			</div>
		</div><!--/.row-->
		<div class="col-md-12">
                                              <%
            tipohabpropiedades h=new tipohabpropiedades();
           out.print(h.tabla());
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
</html>
