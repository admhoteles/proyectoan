<%-- 
    Document   : generarf
    Created on : 20-may-2016, 7:27:41
    Author     : macaco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:include page="menu.jsp" />
        
        <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/datepicker3.css" rel="stylesheet">
<link href="css/bootstrap-table.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">

<!--Icons-->
<script src="js/lumino.glyphs.js"></script>
        <title>Facturar</title>
    </head>
    <body>
       
     
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Facturar</h1>
			</div>
		</div><!--/.row-->
				
		
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Factura</div>
					<div class="panel-body">
						<table data-toggle="table">
						    <thead>
						    <tr>
						        <th data-field="state" data-checkbox="true" > ID</th>
						        <th data-field="id" data-sortable="true">Detalle</th>
						        <th data-field="name"  data-sortable="true">Descripcion</th>
						        <th data-field="price" data-sortable="true">Total a pagar</th>
                                                          
						    </tr>
						    </thead>
                                                    
                                                     <tbody>
     
        <tr>
            <td>10</td>
            <td>cuarto con aire acondicionado, y nevera</td>
            <td>cuarto para 4 personas</td>
            <td>$120000</td>
        </tr>
    
       
    </tbody>
						</table>
					</div>
				</div>
			</div>
			<div class="panel-body">
						<button type="submit" class="btn btn-success btn-lg">Imprimir</button>
					</div>
		</div><!--/.row-->	
		<div class="row">
			<div class="col-md-6">
				<div class="panel panel-default">
					<div class="panel-heading">Informacion Servicios Adicionales</div>
					<div class="panel-body">
						<table data-toggle="table" >
						    <thead>
						    <tr>
						        <th data-field="id" data-align="right">Item ID</th>
						        <th data-field="name">Item Name</th>
						        <th data-field="price">Item Price</th>
						    </tr>
						    </thead>
						</table>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="panel panel-default">
					<div class="panel-heading">Huesped a Facturar</div>
					<div class="panel-body">
						<table data-toggle="table" id="table-style"  data-row-style="rowStyle">
						    <thead>
						    <tr>
						        <th data-field="id" data-align="right" >id</th>
						        <th data-field="name" >Nombre</th>
						        <th data-field="price" >Nacionlaidad</th>
						    </tr>
						    </thead>
                                                                                   <tbody>
     
        <tr>
            <td>10</td>
            <td>huesped1  </td>
            <td>Colombiana</td>
            
        </tr>
    
       
    </tbody>
		
                                                    
						</table>
						
					</div>
				</div>
			</div>
		</div><!--/.row-->	
		
		
	</div><!--/.main-->

	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/chart.min.js"></script>
	<script src="js/chart-data.js"></script>
	<script src="js/easypiechart.js"></script>
	<script src="js/easypiechart-data.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script src="js/bootstrap-table.js"></script>
	
        
        
    </body>
</html>

    </body>
</html>
