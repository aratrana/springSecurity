<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6 lt8"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7 lt8"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8 lt8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<style>
.errorblock {
	color: #ff0000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}

#loginForm .fieldgroup label.error {
	/*color: #FB3A3A;
    display: inline-block;
    margin: 4px 0 5px 125px;
    padding: 0;*/
	color: #FB3A3A;
	text-align: left;
	width: 220px;
}
</style>
<head>
<meta charset="UTF-8" />
<!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
<title>National Skill Development</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="Login and Registration Form with HTML5 and CSS3" />
<meta name="keywords"
	content="html5, css3, form, switch, animation, :target, pseudo-class" />
<meta name="author" content="Codrops" />
<spring:url value="/resources/public/css/demo.css" var="demoCss" />
<spring:url value="/resources/public/css/style3.css" var="styleCss" />
<spring:url value="/resources/public/css/animate-custom.css"
	var="animateCss" />
<link rel="shortcut icon" href="../favicon.ico">
<link rel="stylesheet" type="text/css" href="${demoCss}" />
<link rel="stylesheet" type="text/css" href="${styleCss}" />
<link rel="stylesheet" type="text/css" href="${animateCss}" />
</head>
<body>
	<div class="container">
		<!-- Codrops top bar -->
		<div class="codrops-top">
			<!-- <a href="">
                    <strong>&laquo; Previous Demo: </strong>Responsive Content Navigator
                </a> -->
			<span class="right"> <!--  <a href=" http://tympanus.net/codrops/2012/03/27/login-and-registration-form-with-html5-and-css3/"> -->
				<strong>&nbsp;</strong> <!-- </a> -->
			</span>
			<div class="clr"></div>
		</div>
		<!--/ Codrops top bar -->
		<!-- <header>
			<h1>Login and Registration Form <span>with HTML5 and CSS3</span></h1>
			<nav class="codrops-demos">
				<span>Click <strong>"Join us"</strong> to see the form switch</span>
					<a href="index.html">Demo 1</a>
					<a href="index2.html">Demo 2</a>
					<a href="index3.html" class="current-demo">Demo 3</a>
			</nav>
		</header> -->
		<section>
			<div id="container_demo">
				<!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
				<a class="hiddenanchor" id="toregister"></a> <a class="hiddenanchor"
					id="tologin"></a>
				<div id="wrapper">
					<div id="login" class="animate form">
						<form name="loginForm" id="loginForm"
							action="<c:url value='j_spring_security_check' />" method="POST"
							autocomplete="on">
							<h1>Log in</h1>
							<p>
								<label for="username" class="uname" data-icon="u"> Your
									email or username </label> <input id="j_username" name="j_username"
									required="required" type="text"
									placeholder="myusername or mymail@mail.com" />
							</p>
							<p>
								<label for="password" class="youpasswd" data-icon="p">
									Your password </label> <input id="j_password" name="j_password"
									required="required" type="password" placeholder="eg. X8df!90EO" />
							</p>
							<!-- <p class="keeplogin">
								<input type="checkbox" name="loginkeeping" id="loginkeeping"
									value="loginkeeping" /> <label for="loginkeeping">Keep
									me logged in</label>
							</p> -->
							<p class="login button">
								<input type="submit" value="Login" />
							</p>
							<p class="change_link">
								Not a member yet ? <a href="#toregister" class="to_register">Join</a>
							</p>
						</form>
					</div>

					<div id="register" class="animate form">
						<form action="mysuperscript.php" autocomplete="on">
							<h1>Sign up</h1>
							<p>
								<label for="usernamesignup" class="uname" data-icon="u">Your
									username</label> <input id="usernamesignup" name="usernamesignup"
									required="required" type="text"
									placeholder="mysuperusername690" />
							</p>
							<p>
								<label for="emailsignup" class="youmail" data-icon="e">
									Your email</label> <input id="emailsignup" name="emailsignup"
									required="required" type="email"
									placeholder="mysupermail@mail.com" />
							</p>
							<p>
								<label for="passwordsignup" class="youpasswd" data-icon="p">Your
									password </label> <input id="passwordsignup" name="passwordsignup"
									required="required" type="password" placeholder="eg. X8df!90EO" />
							</p>
							<p>
								<label for="passwordsignup_confirm" class="youpasswd"
									data-icon="p">Please confirm your password </label> <input
									id="passwordsignup_confirm" name="passwordsignup_confirm"
									required="required" type="password" placeholder="eg. X8df!90EO" />
							</p>
							<p class="signin button">
								<input type="submit" value="Sign up" />
							</p>
							<p class="change_link">
								Already a member ? <a href="#tologin" class="to_register">Sign
									in </a>
							</p>
						</form>
					</div>

				</div>
			</div>
		</section>
	</div>
</body>
<script>
	$(document).ready(function() {
		$("#username").focus();
		$("#loginForm").validate({
			rules : {
				"j_username" : {
					required : true
				},
				"j_password" : {
					required : true,
					minlength : 8
				}

			},
			messages : {
				"j_username" : {
					required : "Please enter username"
				},
				"j_password" : {
					required : "Please enter password",
					minlength : "Password must be 8 characters"
				}
			},
		});
	});
</script>
</html>