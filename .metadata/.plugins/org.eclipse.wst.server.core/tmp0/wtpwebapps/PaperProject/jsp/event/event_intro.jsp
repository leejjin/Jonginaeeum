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
<link type="text/css" rel="stylesheet" href="../css/home-style.css">
</head>

<body>

	<!-- navi -->
	<%@ include file="/jsp/common/navi_event.jsp"%>
	<!-- navi end -->

	<!-- main start -->
	<div class="event_detail">
		<div class="third">
			<h2>이달의 진행중인 이벤트</h2>
			<h4>독립서점만의 특별한 이벤트를 경험해보세요!!</h4>
		</div>
		<div id="timg">
			<table>
				<tr>
				<td><img src="../img/Symbol_1.png"
						style="margin-bottom: 100px; margin-right: 20px;"></td>
					<td><img src="../img/Event banner_1.png" width="200px"
						height="300px"></td>
					<td><img src="../img/Event banner_2.png" width="300px"
						height="300px"></td>
					<td><img src="../img/Event banner_3.png" width="200px"
						height="300px"></td>
					<td><img src="../img/Symbol_2.png"
						style="margin-bottom: 100px; margin-left: 20px;"></td>
				</tr>
			</table>
		</div>
		
		<div class="first">
			<div id="fimg">
				<table>
					<tr>
						<td><img src="../img/Event banner_4.png" width="1280px"
							height="500px" float="left" style="margin-left:50px"></img></td>

					</tr>
				</table>
			</div>
		</div>
		<div class="second">
			<h3>
				<span style="margin-left: 200px;">이벤트</span>
			</h3>
			<h3>></h3>
			<h3>굿즈</h3>
			<div id="goods">
				<table>
					<tr>
						<td><img src="../img/Symbol_1.png"
							style="margin-bottom: 100px; margin-right: 20px;"></td>
						<td><img src="../img/Event banner_5.png"></td>
						<td><img src="../img/Event banner_6.png"></td>
						<td><img src="../img/Event banner_7.png"></td>
						<td><img src="../img/Symbol_2.png"
							style="margin-bottom: 100px; margin-left: 20px;"></td>
					</tr>
				</table>
			</div>
		</div>
	</div>
	<!-- main end -->


	<!-- footer -->
	<%@ include file="/jsp/common/footer.jsp"%>
	<!-- footer end -->

</body>
</html>