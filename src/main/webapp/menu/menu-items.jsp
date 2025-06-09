<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<nav class="navbar navbar-light bg-light mt-4">
			<a class="navbar-brand" href="#">Productos</a>
		</nav>
		<div class="card-group homeitem mt-4" id="menu-principal">
			<div class="card m-2" >
				<img class="card-img-top" src="https://cdn.pixabay.com/photo/2023/05/31/11/15/fish-8031138_960_720.jpg" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title">Plato</h5>
					<p class="card-text">Platos disponibles</p>
					<a href="<%= request.getContextPath()%>/LeerDatosPlato" class="btn btn-primary">Ir</a>
				</div>
			</div>
				
			<div class="card m-2" >
				<img class="card-img-top" src="https://cdn.pixabay.com/photo/2017/08/06/04/16/cupcake-2588646_1280.jpg" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title">Postres</h5>
					<p class="card-text">postres disponibls</p>
					<a href="<%= request.getContextPath()%>/LeerDatosPostre" class="btn btn-primary"  >Ir</a>
				</div>
			</div>
			
				
			<div class="card m-2" >
				<img class="card-img-top" src="https://cdn.pixabay.com/photo/2020/08/17/13/24/flower-5495384_1280.jpg" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title">Bebidas</h5>
					<p class="card-text">Bebida disponible</p>
					<a href="<%= request.getContextPath()%>/LeerDatosBebidas" class="btn btn-primary">Ir</a>
				</div>
			</div>
				
			<div class="card m-2" >
				<img class="card-img-top" src="https://cdn.pixabay.com/photo/2016/11/29/12/54/cafe-1869656_1280.jpg" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title">Menu</h5>
					<p class="card-text">menu disponibles</p>
					<a href="<%= request.getContextPath()%>/leerDatosMenu" class="btn btn-primary">Ir</a>
				</div>
			</div>
			
		</div>