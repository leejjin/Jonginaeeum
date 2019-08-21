<%@ page language="java" contentType="text/html; charset=UTF-8"
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
	<%@ include file="/jsp/common/navi.jsp"%>
	<!-- navi end -->

	<!-- main start -->
	<div class="bookstore-title">
		<h2>
			'<span style="color: red;">서울</span>'
		</h2>
	</div>
	<div class="bookstore-list-box row">
		<div class="bookstore-list col-s-3">
			<a href="#"><img src="../img/gray.png"></a>
			<h4>
				<a href="#">서점명</a>
			</h4>
		</div>
		<div class="bookstore-list col-s-3">
			<a href="#"><img src="../img/gray.png"></a>
			<h4>
				<a href="#">서점명</a>
			</h4>
		</div>
		<div class="bookstore-list col-s-3">
			<a href="#"><img src="../img/gray.png"></a>
			<h4>
				<a href="#">서점명</a>
			</h4>
		</div>
		<div class="bookstore-list col-s-3">
			<a href="#"><img src="../img/gray.png"></a>
			<h4>
				<a href="#">서점명</a>
			</h4>
		</div>
	</div>
	<div class="bookstore-list-box row">
		<div class="bookstore-list col-s-3">
			<a href="#"><img src="../img/gray.png"></a>
			<h4>
				<a href="#">서점명</a>
			</h4>
		</div>
		<div class="bookstore-list col-s-3">
			<a href="#"><img src="../img/gray.png"></a>
			<h4>
				<a href="#">서점명</a>
			</h4>
		</div>
		<div class="bookstore-list col-s-3">
			<a href="#"><img src="../img/gray.png"></a>
			<h4>
				<a href="#">서점명</a>
			</h4>
		</div>
		<div class="bookstore-list col-s-3">
			<a href="#"><img src="../img/gray.png"></a>
			<h4>
				<a href="#">서점명</a>
			</h4>
		</div>
	</div>

	<!-- main end -->

	<!-- footer -->
	<%@ include file="/jsp/common/footer.jsp"%>
	<!-- footer end -->

</body>
</html>