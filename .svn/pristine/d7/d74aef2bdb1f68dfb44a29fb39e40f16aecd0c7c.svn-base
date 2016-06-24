<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:url value="/j_spring_security_check" var="validatePwd"/>
<form:form class="box login" action="${validatePwd}" modelAttribute="loginBeanDTO" method="POST">
	<fieldset class="boxBody">
	  <label>User Name</label>
	  <form:input path="username" tabindex="1" placeholder="Enter Your User Name" />
	  <label><a href="#" class="rLink" tabindex="5">Forget your password?</a>Password</label>
	  <form:password path="password" tabindex="2" />
	</fieldset>
	<footer>
	  <input type="submit" class="btnLogin" value="Login" tabindex="4">
	</footer>
</form:form>

