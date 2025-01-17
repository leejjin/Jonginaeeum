v  1<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>종이내음</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link type="text/css" rel="stylesheet" href="../css/home-style.css">
</head>

<body>

	<!-- navi -->
	<%@ include file="/jsp/common/navi_event.jsp" %>
	<!-- navi end -->

	<!-- main start -->
	<div class="main-bookstore">
		<h2>삼요소 독립서점 EVENT</h2>
		<a href="#"><img src="../img/event_image_2.png"></a>
		<br>
	</div>
	
	<div class="main-bookstore">
		<a href="#"><img src="../img/banner_ad.png"></a>
		<br>
	</div>
	
	<div class="main-bookstore">
		<h2>갤러리</h2>
		<a href="#"><img src="../img/photo_11.png"></a><a href="#"><img src="../img/photo_12.png"></a><a href="#"><img src="../img/photo_13.png"></a>
		<a href="#"><img src="../img/photo_14.png"></a><a href="#"><img src="../img/photo_15.png"></a><a href="#"><img src="../img/photo_16.png"></a>
		<br>
	</div>
	
	<!-- main end -->
	
	<!-- footer -->
	<%@ include file="/jsp/common/footer.jsp" %>
	<!-- footer end -->

</body>
</html>