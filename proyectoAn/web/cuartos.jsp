<%-- 
    Document   : cuartos
    Created on : 15-may-2016, 10:24:28
    Author     : macaco
--%>

<%@page import="co.ufps.edu.dto.habitaciones"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="co.ufps.edu.dto.cuarto"%>
<%@page import="facade.ControladorNegocio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/datepicker3.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">

<!--Icons-->
<script src="js/lumino.glyphs.js"></script>
        <title>Cuartos</title>
    </head>
    
<body>
   
	<jsp:include page="menu.jsp" />
				
		
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						
					</div>
                                     <form action="verinfo.jsp" method="POST">
					<div class="panel-body">
                                           
                      
						<div class="icon-grid">
                                                     <% 
        ControladorNegocio c= new ControladorNegocio();
  List<habitaciones> habitaciones=c.listarh();
   
   
    
    %>
    
   
    
                                                    <%for(habitaciones c1:habitaciones){
                                                        
                                                        
                                                    %>
                                                    
							<div class="col-lg-3 col-md-4 col-sm-6">
                                                            <strong>Cuarto <%=c1.getId()%></strong> <em><%=c1.getEstado()%></em><br>
                                                            <strong>tipo</strong> <%=c1.getTipo()%>
                                                            <svg class="glyph stroked app-window"> <IMG SRC="<%=c1.getFoto()%>" WIDTH=200 HEIGHT=200></svg>
								
                                                               
                                                            
                                                           <pre> <button type="submit" class="btn btn-success btn-lg">ver info</button></pre>
                                                     
                                                           <p><input type="hidden"  name="id" value="<%=c1.getId()%>"></p>
							</div>
                                                         
							  

							<%}%>
                                                        
                                                        
                                                        
						</div>

					</div>
                                                </form>
					<nav>
  <ul class="pagination pagination-lg">
    <li>
      <a href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    <li><a href="#">1</a></li>
    <li><a href="#">2</a></li>
    <li><a href="#">3</a></li>
    <li><a href="#">4</a></li>
    <li><a href="#">5</a></li>
    <li>
      <a href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>

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
</body>
</html>
