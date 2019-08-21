<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>종이내음</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link type="text/css" rel="stylesheet" href="../css/home-style.css">
<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
   src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>

   <!-- navi -->
   <%@ include file="/jsp/common/navi.jsp"%>
   <!-- navi end -->

   <!-- main start -->
   <div class="main-bookstore">
      <h2>이달의 서점</h2>
      <a href="#"><img src="../img/store_1.png"></a> <a href="#"><img
         src="../img/store_2.png"></a> <a href="#"><img
         src="../img/store_3.png"></a> <br> 서점 소개 설명 텍스트
   </div>


   <div class="main-moim">
      <h2>이달의 이벤트</h2>
      <a href="#"><img src="../img/Event banner_1.png"></a> <a
         href="#"><img src="../img/Event banner_2.png"></a><a href="#"><img
         src="../img/Event banner_3.png"></a><br> 모임 소개 설명 텍스트
   </div>

   <div class="main-goods">
      <h2>이달의 굿즈</h2>
      <a href="#"><img src="../img/Goods Benner_1.png"></a> <a
         href="#"><img src="../img/Goods Benner_2.png"></a> <a href="#"><img
         src="../img/Goods Benner_3.png"></a> <br> 굿즈 소개 설명 텍스트
   </div>


   <div class="banner">
      <img src="../img/main story.png">
   </div>
   <!-- main end -->

   <!-- footer -->
   <%@ include file="/jsp/common/footer.jsp"%>
   <!-- footer end -->

</body>
</html>