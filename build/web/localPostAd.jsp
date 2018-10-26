

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
	<html class="no-js" lang=""> 


<head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>CeylonWanderer|Post</title>
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
	
	<!--************************************
			Wrapper Start
	*************************************-->
	<div id="tg-wrapper" class="tg-wrapper tg-haslayout">
		<!--************************************
				Header Start
		*************************************-->
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
				<a class="tg-btn" href="localDashboard.jsp">
					<i class="icon-bookmark"></i>
					<span>Back to dashboard</span>
				</a>
				
			</div>
			<div id="tg-sidebarwrapper" class="tg-sidebarwrapper">
				<span id="tg-btnmenutoggle" class="tg-btnmenutoggle">
					<i class="fa fa-angle-left"></i>
					
				</span>
				<div id="tg-verticalscrollbar" class="tg-verticalscrollbar">
					<strong class="tg-logo"><a href="javascript:void(0);"><img src="images/logod.png" alt="image description"></a></strong>

					<nav id="tg-navdashboard" class="tg-navdashboard">
						<ul>
							
							<li>
								<a href="localSettings.jsp">
									<i class="icon-cog"></i>
									<span>Profile Settings</span>
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
		<!--************************************
				Header End
		*************************************-->
		<!--************************************
				Dashboard Banner Start
		*************************************-->
		<div class="tg-dashboardbanner">
			<h1>Advertisement</h1>
			
		</div>
		<!--************************************
				Dashboard Banner End
		*************************************-->
		<!--************************************
				Main Start
		*************************************-->
		<main id="tg-main" class="tg-main tg-haslayout">
			<!--************************************
					Section Start
			*************************************-->
			<section class="tg-dbsectionspace tg-haslayout">
				<div class="row">
					<form class="tg-formtheme tg-formdashboard" action="index.jsp" method="post">
						<fieldset>
							<div class="tg-postanad">
								<div class="col-xs-12 col-sm-12 col-md-12 col-lg-7">
									<div class="tg-dashboardbox">
										<div class="tg-dashboardboxtitle">
											<h2>Ad Details</h2>
										</div>
										<div class="tg-dashboardholder">
											<div class="form-group text-center">
												<a href="#" class="tg-btn" data-toggle="modal" data-target=".tg-categorymodal">Select Category Here</a>
											</div>
											<div class="form-group">
												
											</div>
											<div class="form-group">
												<input type="text" name="adtitle" class="form-control" placeholder="Enter Ad Title*">
											</div>
											<div class="form-group tg-priceformgroup">
												<div class="tg-checkbox">
													<input id="tg-priceoncall" type="checkbox" name="priceoncall" value="on">
													<label for="tg-priceoncall">Price On Call</label>
												</div>
												<input type="text" name="price" class="form-control" placeholder="Price*">
											</div>
											<div class="form-group">
												<textarea id="tg-tinymceeditor" class="tg-tinymceeditor"></textarea>
											</div>
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
								<div class="col-xs-12 col-sm-12 col-md-12 col-lg-5">
									<div class="tg-dashboardbox">
										<div class="tg-dashboardboxtitle">
											<h2>Comments</h2>
										</div>
										<div class="tg-dashboardholder">
											<div class="tg-checkbox">
												<input id="tg-enablemessages" type="checkbox" name="enablemessages" value="on">
												<label for="tg-enablemessages">Enable comments in this post</label>
											</div>
										</div>
									</div>
									<div class="tg-dashboardbox tg-contactdetail">
										<div class="tg-dashboardboxtitle">
											<h2>Payment Details</h2>
										</div>
										<div class="tg-dashboardholder">
											
											<div class="form-group">
												<input type="text" name="firstname" class="form-control" placeholder="Account Holder's Name*">
											</div>
											<div class="form-group">
												<input type="text" name="lastname" class="form-control" placeholder="Account No.*">
											</div>
											<div class="form-group">
												<input type="text" name="phone" class="form-control" placeholder="Phone">
											</div>
											<div class="form-group">
												<div class="tg-select">
													<select>
														<option>Select Bank*</option>
														<option>HNB</option>
														<option>HSBC</option>
														<option>Commercial Bank</option>
														<option>Sampath Bank</option>
													</select>
												</div>
											</div>
											
											
											<div class="form-group tg-inputwithicon">
												<i class="fa fa-crosshairs"></i>
												<input type="text" name="enteraddress" class="form-control" placeholder="Bank Branch">
											</div>
											<div class="tg-checkbox">
												<input id="tg-agreetermsandrules" type="checkbox" name="agreetermsandrules" value="on">
												<label for="tg-agreetermsandrules">I agree to all <a href="javascript:void(0);">Terms of Use &amp; Posting Rules</a></label>
											</div>
											<input type="Submit" class="tg-btn" value="Submit" >
										</div>
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
			<span class="tg-copyright"> CeylonWanderer &copy; </span>
		</footer>
	
	</div>
	<!-- popop for catergory button -->
	
	<div class="modal fade tg-thememodal tg-categorymodal" tabindex="-1" role="dialog">
		<div class="modal-dialog tg-thememodaldialog" role="document">
			<button type="button" class="tg-close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			<div class="modal-content tg-thememodalcontent">
				<div class="tg-title">
					<strong>Select Category</strong>
				</div>
				<div id="tg-dbcategoriesslider" class="tg-dbcategoriesslider tg-categories owl-carousel">
					<div class="tg-category">
						<div class="tg-categoryholder">
							<figure><img src="members/images/icons/img-08.png" alt="image description"></figure>
							<h3>Cultural</h3>
						</div>
					</div>
					
					<div class="tg-category">
						<div class="tg-categoryholder">
							<figure><img src="members/images/icons/img-10.png" alt="image description"></figure>
							<h3>Tours</h3>
						</div>
					</div>
					<div class="tg-category">
						<div class="tg-categoryholder">
							<figure><img src="members/images/icons/img-11.png" alt="image description"></figure>
							<h3>Food</h3>
						</div>
					</div>
					<div class="tg-category">
						<div class="tg-categoryholder">
							<figure><img src="members/images/icons/img-12.png" alt="image description"></figure>
							<h3>Wildlife</h3>
						</div>
					</div>
					
				</div>
				<ul class="tg-subcategories">
					<li>
						<div class="tg-title">
							<strong>Type</strong>
						</div>
						<div class=" tg-verticalscrollbar tg-dashboardscrollbar">
							<ul>
								
							</ul>
						</div>
					</li>
					<li>
						<div class="tg-title">
							<strong>Loaction</strong>
						</div>
						<div class=" tg-verticalscrollbar tg-dashboardscrollbar">
							<ul>
								
							</ul>
						</div>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<!--************************************
			Theme Modal Box End
	*************************************-->
	<script src="members/js/vendor/jquery-library.js"></script>
	<script src="members/js/vendor/bootstrap.min.js"></script>
	<script src="members/http://maps.google.com/maps/api/js?key=AIzaSyCR-KEWAVCn52mSdeVeTqZjtqbmVJyfSus&amp;language=en"></script>
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