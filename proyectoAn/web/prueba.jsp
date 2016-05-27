<%-- 
    Document   : prueba
    Created on : 18-may-2016, 0:44:51
    Author     : macaco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://code.jquery.com/jquery-1.11.1.min.js"></script> 
<script src="https://code.jquery.com/jquery-migrate-1.2.1.min.js"></script> 
<script>
// jQuery
$(document).ready(function(){ 
  
    $('#alternar-respuesta-ej5').toggle( 
  
        // Primer click
        function(e){ 
            $('#respuesta-ej5').slideDown();
            $(this).text('Ocultar respuesta');
            e.preventDefault();
        }, // Separamos las dos funciones con una coma
      
        // Segundo click
        function(e){ 
            $('#respuesta-ej5').slideUp();
            $(this).text('Ver respuesta');
            e.preventDefault();
        }
  
    );
  
});
</script>
        
        
        
        <title>JSP Page</title>
    </head>
    <body>
        <form>
Nombre: <input type="text" name="nombre">
<br>
<a href="#" id="alternar-respuesta-ej5">Mostrar el panel oculto</a>
<br>
<div id="respuesta-ej5" style="display: none;">
Dato para mayores de edad: <input type="text" name="mayores_edad">
</div>
</form>
    </body>
</html>
