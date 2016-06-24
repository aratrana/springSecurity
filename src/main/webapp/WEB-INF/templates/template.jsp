<!DOCTYPE html>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet"
	href="<c:url value="/static/resources/css/bootstrap.min.css"/>">
<link type="text/css" rel="stylesheet"
	href="<c:url value="/static/resources/css/hb_custom.css"/>">
<script type="text/javascript" src="<c:url value="/static/resources/js/jquery-1.11.3.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/static/resources/js/jquery.validate.min.js"/>"></script>
</head>
<body>
	<div>
		<tiles:insertAttribute name="header"/>
		<tiles:insertAttribute name="content"/>
		<tiles:insertAttribute name="footer"/>
	</div>
</body>
</html>