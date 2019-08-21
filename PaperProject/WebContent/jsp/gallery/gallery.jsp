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
	<div class="mar">
		<h2>갤러리 ></h2>
		<div class="rig">
			<h3>인기순</h3>
			<h3>|</h3>
			<h3>최신순</h3>
		</div>

		<section class="gal">
			<div>
				<table>
					<tr>
						<td><img src="../img/gray.png" alt=""></td>
						<td><img src="../img/gray.png" alt=""></td>
						<td><img src="../img/gray.png" alt=""></td>
					</tr>
				</table>
			</div>
			<div>
				<table>
					<tr>
						<td><img src="../img/gray.png" alt=""></td>
						<td><img src="../img/gray.png" alt=""></td>
						<td><img src="../img/gray.png" alt=""></td>
					</tr>
				</table>
			</div>
			<div>
				<table>
					<tr>
						<td><img src="../img/gray.png" alt=""></td>
						<td><img src="../img/gray.png" alt=""></td>
						<td><img src="../img/gray.png" alt=""></td>
					</tr>
				</table>
			</div>
			<div>
				<table>
					<tr>
						<td><img src="../img/gray.png" alt=""></td>
						<td><img src="../img/gray.png" alt=""></td>
						<td><img src="../img/gray.png" alt=""></td>
					</tr>
				</table>
			</div>

		</section>

		<div class="gallery-pageNum">
			<p>1</p>
			<p>2</p>
			<p>3</p>
			<p>4</p>
			<p>5</p>
		</div>
	</div>

	<!-- main end -->

	<!-- footer -->
	<%@ include file="/jsp/common/footer.jsp"%>
	<!-- footer end -->

</body>
</html>