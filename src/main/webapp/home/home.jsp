<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="com.sample.core.domain.Mesa"%>
    
<!DOCTYPE html>
<html>
<head>

    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

	<link rel="stylesheet" href="<%=request.getContextPath()%>/scripts/bootstrap/css/bootstrap.min.css" >
	<script src="<%=request.getContextPath()%>/scripts/jquery/jquery.min.js"></script>
	<script src="<%=request.getContextPath()%>/scripts/scripts-barcito.js"></script>
	<script src="<%=request.getContextPath()%>/scripts/logout.js"></script>
	<script src="<%=request.getContextPath()%>/scripts/mesasDisponibles.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
  	<script src="https://code.jquery.com/ui/1.14.1/jquery-ui.js"></script>
	<script type="text/javascript">
			var contextPath="<%=request.getContextPath()%>";
	</script>

	 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
	
</head>	
<body>
<div class="container">

	<nav class="navbar navbar-expand-md navbar-dark bg-dark">
	<div class="container-fluid">
	<!-- icono o nombre -->
	<a class="navbar-brand" href="#">
		<img alt="Brand" src="<%=request.getContextPath()%>/icon/food_yellow.png">
		<span class="text-warning">Intelio</span>
	</a>
	<!-- boton del menu -->
	<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#menu" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
		<!-- elementos del menu colapsable -->
	<div class="collapse navbar-collapse" id="menu">
		<ul class="navbar-nav me-auto">
		<li class="nav-item">	
			<a class="nav-link active" aria-current="page" href="#">Home</a>
		</li>
		<li class="nav-item dropdown">
			<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
			Productos
			</a>

			<ul class="dropdown-menu bg-secondary" aria-labelledby="navbarDropdown">
			<li>
				<a class="dropdown-item" href="#">
					<img alt="Brand" src="<%=request.getContextPath()%>/icon/plato.png">
				</a>
			</li>
			<li>
				<a class="dropdown-item" href="#">
					<img alt="Brand" src="<%=request.getContextPath()%>/icon/drink.png">
				</a>
			</li>
			<li>
				<a class="dropdown-item" href="#">
					<img alt="Brand" src="<%=request.getContextPath()%>/icon/dessert.png">
				</a>
			<li>   
			<li>
				<a class="dropdown-item" href="#">
					<img alt="Brand" src="<%=request.getContextPath()%>/icon/menu.png">
				</a>
			</li>
			</ul>
		</li>
		</ul>

		<hr class="d-md-none text-white-50">
		<!-- enlaces redes sociales -->
		<ul class="navbar-nav  flex-row flex-wrap text-light">

		<li class="nav-item col-6 col-md-auto p-3">
			<i class="bi bi-twitter"></i>
			<small class="d-md-none ms-2">Twitter</small>  
		</li>

		<li class="nav-item col-6 col-md-auto p-3">
			<i class="bi bi-github"></i>
			<small class="d-md-none ms-2">GitHub</small> 
		</li>

		<li class="nav-item col-6 col-md-auto p-3">
			<i class="bi bi-whatsapp"></i>
			<small class="d-md-none ms-2">WhatsApp</small>
		</li>

		<li class="nav-item col-6 col-md-auto p-3">
			<i class="bi bi-facebook"></i>
			<small class="d-md-none ms-2">Facebook</small>
		</li>

		</ul>
		
		<!--boton Informacion -->

		<form class="d-flex">
		<button class="btn btn-outline-warning d-none d-md-inline-block " type="button" id="btn-logout">
			<img alt="Brand" src="<%=request.getContextPath()%>/icon/logout.png">
		</button>
		</form>
	</div>
	
	</div>  
	</nav>

	<section id="sec">
		<jsp:include page="/mesa/mesas.jsp">
		      <jsp:param name="" value=""/>
		</jsp:include> 
	</section>

	<section id="sec-pedidos">
		<jsp:include page="/pedido/pedidos-items.jsp">
		      <jsp:param name="" value=""/>
		</jsp:include> 
	</section>

	<section id="sec-menus">
		<jsp:include page="/menu/menu-items.jsp">
		      <jsp:param name="" value=""/>
		</jsp:include> 
	</section>

</div>

 <script src="<%=request.getContextPath()%>/scripts/bootstrap/js/bootstrap.bundle.min.js" ></script>
			
</body>																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
</html>