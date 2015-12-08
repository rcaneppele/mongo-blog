<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav class="navbar navbar-default navbar-custom navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header page-scroll">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse">
				<span class="sr-only">Mostrar Menu</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<c:url var="home" value="/home" />
			<a class="navbar-brand" href="${home}">Home</a>
		</div>

		<div class="collapse navbar-collapse" id="navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li>
					<c:url var="novo" value="/new" />
					<a href="${novo}">Novo Post</a>
				</li>
			</ul>
		</div>
	</div>
</nav>