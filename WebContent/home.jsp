<!doctype html>
<html lang="pt">
<head>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<title>Mongo Blog</title>
	
	<link rel="stylesheet" href="resources/css/bootstrap.min.css" />
	<link rel="stylesheet" href="resources/css/font-awesome.min.css" />
	<link rel="stylesheet" href="resources/css/clean-blog.min.css" />
	<link rel="stylesheet" href="resources/css/blog.css" />
</head>

<body>
	<jsp:include page="/WEB-INF/layout/menu.jsp"/>
	
	<header class="intro-header">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
					<div class="site-heading">
						<h1>Java EE Blog</h1>
						<hr class="small">
						<span class="subheading">JAX-RS 2.0; CDI 1.1; MONGODB</span>
					</div>
				</div>
			</div>
		</div>
	</header>
	
	<main>
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
					<div class="post-preview">
						<a href="post.html">
							<h2 class="post-title">
								Man must explore, and this is exploration at its greatest
							</h2>
						</a>
						<p class="post-meta">Posted by <a href="#">Start Bootstrap</a> on September 24, 2014</p>
					</div>
				</div>
			</div>
		</div>
	</main>
	
	<jsp:include page="/WEB-INF/layout/footer.jsp" />
	
	<script type="text/javascript" src="resources/js/jquery.min.js"></script>
	<script type="text/javascript" src="resources/js/blog.js"></script>
</body>
</html>
