<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="context" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<!-- TODO: favicon -->
<!-- <link rel="icon" href="../../favicon.ico"> -->

<title>Haiki</title>

<!-- Bootstrap core CSS -->
<link rel='stylesheet'
	href="${context}/webjars/bootstrap/3.1.0/css/bootstrap.min.css">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<!-- <script src="../../assets/js/ie-emulation-modes-warning.js"></script> -->

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<!-- Custom styles for this template -->
<link href="carousel.css" rel="stylesheet">
</head>
<!-- NAVBAR
================================================== -->
<body>
	<div class="navbar-wrapper">
		<div class="container">

			<nav class="navbar navbar-inverse navbar-static-top">
				<div class="container">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed"
							data-toggle="collapse" data-target="#navbar"
							aria-expanded="false" aria-controls="navbar">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#">HAIKI</a>
					</div>
					<div id="navbar" class="navbar-collapse collapse">
						<ul class="nav navbar-nav">
							<li class="active"><a href="#">Home</a></li>
							<li><a href="${context}/hikes/admin.html">Manage hikes</a></li>
<!-- 							<li><a href="#contact">Contact</a></li> -->
<!-- 							<li class="dropdown"><a href="#" class="dropdown-toggle" -->
<!-- 								data-toggle="dropdown" role="button" aria-haspopup="true" -->
<!-- 								aria-expanded="false">Dropdown <span class="caret"></span></a> -->
<!-- 								<ul class="dropdown-menu"> -->
<!-- 									<li><a href="#">Action</a></li> -->
<!-- 									<li><a href="#">Another action</a></li> -->
<!-- 									<li><a href="#">Something else here</a></li> -->
<!-- 									<li role="separator" class="divider"></li> -->
<!-- 									<li class="dropdown-header">Nav header</li> -->
<!-- 									<li><a href="#">Separated link</a></li> -->
<!-- 									<li><a href="#">One more separated link</a></li> -->
<!-- 								</ul></li> -->
						</ul>
					</div>
				</div>
			</nav>

		</div>
	</div>


	<!-- Carousel
    ================================================== -->
	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img class="first-slide"
					src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw=="
					alt="First slide">
				<div class="container">
					<div class="carousel-caption">
						<h1>${hikeList.hikes[0].title}</h1>
						<p>${hikeList.hikes[0].description}</p>
					</div>
				</div>
			</div>
			<div class="item">
				<img class="second-slide"
					src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw=="
					alt="Second slide">
				<div class="container">
					<div class="carousel-caption">
						<h1>${hikeList.hikes[1].title}</h1>
						<p>${hikeList.hikes[1].description}</p>
					</div>
				</div>
			</div>
			<div class="item">
				<img class="third-slide"
					src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw=="
					alt="Third slide">
				<div class="container">
					<div class="carousel-caption">
						<h1>${hikeList.hikes[2].title}</h1>
						<p>${hikeList.hikes[2].description}</p>
					</div>
				</div>
			</div>
		</div>
		<a class="left carousel-control" href="#myCarousel" role="button"
			data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
			aria-hidden="true"></span> <span class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel" role="button"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>
	<!-- /.carousel -->

	<!-- START THE FEATURETTES -->

	<div class="container">

		<div class="blog-header">
			<h1 class="blog-title">Haiki Hikes</h1>
			<p class="lead blog-description">Here are all our hikes :)</p>
		</div>

		<div class="row">

			<div class="col-sm-8 blog-main">

				<c:forEach items="${hikeList.hikes}" var="element">
					<div class="blog-post">
						<h2 class="blog-post-title">${element.title}</h2>
						<!--             <p class="blog-post-meta">December 23, 2013 by <a href="#">Jacob</a></p> -->
						<p>${element.description}</p>
						<hr class="featurette-divider">
					</div>
					<!-- /.blog-post -->
				</c:forEach>
				<!--           <nav> -->
				<!--             <ul class="pager"> -->
				<!--               <li><a href="#">Previous</a></li> -->
				<!--               <li><a href="#">Next</a></li> -->
				<!--             </ul> -->
				<!--           </nav> -->

			</div>
			<!-- /.blog-main -->

		</div>
		<!-- /.row -->

	</div>
	<!-- /.container -->


	<!-- 	<div class="row featurette"> -->
	<!-- 		<div class="col-md-7"> -->
	<!-- 			<h2 class="featurette-heading"> -->
	<!-- 				First featurette heading. <span class="text-muted">It'll blow -->
	<!-- 					your mind.</span> -->
	<!-- 			</h2> -->
	<!-- 			<p class="lead">Donec ullamcorper nulla non metus auctor -->
	<!-- 				fringilla. Vestibulum id ligula porta felis euismod semper. Praesent -->
	<!-- 				commodo cursus magna, vel scelerisque nisl consectetur. Fusce -->
	<!-- 				dapibus, tellus ac cursus commodo.</p> -->
	<!-- 		</div> -->
	<!-- 			<div class="col-md-5"> -->
	<!-- 				<img class="featurette-image img-responsive center-block" -->
	<!-- 					data-src="holder.js/500x500/auto" alt="Generic placeholder image"> -->
	<!-- 			</div> -->
	</div>

	<!-- 		<hr class="featurette-divider"> -->

	<!-- 		<div class="row featurette"> -->
	<!-- 			<div class="col-md-7 col-md-push-5"> -->
	<!-- 				<h2 class="featurette-heading"> -->
	<!-- 					Oh yeah, it's that good. <span class="text-muted">See for -->
	<!-- 						yourself.</span> -->
	<!-- 				</h2> -->
	<!-- 				<p class="lead">Donec ullamcorper nulla non metus auctor -->
	<!-- 					fringilla. Vestibulum id ligula porta felis euismod semper. -->
	<!-- 					Praesent commodo cursus magna, vel scelerisque nisl consectetur. -->
	<!-- 					Fusce dapibus, tellus ac cursus commodo.</p> -->
	<!-- 			</div> -->
	<!-- 			<div class="col-md-5 col-md-pull-7"> -->
	<!-- 				<img class="featurette-image img-responsive center-block" -->
	<!-- 					data-src="holder.js/500x500/auto" alt="Generic placeholder image"> -->
	<!-- 			</div> -->
	<!-- 		</div> -->

	<!-- 		<hr class="featurette-divider"> -->

	<!-- 		<div class="row featurette"> -->
	<!-- 			<div class="col-md-7"> -->
	<!-- 				<h2 class="featurette-heading"> -->
	<!-- 					And lastly, this one. <span class="text-muted">Checkmate.</span> -->
	<!-- 				</h2> -->
	<!-- 				<p class="lead">Donec ullamcorper nulla non metus auctor -->
	<!-- 					fringilla. Vestibulum id ligula porta felis euismod semper. -->
	<!-- 					Praesent commodo cursus magna, vel scelerisque nisl consectetur. -->
	<!-- 					Fusce dapibus, tellus ac cursus commodo.</p> -->
	<!-- 			</div> -->
	<!-- 			<div class="col-md-5"> -->
	<!-- 				<img class="featurette-image img-responsive center-block" -->
	<!-- 					data-src="holder.js/500x500/auto" alt="Generic placeholder image"> -->
	<!-- 			</div> -->
	<!-- 		</div> -->

	<!-- 		<hr class="featurette-divider"> -->

	<!-- /END THE FEATURETTES -->
	
	<hr class="featurette-divider">

	<!-- FOOTER -->
	<footer>
		<p class="pull-right">
			<a href="#">Back to top</a>
		</p>
		<p>
			&copy; 2015 Bubi, Inc. &middot; <a href="#">Privacy</a> &middot; <a
				href="#">Terms</a>
		</p>
	</footer>

	</div>
	<!-- /.container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script type="text/javascript" src="jquery-1.8.3.js"></script>

	<script src="${context}/webjars/bootstrap/3.1.0/js/bootstrap.min.js"></script>
	<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
	<!-- 	<script src="../../assets/js/vendor/holder.min.js"></script> -->
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<!-- 	<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script> -->
</body>
</html>

