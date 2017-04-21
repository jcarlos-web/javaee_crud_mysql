<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">
<title>Listado de Alumnos</title>
	<link rel="stylesheet" href="css/bootstrap-reboot.css">
	<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>

<section class="container">
<header>
      <h1>Listado de Alumnos</h1>
      <br>
    </header>
    <nav>
      <!-- Aquí pondre el ménu-->
    </nav>

<div>
	<a href="Alumno.do?action=create" role="button" class="btn btn-primary btn-sm"> Agregar</a>
</div>


<br>
		<div class="table-responsive">
              <table class="table table-bordered table-striped table-hover">
                  <thead>
					<tr>
						<th>#</th>
						<th colspan="2">Acción</th>
						<th>Nombre</th>
						<th>Apellido paterno</th>
						<th>Apellido materno</th>
						<th>Género</th>
						<th>Semestre</th>
					</tr>
				 </thead>
				 <tbody>
					<c:forEach items="${enlaces}" var="alumno">
						<tr>
							<td><c:out value="${alumno.id }"></c:out></td>
							<td><a href="Alumno.do?action=update&id=<c:out value="${alumno.id }"/>" class="btn btn-warning btn-sm">Editar</a></td>
							<td><a href="Alumno.do?action=delete&id=<c:out value="${alumno.id }" />" class="btn btn-danger btn-sm">Eliminar</a></td>
							<td><c:out value="${alumno.nombre }"></c:out></td>
							<td><c:out value="${alumno.ap_pat }"></c:out></td>
							<td><c:out value="${alumno.ap_mat }"></c:out></td>
							<td><c:out value="${alumno.genero }"></c:out></td>
							<td><c:out value="${alumno.semestre }"></c:out></td>
						</tr>
					</c:forEach>
				 </tbody>
			</table>

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









