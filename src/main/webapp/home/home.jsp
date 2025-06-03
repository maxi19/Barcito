<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="com.sample.core.domain.Mesa"%>
    
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/scripts/bootstrap/css/bootstrap.min.css" >
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" >

	<meta charset="ISO-8859-1">
	<title>Insert title here</title>

	<script src="<%=request.getContextPath()%>/scripts/jquery/jquery.min.js"></script>
	
	<script type="text/javascript">
			var contextPath="<%=request.getContextPath()%>";
	</script>
	<script src="<%=request.getContextPath()%>/scripts/scripts-barcito.js"></script>
	<script src="<%=request.getContextPath()%>/scripts/logout.js"></script>
	<script src="<%=request.getContextPath()%>/scripts/mesasDisponibles.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
  	<script src="https://code.jquery.com/ui/1.14.1/jquery-ui.js"></script>
	
</head>	
<body>



<div class="container">
	<nav class="navbar navbar-dark bg-dark mt-4 mb-4">
	  <div class="container">
		<a class="brand" href="#">
			<img alt="Brand" src="<%=request.getContextPath()%>/icon/food_yellow.png">
		</a>
   		<ul class="nav">
		     <li class="active">
				<button type="button" class="btn btn-dark navbar-btn" >
					<img alt="Brand" src="<%=request.getContextPath()%>/icon/drink.png">
				</button>
			</li>
			<li class="divider-vertical"></li>
				<button type="button" class="btn btn-dark navbar-btn" >
					<img alt="Brand" src="<%=request.getContextPath()%>/icon/plato.png">
				</button>
			<li class="divider-vertical"></li>
				<button type="button" class="btn btn-dark navbar-btn" >
					<img alt="Brand" src="<%=request.getContextPath()%>/icon/dessert.png">
				</button>
			<li class="divider-vertical"></li>
				<button type="button" class="btn btn-dark navbar-btn" >
					<img alt="Brand" src="<%=request.getContextPath()%>/icon/menu.png">
				</button>
			<li class="divider-vertical"></li>
			<li>
				<button type="button" class="btn btn-dark navbar-btn" id="btn-logout">
					<img alt="Brand" src="<%=request.getContextPath()%>/icon/logout.png">
				</button>
			</li>
		</ul>
 	 </div>
	   
	</nav>
	
	<section id="sec">
		<nav class="navbar navbar-light bg-light">
		<a class="navbar-brand" href="#">Mesas</a>
		</nav>
		<div class="card-group homeitem mt-4"  id="contenedorMesas"></div>
	</section>

	<section id="sec-pedidos">
	     <nav class="navbar navbar-light bg-light mt-4">
			  <a class="navbar-brand" href="#">Pedidos</a>
		</nav>
		<div class="recent_order">				
				<table id="boxPedidosSolicitados">
					<thead>
						<tr>
							<th width="25%" class="center">Titulo</th>
							<th width="12%" class="center">Precio</th>
							<th width="12%" class="center">Ver detalles</th>
						</tr>
					</thead>
					<tbody>
					<tr class="">
							<td width="25%" class="titulo">test</td>
							<td width="12%" class="precio">test</td>
							<td width="12%" class="detalles"></td>
					</tr>
					
					</tbody>
				</table>
				
		</div>
	</section>

	<section id="sec-menus">
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
	</section>

</div>



					
</body>
</html>