$(document).ready(function(){
	var url = window.location.pathname;
	var archivo = url.substring(url.lastIndexOf('/')+1);
	if(archivo == "loginError") {
		loginFail();
	}

});

$(document).on('submit','#formLogin',function(event) {
	if($("#usuario").val().length < 1 || $("#pass").val().length < 1) {
		event.preventDefault();
		event.stopPropagation();
		$('#msglogin').css({
      		"background": "linear-gradient(to bottom, rgba(254,182,69,1) 0%,rgba(239,225,69,1) 50%,rgba(254,182,69,1) 100%)",
       		"border": "3px #FEB645 groove",
      		"border-radius": "5px"
     	});
     	$('#msglogin figure').css("background-image","url('imgs/war.png')");
     	$('#msglogin article').html("<p>No ha proporcionado todos los campos.</p>");
     	$('#msglogin').fadeIn(500);
	    $('#msglogin').delay(2000).fadeOut(500);

	}
});

function loginOK() {
	// setTimeout(function() {
		$('#msglogin').css({
	      "background": "linear-gradient(to bottom, rgba(131,219,133,0.3) 0%,rgba(175,214,175,0.3) 50%,rgba(131,219,133,0.3) 100%)",
	      "border": "3px #83DB85 groove",
	      "border-radius": "5px"
	    });
	    $('#msglogin figure').css("background-image","url('imgs/ok.png')");
	    $('#msglogin article').html("<p>Inicio de sesion valido, bienvenido.</p>");
	    $('#msglogin').fadeIn(500);
	    $('#msglogin').delay(2000).fadeOut(500);
	// }, 3000);
}

function loginFail() {
	$('#msglogin').css({
      "background": "linear-gradient(to bottom, rgba(206,39,39,1) 0%,rgba(255,48,25,1) 50%,rgba(206,39,39,1) 100%)",
      "border": "3px #CE2727 groove",
      "border-radius": "5px"
    });
    $('#msglogin figure').css("background-image","url('imgs/x.png')");
    $('#msglogin article').html("<p>Inicio de sesion no valido.</p>");
    $('#msglogin').fadeIn(500);
    $('#msglogin').delay(2000).fadeOut(500);
}

$("#formcambioclave").dialog({
	autoOpen: false,
    height: 470,
    width: 400,
    modal: true,
    show: {
    	effect: "clip",
        duration: 1000
    },
    hide: {
        effect: "clip",
        duration: 1000
    },
    buttons: {
    	"Cambiar contraseña": function() {
            if($("#user").val().length < 1) {
        		$("#user").addClass("ui-state-error");
        		$("#formcambioclave form").prepend("<div id='msgcomprobacion'>Debes Indicarnos tu usuario</div>");
        	}
        	else if($("#clave").val() != $("#reclave").val()) {
        		$("#clave").addClass("ui-state-error");
        		$("#formcambioclave form").prepend("<div id='msgcomprobacion'>Las contrase&ntilde;as no coinciden</div>");
	       	}
	       	else if($("#clave").val().length < 8 || $("#clave").val().length > 16 ) {
        		$("#clave").addClass("ui-state-error");
        		$("#formcambioclave form").prepend("<div id='msgcomprobacion'>La contrase&ntilde;a debe tener entre 8 y 16 caracteres</div>");
	       	}
	       	else {
	       		$("#formcambioclave form").submit();
	       	}
	
	       	$("#user").keypress(function(){
        		$("#user").removeClass("ui-state-error");
        		$("#msgcomprobacion").remove();
        	});
        	$("#clave").keypress(function(){
        		$("#clave").removeClass("ui-state-error");
        		$("#msgcomprobacion").remove();
        	});
        	$("#reclave").keypress(function(){
        		$("#reclave").removeClass("ui-state-error");
        		$("#msgcomprobacion").remove();
        	});
    },
    Cancelar: function() {
    	$( this ).dialog( "close" );
    }
      },
    });

$("#cambioclave").click(function() {
	$("#formcambioclave").dialog("open");
});

$("#cerrarcc").click(function() {
	$("#formcambioclave").dialog("close");
});


// $(document).on('click','#ingresar',function(event) {
// 	event.preventDefault();
// 	
//     // $('#formLogin').submit();
    
    


// });