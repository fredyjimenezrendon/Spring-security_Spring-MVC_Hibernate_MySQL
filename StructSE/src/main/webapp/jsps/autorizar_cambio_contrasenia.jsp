<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Acá Apareceran las solicitudes de cambio de contraseña</h1>

<body>
	<br><h2>Acá saldrá una solicitud de cambio de contraseña:</h2><br>
	<br><h3>Autorizar:</h3>
	<form method="get" action="CambiarContraseniaControlador">
		Desea Autorizar el cambio de contraseña de: 
		<input type="text" name="nombre" value="fulanito Fernandez">
		<input type='submit'>	
	
	</form>
<br><h3>No Autorizar:</h3><br>
<br><h3>Recordame despues:</h3><br>
</body>

</html>