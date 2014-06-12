<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="true"%>
<html lang="es">
<head>
	<meta charset="utf-8">
	<title>Bienvenido a StructSE - Acceso al sistema</title>
	<link rel="stylesheet" href="estilos/general.css">
	<link rel="stylesheet" href="estilos/login.css">
	<link rel="stylesheet" href="estilos/jquery-ui.min.css">
	<script src="js/prefixfree.min.js"></script>
	<!-- <link rel="stylesheet" href="estilos/normalize.css"> -->
</head>
<body>
	<div class="gridContainer">
		<div id="msglogin">
			<figure id="msgIcon"></figure>
			<article></article>
		</div>
		<main>
			<figure id="ilogo">
				<img src="imgs/ico-logo.png" alt="Icono StructSE">
			</figure>
			<section id="wall">
				<figure id="tlogo">
					<img src="imgs/tit-logo.png">
				</figure>
				<form id="formLogin" action="<c:url value='/auth/login_check?targetUrl=${targetUrl}' />" method='POST'>
					<input type="text" name="usuario" id="usuario" placeholder="Usuario">
					<input type="password" name="pass" id="pass" placeholder="Contraseña">
					<input type="submit" name="ingresar" id="ingresar" value="Ingresar" class="boton">
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				</form>
				<section id="izq">
					<figure id="ingreso">
						<img src="imgs/ingreso.png">
					</figure>
					<div id="cambioclave">Olvidó sus datos de acceso?</div>
				</section>
			</section>
		</main>
		<footer>
			<p>Se autoriza el uso a xxxxxxx</p>
			<p>Derechos Reservados Electrovan &copy; 2014</p>
		</footer>
	</div>
	<div id="formcambioclave" class="modales" title="Petición Cambio de Clave">
  		<p>Solicite su cambio de clave con el administrador. Todos los campos son requeridos.</p>
  		<form>
			<label for="user">Usuario</label>
	    	<input type="text" name="user" id="user">
	    	<label for="clave">Nueva Contraseña</label>
	    	<input type="password" name="clave" id="clave" value="">
	    	<label for="reclave">Repita la contraseña</label>
	    	<input type="password" name="reclave" id="reclave" value="">
 		</form>
 		<hr>
 		<p>No olvide que el administrador debe aprobar este cambio. Cuando se apruebe será notificado.</p>
	</div>
</body>
<script src="js/jquery.min.js"></script>
<script src="js/jquery-ui.min.js"></script>
<script src="js/login.js"></script>
</html>
