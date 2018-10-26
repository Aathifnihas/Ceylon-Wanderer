

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>

	<html class="no-js" lang=""> 


<head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>CeylonWanderer|Tourist</title>
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
	<link rel="stylesheet" href="members/css/color.css">
	<link rel="stylesheet" href="members/css/responsive.css">
	<script src="members/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
</head>
<body class="tg-home tg-homeone">
	
	<div id="tg-wrapper" class="tg-wrapper tg-haslayout">
		
		<header id="tg-header" class="tg-header tg-haslayout">
			<div class="tg-topbar">
				<div class="container">
					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
							<ul class="tg-navcurrency">
								<li><a href="#" data-toggle="modal" data-target="#tg-modalselectcurrency">select currency</a></li>
								<li><a href="#" data-toggle="modal" data-target="#tg-modalpriceconverter">Price converter</a></li>
							</ul>
							<div class="dropdown tg-themedropdown tg-userdropdown">
								<a href="javascript:void(0);" id="tg-adminnav" class="tg-btndropdown" data-toggle="dropdown">
									<span class="tg-userdp"><img src="" alt="database eken photo eka ganna"></span>
									<span class="tg-name"> welcome!</span>  
									<!-- add sent image and name -->
								</a>
								<ul class="dropdown-menu tg-themedropdownmenu" aria-labelledby="tg-adminnav">
									
									<li>
										<a href="touristSettings.jsp">
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
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="tg-navigationarea">
				<div class="container">
					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
							<image src="members/logo.jpg"> 𝕮𝖊𝖞𝖑𝖔𝖓𝖂𝖆𝖓𝖉𝖊𝖗𝖊𝖗©
							<a class="tg-btn" href="touristMessages.jsp">
								<i class="icon-envelope"></i>
								<span>Messages</span>
							</a>
						
						</div>
					</div>
				</div>
			</div>
		</header>
	
		<!--************************************
				Home Slider Start
		*************************************-->
		<div id="tg-homebanner" class="tg-homebanner tg-haslayout">
			<figure class="item" data-vide-bg="members/images/slider.jpg" data-vide-options="position: 50% 50%">
				<figcaption>
					<div class="container">
						<div class="row">
							<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
								<div class="tg-bannercontent">
									<h1>Dive In Deep</h1>
									<h2>Search from Awesome Verified Ads!</h2>
									<form class="tg-formtheme tg-formbannersearch">
										<fieldset>
											<div class="form-group tg-inputwithicon">
												<i class="icon-bullhorn"></i>
												<input type="text" name="customword" class="form-control" placeholder="What are you looking for">
											</div>
											<div class="form-group tg-inputwithicon">
												<i class="icon-location"></i>
												<a class="tg-btnsharelocation fa fa-crosshairs" href="javascript:void(0);"></a>
												<input type="text" name="yourlocation" class="form-control" placeholder="Your Location">
											</div>
											<div class="form-group tg-inputwithicon">
												<i class="icon-layers"></i>
												<div class="tg-select">
													<select>
														<option value="none">Select Category</option>
														<option value="none">Cultural</option>
														<option value="none">Food</option>
														<option value="none">Wildlife</option>
														<option value="none">Tours</option>
														
													</select>
												</div>
											</div>
											<button class="tg-btn" type="button">Search Now</button>
										</fieldset>
									</form>
								</div>
							</div>
						</div>
					</div>
				</figcaption>
			</figure>
		</div>
	
	
		<main id="tg-main" class="tg-main tg-haslayout">
		
			<section class="tg-haslayout">
				<div class="container">
					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-12 col-lg-push-1 col-lg-10">
							<div class="tg-categoriessearch">
								<div class="tg-title">
									<h2><span>Boost your search with</span> Trending Categories</h2>
								</div>
								<div id="tg-categoriesslider" class="tg-categoriesslider tg-categories owl-carousel">
									<div class="tg-category">
										<div class="tg-categoryholder">
											<figure><img src="members/images/icons/img-08.png" alt="image description"></figure>
											<h3>Cultural</h3>
										</div>
									</div>
									<div class="tg-category">
										<div class="tg-categoryholder">
											<figure><img src="members/images/icons/img-09.png" alt="image description"></figure>
											<h3>Food</h3>
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
											<figure><img src="members/images/icons/img-12.png" alt="image description"></figure>
											<h3>Wildlife</h3>
										</div>
									</div>
									
								</div>
							</div>
						</div>
					</div>
				</div>
			</section>
			
			<section class="tg-sectionspace tg-haslayout">
				<div class="container">
					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
							<div class="tg-sectionhead">
								<div class="tg-title">
									<h2>Featured Ads</h2>
								</div>
								
							</div>
						</div>
						<div class="tg-ads">
						<!--	<div class="col-xs-6 col-sm-6 col-md-4 col-lg-3">
								<div class="tg-ad tg-verifiedad">
									<figure>
										<span class="tg-themetag tg-featuretag">featured</span>
										<a href="javascript:void(0);"><img src="images/ads/img-01.jpg" alt="image description"></a>
										<span class="tg-photocount">See 18 Photos</span>
									</figure>
									<div class="tg-adcontent">
										<ul class="tg-productcagegories">
											<li><a href="javascript:void(0);">Mobiles</a></li>
										</ul>
										<div class="tg-adtitle">
											<h3><a href="javascript:void(0);">Ei pad pro for sale</a></h3>
										</div>
										<time datetime="2017-06-06">Last Updated: 4 hours ago</time>
										<div class="tg-adprice"><h4>$200</h4></div>
										<address>44-46 abc Road, Manchester</address>
										<div class="tg-phonelike">
											<a class="tg-btnphone" href="javascript:void(0);">
												<i class="icon-phone-handset"></i>
												<span data-toggle="tooltip" data-placement="top" title="Show Phone No." data-last="0800 - 1234 - 562 - 6"><em>Show Phone No.</em></span>
											</a>
											<span class="tg-like tg-liked"><i class="fa fa-heart"></i></span>
										</div>
									</div>
								</div>
							</div> -->
							
						</div>
						<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
							<div class="tg-btnbox">
								<a class="tg-btn" href="">View All</a>
							</div>
						</div>
					</div>
				</div>
			</section>
			<!--************************************
					Featured Ads End
			*************************************-->
			<!--************************************
					Latest Posted Ads Start
			*************************************-->
			<section class="tg-sectionspace tg-bglight tg-haslayout">
				<div class="container">
					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
							<div class="tg-sectionhead">
								<div class="tg-title">
									<h2>Latest Posted Ads</h2>
								</div>
								
							</div>
						</div>
						<div class="tg-ads tg-adsvtwo">
						<!--<div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
								<div class="tg-ad tg-verifiedad">
									<figure>
										<span class="tg-themetag tg-featuretag">featured</span>
										<a href="javascript:void(0);"><img src="images/ads/img-09.jpg" alt="image description"></a>
										<span class="tg-photocount">See 29 Photos</span>
									</figure>
									<div class="tg-adcontent">
										<ul class="tg-productcagegories">
											<li><a href="javascript:void(0);">Vehicles</a></li>
										</ul>
										<div class="tg-adtitle">
											<h3><a href="javascript:void(0);">Ei pad pro for sale</a></h3>
										</div>
										<time datetime="2017-06-06">Last Updated: 4 hours ago</time>
										<div class="tg-adprice"><h4>$200</h4></div>
										<address>44-46 abc Road, Manchester</address>
										<div class="tg-phonelike">
											<a class="tg-btnphone" href="javascript:void(0);">
												<i class="icon-phone-handset"></i>
												<span data-toggle="tooltip" data-placement="top" title="Show Phone No." data-last="0800 - 1234 - 562 - 6"><em>Show Phone No.</em></span>
											</a>
											<span class="tg-like tg-liked"><i class="fa fa-heart"></i></span>
										</div>
									</div>
								</div>
							</div> -->
							
						</div>
						<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
							<div class="tg-btnbox">
								<a class="tg-btn" href="">View All</a>
							</div>
						</div>
					</div>
				</div>
			</section>
			<!--************************************
					Latest Posted Ads End
			*************************************-->
			
			
			<!--************************************
					Partners Start
			*************************************
			<section class="tg-sectionspace tg-haslayout">
				<div class="container">
					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
							<div id="tg-brandsslider" class="tg-brands tg-brandsslider owl-carousel">
								<figure class="item"><img src="images/brands/img-01.png" alt="image description"></figure>
								<figure class="item"><img src="images/brands/img-02.png" alt="image description"></figure>
								<figure class="item"><img src="images/brands/img-03.png" alt="image description"></figure>
								<figure class="item"><img src="images/brands/img-04.png" alt="image description"></figure>
							</div>
						</div>
					</div>
				</div>
			</section>
			<!--************************************
					Partners End
			*************************************-->
		</main>
	
		<footer id="tg-footer" class="tg-footer tg-haslayout">
			
			<div class="clearfix"></div>
			<div class="container">
				<div class="row">
					<div class="tg-footerinfo">
						<div class="col-xs-12 col-sm-12 col-md-4 col-lg-4 pull-right">
							<div class="tg-widget tg-widgetsearchbylocations">
								<div class="tg-widgettitle">
									<h3>Search By Locations:</h3>
								</div>
								<div class="tg-widgetcontent">
									<ul>
										<li><a href="javascript:void(0);">-  Colombo</a></li>
										<li><a href="javascript:void(0);">-  Kandy</a></li>
										<li><a href="javascript:void(0);">-  Matale</a></li>
										<li><a href="javascript:void(0);">-  Galle</a></li>
									
									
									</ul>
									<ul>
										<li><a href="javascript:void(0);">-  Mirissa</a></li>
										<li><a href="javascript:void(0);">-  Hikkaduwa</a></li>
										<li><a href="javascript:void(0);">-  Sigiriya</a></li>
										<li><a href="javascript:void(0);">-  Ella</a></li>
									
									
										<li><a href="javascript:void(0);">View All</a></li>
									</ul>
								</div>
							</div>
						</div>
						<div class="col-xs-12 col-sm-12 col-md-8 col-lg-8">
							<div class="tg-widget tg-widgettext">
								<div class="tg-widgetcontent">
									
									
									<div class="tg-followus">
										<strong>Follow Us:</strong>
										<ul class="tg-socialicons">
											<li class="tg-facebook"><a href="javascript:void(0);"><i class="fa fa-facebook"></i></a></li>
											<li class="tg-twitter"><a href="javascript:void(0);"><i class="fa fa-twitter"></i></a></li>
											<li class="tg-linkedin"><a href="javascript:void(0);"><i class="fa fa-linkedin"></i></a></li>
											<li class="tg-googleplus"><a href="javascript:void(0);"><i class="fa fa-google-plus"></i></a></li>
											<li class="tg-rss"><a href="javascript:void(0);"><i class="fa fa-rss"></i></a></li>
										</ul>
										
									</div>
									<nav class="tg-footernav">
										<ul>
											<li><a href="javascript:void(0);">Listing Policy</a></li>
											<li><a href="javascript:void(0);">Terms of Use</a></li>
											<li><a href="javascript:void(0);">Privacy Policy</a></li>
							
				
											
										</ul>
									</nav>
									<span class="tg-copyright">CeylonWanderer&copy; </span>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</footer>
		
	<!--************************************
			Theme Modal Box Start
	*************************************-->
	<div id="tg-modalselectcurrency" class="modal fade tg-thememodal tg-modalselectcurrency" tabindex="-1" role="dialog">
		<div class="modal-dialog tg-thememodaldialog" role="document">
			<button type="button" class="tg-close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">Ã—</span></button>
			<div class="modal-content tg-thememodalcontent">
				<div class="tg-title">
					<strong>Change Currency</strong>
				</div>
				<form class="tg-formtheme tg-formselectcurency">
					<fieldset>
						<div class="form-group">
							<div id="tg-flagstrapone" class="tg-flagstrap" data-input-name="country"></div>
						</div>
						<div class="form-group">
							<button class="tg-btn" type="button">Change Now</button>
						</div>
					</fieldset>
				</form>
			</div>
		</div>
	</div>
	<div id="tg-modalpriceconverter" class="modal fade tg-thememodal tg-modalpriceconverter" tabindex="-1" role="dialog">
		<div class="modal-dialog tg-thememodaldialog" role="document">
			<button type="button" class="tg-close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">Ã—</span></button>
			<div class="modal-content tg-thememodalcontent">
				<div class="tg-title">
					<strong>Currency Converter</strong>
				</div>
				<form class="tg-formtheme tg-formcurencyconverter">
					<fieldset>
						<div class="form-group">
							<div id="tg-flagstraptwo" class="tg-flagstrap" data-input-name="country"></div>
							<div class="tg-curencyrateetc">
							
								<p>1 USD = 0.784769 GBP</p>
							</div>
						</div>
						<div class="form-group">
							<span class="tg-iconseprator"><i><img src="members/images/icons/img-36.png" alt="image description"></i></span>
						</div>
						<div class="form-group">
							<div id="tg-flagstrapthree" class="tg-flagstrap" data-input-name="country"></div>
							<div class="tg-curencyrateetc">
								
								<p>1 GBP = 1.27426 USD</p>
							</div>
						</div>
						
						<div class="form-group">
							<button class="tg-btn" type="button">Convert Now</button>
						</div>
					</fieldset>
				</form>
			</div>
		</div>
	</div>
	<!--************************************
			Theme Modal Box End
	*************************************-->
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