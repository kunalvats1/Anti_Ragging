<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"><!--addon-->
	<link rel="shortcut icon" href="images/favicon.png" type="image/png">
		<title>Anti-Ragging Portal</title>
		<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
		<script src="js/jquery.min.js"></script><!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<link href="css/style.css" rel='stylesheet' type='text/css' /><!-- This is my theme which i inststalled-->
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
		</script>
		<link href='http://fonts.googleapis.com/css?family=Oswald:400,300,700' rel='stylesheet' type='text/css'><!----webfonts from googleapi--->
		<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>
		<!----nav-script I call it by javascript copy---->
		<script>
			$(function() {
				var pull 		= $('#pull');
					menu 		= $('nav ul');
					menuHeight	= menu.height();
				$(pull).on('click', function(e) {
					e.preventDefault();
					menu.slideToggle();
				});
				$(window).resize(function(){
	        		var w = $(window).width();
	        		if(w > 320 && menu.is(':hidden')) {
	        			menu.removeAttr('style');
	        		}
	    		});
			});
		</script>
		<!----//End-top-nav-script---->
	</head>
	<body>
		<!--i started my header--->
			<div id="home" class="header">
					<div class="top-header">
						<div class="container">
						<div class="logo">
							
						</div>
						<!----start-top-nav---->
						 <nav class="top-nav">
							<ul class="top-nav">
								<li class="active"><a  id ="1" href="#home" class="scroll">Home </a></li>
								<li ><a href="#about" id ="2" class="scroll">About us</a></li>
								<li><a href="#team"  id ="3" class="scroll">our Programme</a></li>
								<li><a href="#contact" id ="4" class="scroll">Contact Us</a></li>
								<li ><a href="#login" id ="5" class="scroll" >Login</a></li>
								<li id="work"><button class="btn"><i class ="fa fa-bars"></i></button></li>
							</ul>
							<a href="#" id="pull"><img src="images/menu-icon.png" title="menu" /></a>
						</nav>
						<div class="clearfix"> 
					</div>
				</div>
			</div>
		<!----- //End-header---->
		<!----start-slider-script---->
		<script>
		$("#work").on("click", function(){
           $(this).hide();
		    $("#1").show(500);
	       $("#2").show(700);
	        $("#3").show(900);
	        $("#4").show(1100);
	         $("#5").show(1300);
});
		</script>
		<script>
		$(document).ready(function(){
    $("#1").hide();
	$("#2").hide();
	$("#3").hide();
	$("#4").hide();
	$("#5").hide();
});
		</script>
		
			<script src="js/responsiveslides.min.js"></script>
			 <script>
			    // You can also use "$(window).load(function() {"
			    $(function () {
			      // Slideshow 4
			      $("#slider4").responsiveSlides({
			        auto: true,
			        pager: true,
			        nav: true,
			        speed: 500,
			        namespace: "callbacks",
			        before: function () {
			          $('.events').append("<li>before event fired.</li>");
			        },
			        after: function () {
			          $('.events').append("<li>after event fired.</li>");
			        }
			      });
			
			    });
			  </script>
			<!----//End-slider-script---->
			<!-- Slideshow 4 -->
			    <div  id="top" class="callbacks_container">
			      <ul class="rslides" id="slider4">
			        <li>
			          <img src="images/slide1.png" alt="">
			          <div class="caption">
			          	<div class="slide-text-info">
			          		<h2 style="color: dodgerblue"> Anti-Ragging portal</h2>
			          		<label style="color: dodgerblue"> Say No To Ragging</label>
			          		
			          	</div>
			          </div>
			        </li>
			        <li>
			          <img src="images/ragg.jpg" alt="">
			          <div class="caption">
			          	<div class="slide-text-info">
			          		<h2 style="color:dodgerblue"> Anti-Ragging portal</h2>
			          		<label style="color: dodgerblue">Say No To Ragging</label>
			          		
			          	</div>
			          </div>
			        </li>
			        <li>
			          <img src="images/DDR.png" alt="">
			           <div class="caption">
			           	<div class="slide-text-info">
			          		<h2 style= "color: dodgerblue"> Anti-Ragging portal</h2>
			          		<label style="color: dodgerblue">Say No To Ragging</label>
			          		
			          	</div>
			          </div>
			        </li>
			      </ul>
			    </div>
			    <div class="clearfix"> </div>
			<!----- //End-slider---->
			<!---- about ---->
			<div id="about" class="about">
				<div class="container">
					<div class="header about-header text-center">
						<h2>About us</h2>
						<p></p>
					</div>
					<!---- About-grids ---->
					<div class="about-grids">
						<div class="col-md-4">
							<div class="about-grid">
								<img src="images/vaishalii.jpg" title="name" />
								<span class="t-icon1"> </span>
								<div class="about-grid-info text-center">
									<h3><a href="#">Vaishali Tyagi</a></h3>
									<p>She is the director of Anti-Ragging Portal</p>
								</div>
							</div>
						</div>
						<div class="col-md-4">
							<div class="about-grid ">
								<img src="images/badshah.jpg" title="name" />
								<span class="t-icon1"> </span>
								<div class="about-grid-info text-center">
									<h3><a href="#">Kunal Sharma</a></h3>
									<p>He is the Founder of Anti-Ragging Portal</p>
								</div>
							</div>
						</div>
						<div class="col-md-4">
							<div class="about-grid">
								<img src="images/kunal.jpg" title="name" />
								<span class="t-icon2"> </span>
								<div class="about-grid-info text-center">
									<h3><a href="#">Vikash Tyagi</a></h3>
									<p>He is the dean & manager of our portal</p>
								</div>
							</div>
						</div>
						<div class="clearfix"> </div>
					</div>
					<!---- About-grids ---->
				</div>
				
			</div>
			<!---- about ---->
			
			<!--- team --->
			<div id="team" class="team">
				<div class="container">
					<div class="header team-head text-center">
						<h2>Our Programme</h2>
                        <p>We conduted various Programmes which in association with the government of India</p>
                    </div>
					<div class="team-member-grids">
						<div class="team-member-grid">
							<img src="images/future.jpg" title="name" />
							<div class="team-member-info bottom-t-info">
								<span> </span>
								<h3><a href="#">Aman Movement In 1998 with UFC rules</a></h3>
								<p></p>
							</div>
						</div>
						<div class="team-member-grid">
							<img src="images/rag.jpg" title="name" />
							<div class="team-member-info bottom-t-info">
								<span> </span>
								<h3><a href="#">Ghaziabad Prohibition of Ragging Act, 1999</a></h3>
								<p></p>
							</div>
						</div>
						<div class="team-member-grid">
							<img src="images/detail.jpg" title="name" />
							<div class="team-member-info bottom-t-info">
								<span> </span>
								<h3><a href="#">Anti-Ragging Awrareness Programme</a></h3>
								<p></p>
							</div>
						</div>
						<div class="team-member-grid">
							<img src="images/police.jpg" title="name" />
							<div class="team-member-info bottom-t-info">
								<span> </span>
								<h3><a href="#">Manav Rachna Programme as per PM Scheme</a></h3>
								<p></p>
							</div>	
                        </div>					
						<div class="team-member-grid">
							<img src="images/manav.jpg" title="name" />
							<div class="team-member-info bottom-t-info">
								<span> </span>
								<h3><a href="#">National Awareness Programme </a></h3>
								<p></p>
							</div>
						</div>
						<div class="clearfix"> </div>
					</div>
					<!---//teammember-grids ---->
				</div>
			</div>
			<!--- team --->
		<!---- login ---->
		
    <!---- login ---->
		<!---- contact ---->
		<div id="contact" class="contact">
			<div class="map">
				<div class="contact-info">
					<div class="container">
					<!---- contact-grids ---->
					<div class="contact-grids">
						<h3>contact us</h3>
						<div class="col-md-5 contact-grid-left">
							<h4>contact information</h4>
							<ul>
								<li><span class="cal"> </span><label>Monday - Sunday : 24*7</label><small></small></li>
								<li><span class="pin"> </span><label>Address : Modinagar Ghaziabad Uttar Pradesh</label><small></small></li>
								<li><span class="phone"> </span><label>Phone : 9639499766</label><small></small></li>
								<li><span class="mail"> </span><label>Email : Kunalvats1@gmail.com</label><small> </small></li>
							</ul>
						</div>
						<div class="col-md-7 contact-grid-right">
							<h4>Drop message</h4>
							<form action="contactinfo" method="post">
								<input type="text" name="name" value="Name:" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name:';}">
								<input type="text" name="email" value="Email:" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email:';}">
								<input type="text" name="phno" value="Phone No:" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Phone No:';}">
								<textarea rows="2" cols="70" name="message" onfocus="if(this.value == 'Message:') this.value='';" onblur="if(this.value == '') this.value='Message:';">Message:</textarea>
								<input type="submit" value="SEND MESSAGE">
							</form>
							</div>
							<br>
							<br>
							<br>
							<div class="login" id="login">
							<center>
								<a href="stulogin.jsp" style="font-size:29px; text-decoration: none; color:white; ">Login as Student</a><br><br>
                                <a href="memberlogin.jsp"  style="font-size:29px; text-decoration: none; color:white;">Login as Admin</a>
							</center>						
						</div>
						
						<div class="clearfix"> </div>
						
					</div>
					<!---- contact-grids ---->
				</div>
				</div>
			</div>
		</div>
		
		
			<!---- contact ---->
			<div class="clearfix"> </div>
			<!--- copy-right ---->
			<div class="copy-right">
				<div class="container">
				<div class="copy-right-left">
					
					<script type="text/javascript">
									$(document).ready(function() {
										
										$().UItoTop({ easingType: 'easeOutQuart' });
										
									});
								</script>
					<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
				</div>
				
			</div>
			</div>
			</div>
</body>
</html>