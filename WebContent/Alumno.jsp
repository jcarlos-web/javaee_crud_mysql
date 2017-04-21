<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">
<title>Matenimiento Alumno</title>
	<link rel="stylesheet" href="css/bootstrap-reboot.css">
	<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<section class="container">

<header>
      
      <br>
    </header>
    <nav>
      <!-- Aquí pondre el ménu-->
    </nav>

<div class="row">
	<div class="col-lg-4"></div>
	
	<div class="col-lg-4">
	<h1>Usuario</h1>
		<form action="Alumno.do" method="post" class="form-horizontal">
				<fieldset>
					<div class="form-group">
						<input type="hidden" class="form-control" id="id" name="id" value="<c:out value="${enlace.id}" />"><br>
					</div>
					<div class="form-group">
						<label for="nombre">Nombre</label><br>
						<input type="text" class="form-control" placeholder="Ingresa nombre" id="nombre" name="nombre" value="<c:out value="${enlace.nombre}" />"><br>
					</div>
					<div class="form-group">
						<label for="ap_pat">Apellido paterno</label><br>
						<input type="text" class="form-control" placeholder="Ingresa apellido materno" id="ap_pat" name="ap_pat" value="<c:out value="${enlace.ap_pat}" />"><br>
					</div>
					<div class="form-group">
						<label for="ap_mat">Apellido materno</label><br>
						<input type="text" class="form-control" placeholder="Ingresa apellido paterno" id="ap_mat" name="ap_mat" value="<c:out value="${enlace.ap_mat}" />"><br>
					</div>
					<div class="form-group">
						<label for="genero">Género</label><br>
						<input type="text" class="form-control" placeholder="Ingresa apellido materno" id="genero" name="genero" value="<c:out value="${enlace.genero}" />"><br>
					</div>
					<div class="form-group">
						<label for="semestre">Semestre</label><br>
						<input type="text" class="form-control" placeholder="Ingresa semestre" id="semestre" name="semestre" value="<c:out value="${enlace.semestre}" />"><br>
					</div>
					<br>
					<input type="submit" class="btn btn-primary btn-block" value="Ok">	
				</fieldset>
		</form>
	</div>
	
	<div class="col-lg-4"></div>
</div>


</section>

<br><br>
  <footer>
    <center><p>jCarlos &copy 2017</p></center>
  </footer>
<br><br>
<script src="js/bootstrap.min.js"></script>
<script src="js/jQuery v3.2.1.js"></script>
</body>
</html>