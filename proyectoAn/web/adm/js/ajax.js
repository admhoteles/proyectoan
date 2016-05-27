function consultarPreconteo() { 


    var usuario = document.getElementById("name").value;
    alert("sirve");
    var xhttp = new XMLHttpRequest();
    var msg = "";
    var x = 5
    xhttp.onreadystatechange = function () {
        if (xhttp.readyState == 4 && xhttp.status == 200) {
            if (xhttp.responseText.indexOf('error') > -1) {
                msg = "error";
                alert('error');
            } else {
                $.unblockUI();
                var sub = xhttp.responseText;
                toastr.options = {
                    "closeButton": false,
                    "debug": false,
                    "newestOnTop": false,
                    "progressBar": false,
                    "positionClass": "toast-top-center",
                    "preventDuplicates": false,
                    "onclick": null,
                    "showDuration": "300",
                    "hideDuration": "1000",
                    "timeOut": "5000",
                    "extendedTimeOut": "1000",
                    "showEasing": "swing",
                    "hideEasing": "linear",
                    "showMethod": "fadeIn",
                    "hideMethod": "fadeOut"
                };
                toastr.success("Ha ocurrido un error al asignar aseadora", "Ooops!");
                $.growlUIE('titulo','texto');
                document.getElementById('algo').innerHTML = sub;
            }
        }
    };

    $.blockUI({
        message: 'Registro',
        css: {
            border: 'none',
            padding: '15px',
            backgroundColor: '#000',
            '-webkit-border-radius': '10px',
            '-moz-border-radius': '10px',
            opacity: .5,
            color: '#fff'
        }});
    var text = "ingresaraseo.jsp?vari=" + usuario;
    xhttp.open("post", text, true); 
    xhttp.send();
}