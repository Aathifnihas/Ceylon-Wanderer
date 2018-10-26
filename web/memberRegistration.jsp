

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">



<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">

	<title>CeylonWanderer|Reg</title>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
	
	<link href="https://fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i" rel="stylesheet">

	
	<link href="register/css/bootstrap.min.css" rel="stylesheet">
	<link href="register/css/style.css" rel="stylesheet">
	<link href="register/css/responsive.css" rel="stylesheet">
	<link href="register/css/menu.css" rel="stylesheet">
	<link href="register/css/animate.min.css" rel="stylesheet">
	<link href="register/css/icon_fonts/css/all_icons_min.css" rel="stylesheet">
	<link href="register/css/skins/square/grey.css" rel="stylesheet">

	
	

	<script src="register/js/modernizr.js"></script>
	

</head>

<body>
	
	<div id="preloader">
		<div data-loader="circle-side"></div>
	</div>
	
	<div id="loader_form">
		<div data-loader="circle-side-2"></div>
	</div>
     
	 
	 <header>
		<div class="container-fluid">
		    <div class="row">
                <div class="col-3">
                   <image src="register/img/logo.jpg"> 𝕮𝖊𝖞𝖑𝖔𝖓𝖂𝖆𝖓𝖉𝖊𝖗𝖊𝖗©
                </div>
                <div class="col-9">
                    <div id="social">
                        <ul>
                            <li><a href="#0"><i class="icon-facebook"></i></a></li>
                            <li><a href="#0"><i class="icon-twitter"></i></a></li>
                            <li><a href="#0"><i class="icon-google"></i></a></li>
                            <li><a href="#0"><i class="icon-linkedin"></i></a></li>
                        </ul>
                    </div>
                    
                    <nav>
                        <ul class="cd-primary-nav">
                            <li><a href="index.jsp" class="animated_link">Home</a></li>
                        
                            <li><a href="index.jsp#about" class="animated_link">About Us</a></li>
                            <li><a href="index.jsp#contact" class="animated_link">Contact Us</a></li>
                        </ul>
                    </nav>
                </div>
            </div>
		</div>
	</header>
	
	

	<main>
		<div id="form_container">
			<div class="row">
				<div class="col-lg-5">
					<div id="left_form">
						<figure><img src="register/img/registration_bg.svg" alt=""></figure>
						<h2>Registration</h2>
						<p>Type something here aathif</p>            <!-- fill this aathif -->
						<a href="#0" id="more_info" data-toggle="modal" data-target="#more-info"><i class="pe-7s-info"></i></a>
					</div>
				</div>
				<div class="col-lg-7">

					<div id="wizard_container">
						<div id="top-wizard">
							<div id="progressbar"></div>
						</div>
						
						<form action="registration" id="wrapped" method="POST" >
							<input id="website" name="website" type="text" value="">
							<!-- Leave for security protection, read docs for details -->
							<div id="middle-wizard">

								<div class="step">
									<h3 class="main_question"><strong>1/3</strong>Please fill with your details</h3>
									<div class="row">
										<div class="col-md-6">
											<div class="form-group">
												<input type="text" name="firstname" class="form-control required" placeholder="Name">
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<input type="password" name="pass" class="form-control required" placeholder="Password">
											</div>
										</div>
									</div>
									

									<div class="row">
										<div class="col-md-6">
											<div class="form-group">
												<input type="email" name="email" class="form-control required" placeholder="Your Email">
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<input type="text" name="telephone" class="form-control required" placeholder="Your Telephone">
											</div>
										</div>
									</div>
									

									<div class="row">
										<div class="col-md-6">
											<div class="form-group">
												<input type="text" name="age" class="form-control required" placeholder="Age">
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group radio_input">
												<label><input type="radio" value="Male" checked name="gender" class="icheck">Male</label>
												<label><input type="radio" value="Female" name="gender" class="icheck">Female</label>
											</div>
										</div>
									</div>
									
								</div>
								

								<div class="step">
									<h3 class="main_question"><strong>2/3</strong>Please fill with additional info</h3>
									<div class="row">
										<div class="col-md-12">
											<div class="form-group">
												<input type="text" name="address" class="form-control required" placeholder="Address">
											</div>
										</div>
										
									</div>
									
									<div class="row">
										<div class="col-md-6">
											<div class="form-group">
												<input type="text" name="city" class="form-control " placeholder="City">
											</div>
										</div>
										<div class="col-md-3">
											<div class="form-group">
												<input type="text" name="zip_code" class="form-control " placeholder="Zip code">
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-md-6">
											<div class="form-group">
												<div class="styled-select">
													<select class="required" name="country">
														<option value="" selected>Select your country</option>
														<option value="Europe">Europe</option>
														<option value="Asia">Asia</option>
														<option value="North America">North America</option>
														<option value="South America">South America</option>
													</select>
												</div>
												
											    <div class="form-group radio_input">
												<label><input type="radio" value="local"  name="type" class="icheck">Local</label>
												<label><input type="radio" value="tourist" checked name="type" class="icheck">Tourist</label>
											   </div>
										</div>
											
										</div>
									</div>
									
								</div>
								

								<div class="submit step">
									<h3 class="main_question"><strong>3/3</strong>Add a profile picture!</h3>
									  <input type="file" name="myImage"   accept="image/*" />
									<textarea name="additional_message" class="form-control" style="height:150px;" placeholder="Leave us an optional message"></textarea>

									<div class="form-group terms">
										<input name="terms" type="checkbox" class="icheck required" value="yes">
										<label>Please accept <a href="#" data-toggle="modal" data-target="#terms-txt">terms and conditions</a> ?</label>
									</div>
								</div>
								
							</div>
							
							<div id="bottom-wizard">
								<button type="button" name="backward" class="backward">Backward </button>
								<button type="button" name="forward" class="forward">Forward</button>
								<button type="button" name="process" class="submit">Register</button>
							</div>
							
						</form>
					</div>
					
				</div>
			</div>
		</div>
	</main>
	
	<footer id="home" class="clearfix">
		<p>CeylonWanderer© </p>
		<ul>
			
			<li><a href="#0" class="animated_link">Terms and conditions</a></li>
		
		</ul>
	</footer>
	
	
	<div class="cd-overlay-nav">
		<span></span>
	</div>
	

	<div class="cd-overlay-content">
		<span></span>
	</div>
	

	<a href="#0" class="cd-nav-trigger">Menu<span class="cd-icon"></span></a>

	
	<div class="modal fade" id="terms-txt" tabindex="-1" role="dialog" aria-labelledby="termsLabel" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title" id="termsLabel">Terms and conditions</h4>
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				</div>
				
				<div class="modal-footer">
					<button type="button" class="btn_1" data-dismiss="modal">Close</button>
				</div>
			</div>
			
		</div>
		
	</div>
	
	<div class="modal fade" id="more-info" tabindex="-1" role="dialog" aria-labelledby="more-infoLabel" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title" id="more-infoLabel">Frequently asked questions</h4>
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				</div>
				<div class="modal-body">
					<p>Type something here ,use Bold tags foe questions</p>  <!-- fill this too aathif -->
				</div>
				<div class="modal-footer">
					<button type="button" class="btn_1" data-dismiss="modal">Close</button>
				</div>
			</div>
			
		</div>
	
	</div>

	<!-- SCRIPTS -->

	<script src="register/js/jquery-3.2.1.min.js"></script>
	
	<script src="register/js/common_scripts_min.js"></script>

	<script src="register/js/registration_wizard_func.js"></script>

	<script src="register/js/velocity.min.js"></script>
	<script src="register/js/main.js"></script>
	
	<script src="register/js/functions.js"></script>

</body>

</html>