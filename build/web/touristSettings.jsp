

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>

	<html class="no-js" lang=""> 


<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>CeylonWanderer|Profile</title>
	<meta name="description" content="">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="apple-touch-icon" href="apple-touch-icon.png">
	<link rel="stylesheet" href="members/css/bootstrap.min.css">
	<link rel="stylesheet" href="members/css/normalize.css">
	<link rel="stylesheet" href="members/css/font-awesome.min.css">
	<link rel="stylesheet" href="members/css/icomoon.css">
	<link rel="stylesheet" href="members/css/transitions.css">
	<link rel="stylesheet" href="members/css/flags.css">
	<link rel="stylesheet" href="members/css/owl.carousel.css">
	<link rel="stylesheet" href="members/css/prettyPhoto.css">
	<link rel="stylesheet" href="members/css/jquery-ui.css">
	<link rel="stylesheet" href="members/css/scrollbar.css">
	<link rel="stylesheet" href="members/css/chartist.css">
	<link rel="stylesheet" href="members/css/main.css">
	<link rel="stylesheet" href="members/css/dashboard.css">
	<link rel="stylesheet" href="members/css/color.css">
	<link rel="stylesheet" href="members/css/responsive.css">
	<link rel="stylesheet" href="members/css/dbresponsive.css">
	<script src="members/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
</head>
<body>
	
	<div id="tg-wrapper" class="tg-wrapper tg-haslayout">
		
		<header id="tg-dashboardheader" class="tg-dashboardheader tg-haslayout">
			<nav id="tg-nav" class="tg-nav">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#tg-navigation" aria-expanded="false">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
				</div>
				<div id="tg-navigation" class="collapse navbar-collapse tg-navigation">
					<image src="members/logo.jpg"> 𝕮𝖊𝖞𝖑𝖔𝖓𝖂𝖆𝖓𝖉𝖊𝖗𝖊𝖗©
				</div>
			</nav>
			<div class="tg-rghtbox">
				<a class="tg-btn" href="touristDashboard.jsp">
					<i class="icon-bookmark"></i>
					<span>Back to Home</span>
				</a>
				
			</div>
			<div id="tg-sidebarwrapper" class="tg-sidebarwrapper">
				
				<div id="tg-verticalscrollbar" class="tg-verticalscrollbar">
					<strong class="tg-logo"><a href="javascript:void(0);"><img src="members/images/logod.png" alt="image description"></a></strong>
				
					<nav id="tg-navdashboard" class="tg-navdashboard">
						<ul>
							<li>
								<a href="touristMessages.jsp">
									<i class="icon-envelope"></i>
									<span>Messages</span>
								</a>
							</li>
						
							<li>
								<a href="index.jsp">
									<i class="icon-exit"></i>
									<span>Logout</span>
								</a>
							</li>
						</ul>
					</nav>
					
				</div>
			</div>
		</header>
		
		
		<div class="tg-dashboardbanner">
			<h1>Profile Settings</h1>
			
		</div>
	
		<main id="tg-main" class="tg-main tg-haslayout">
			
			<section class="tg-dbsectionspace tg-haslayout">
				<div class="row">
					<form class="tg-formtheme tg-formdashboard">
						<fieldset>
						
							<div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 tg-lgcolwidthhalf">
								<div class="tg-dashboardbox">
									<div class="tg-dashboardboxtitle">
										<h2>Profile Photo</h2>
									</div>
									<div class="tg-dashboardholder">
										<label class="tg-fileuploadlabel" for="tg-photogallery">
											<span>Drop files anywhere to upload</span>
											<span>Or</span>
											<span class="tg-btn">Select Files</span>
											<span>Maximum upload file size: 500 KB</span>
											<input id="tg-photogallery" class="tg-fileinput" type="file" name="file">
										</label>
										
										
									</div>
								</div>
							</div>
					
							<div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 tg-lgcolwidthhalf">
								<div class="tg-dashboardbox">
									<div class="tg-dashboardboxtitle">
										<h2>Profile Detail</h2>
									</div>
									<div class="tg-dashboardholder">
										
										<div class="form-group">
											<input type="email" name="email" class="form-control" placeholder="Email*">
										</div>
										<div class="form-group">
											<input type="text" name="firstname" class="form-control" placeholder="First Name*">
										</div>
										<div class="form-group">
											<input type="text" name="lastname" class="form-control" placeholder="Last Name*">
										</div>
										<div class="form-group">
											<input type="text" name="phonenumber" class="form-control" placeholder="Phone Number*">
										</div>
										<button class="tg-btn" type="button">Update</button>
									</div>
								</div>
							</div>
							
							<div class="col-xs-12 col-sm-4 col-md-4 col-lg-4 tg-lgcolwidthhalf">
								<div class="tg-dashboardbox">
									<div class="tg-dashboardboxtitle">
										<h2>Change Password</h2>
									</div>
									<div class="tg-dashboardholder">
										<div class="form-group">
											<input type="password" name="currentpassword" class="form-control" placeholder="Current Password">
										</div>
										<div class="form-group">
											<input type="password" name="newpassword" class="form-control" placeholder="New Password">
										</div>
										<div class="form-group">
											<input type="password" name="confirmpassword" class="form-control" placeholder="Confirm New Password">
										</div>
										<button class="tg-btn" type="button">Change</button>
									</div>
								</div>
							</div>
						
						</fieldset>
					</form>
				</div>
			</section>
		
		</main>
	
		<footer id="tg-footer" class="tg-footer tg-haslayout">
			<nav class="tg-footernav">
				<ul>
					<li><a href="javascript:void(0);">Listing Policy</a></li>
					<li><a href="javascript:void(0);">Terms of Use</a></li>
					<li><a href="javascript:void(0);">Privacy Policy</a></li>
				</ul>
			</nav>
			<span class="tg-copyright"> CeylonWanderer&copy; </span>
		</footer>
	
	</div>

	<script src="members/js/vendor/jquery-library.js"></script>
	<script src="members/js/vendor/bootstrap.min.js"></script>
	<script src="http://maps.google.com/maps/api/js?key=AIzaSyCR-KEWAVCn52mSdeVeTqZjtqbmVJyfSus&amp;language=en"></script>
	<script src="members/js/tinymce/tinymce.min4bb5.js?apiKey=4cuu2crphif3fuls3yb1pe4qrun9pkq99vltezv2lv6sogci"></script>
	<script src="members/JS/responsivethumbnailgallery.html"></script>
	<script src="members/js/jquery.flagstrap.min.js"></script>
	<script src="members/js/backgroundstretch.js"></script>
	<script src="members/js/owl.carousel.min.js"></script>
	<script src="members/js/jquery.vide.min.js"></script>
	<script src="members/js/jquery.collapse.js"></script>
	<script src="members/js/scrollbar.min.js"></script>
	<script src="members/JS/chartist.min.html"></script>
	<script src="members/js/prettyPhoto.js"></script>
	<script src="members/js/jquery-ui.js"></script>
	<script src="members/js/countTo.js"></script>
	<script src="members/js/appear.js"></script>
	<script src="members/js/gmap3.js"></script>
	<script src="members/js/main.js"></script>
</body>


</html>