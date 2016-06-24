<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%
	// This is to prevent Caching on the browser and proxy
	response.setHeader("Cache-Control", "no-cache"); //HTTP 1.1
	response.setHeader("Pragma", "no-cache"); //HTTP 1.0
	response.setDateHeader("Expires", -1); //prevents caching at the proxy server
%>
<html>
<head>
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Pragmas" content="no-cache">

<script type="text/javascript">
<!--
	function redirect() {
		document.jsecuritycheck.submit();
	}
// -->
</script>
</head>
<body class="default" marginheight="0" marginwidth="0" topmargin="0"
	leftmargin="0" onLoad="redirect();">
<form 
		action="<c:url value='/j_spring_security_check'/>" method="post" name="jsecuritycheck">
		
		<c:set var="username" value="${j_username}"/>
		<c:set var="password" value="${j_password}"/>
		<c:out value="${username }"></c:out>
		<input type="hidden" name="j_username" value="<c:out value="${username}"/>">
		<input type="hidden" name="j_password" value="<c:out value="${password}"/>">
		
		<c:remove var="j_username" scope="session"/>
		<c:remove var="j_password" scope="session"/>
	</form>
</body>
</html>