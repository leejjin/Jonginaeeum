<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet" href="../css/login.css">
<script type="text/javascript"
   src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
<link type="text/css" rel="stylesheet" href="../css/home-style.css">
<script type="text/javascript">
   $(document).ready(function() {
      $('a.login-window').click(function() {

         // Getting the variable's value from a link 
         var loginBox = $(this).attr('href');

         //Fade in the Popup and add close button
         $(loginBox).fadeIn(300);

         //Set the center alignment padding + border
         var popMargTop = ($(loginBox).height() + 24) / 2;
         var popMargLeft = ($(loginBox).width() + 24) / 2;

         $(loginBox).css({
            'margin-top' : -popMargTop,
            'margin-left' : -popMargLeft
         });

         // Add the mask to body
         $('body').append('<div id="mask"></div>');
         $('#mask').fadeIn(300);

         var email = $("#username").val();
         var pw = $("#password").val();

         //로그인 이메일과 비밀번호 오류시 나타나는 유효성체크
         $(function() {
         });

         return false;
      });

      // When clicking on the button close or the mask layer the popup closed
      $('a.close, #mask').live('click', function() {
         $('#mask , .login-popup').fadeOut(300, function() {
            $('#mask').remove();
         });
         return false;
      });

   });
</script>

   <header>
      <div class="top-menu">
         <ul>
            <c:choose>
               <c:when test="${!empty mb}">
                  <li class="other-menu"><a href="../main/logout">로그아웃</a></li>
               </c:when>
               <c:otherwise>
                  <li class="other-menu"><a href="../login_input"
                     class="login-window">로그인</a></li>
               </c:otherwise>
            </c:choose>
            <li><a href="#">마이페이지</a></li>
         </ul>
      </div>
      <div class="logo">
         <a href="../main/main"><img src="../img/main_logo.png"
            style="width: 180px; height: 100px;"></a>
      </div>
   </header>

   <!--  <div class="row-wrap">   
      <div id="navbar" class="navbar-collapse collapse set"> -->
   <nav class="row">
      <ul class="main-menu">
         <li class="col-s-3"><a href="../store/storeMain">서점안내</a>
            <ul class="sub-menu col-s-3">
               <li><a href="#">지역별</a>
                  <ul class="sub-sub-menu1 col-s-12">
                     <li><a href="../store/seoul">서울</a></li>
                     <li><a href="#">인천/경기</a></li>
                     <li><a href="#">충청/강원</a></li>
                     <li><a href="#">전북/전남</a></li>
                     <li><a href="#">경북/경남</a></li>
                     <li><a href="#">제주</a></li>
                  </ul></li>
               <li><a href="#">테마별</a>
                  <ul class="sub-sub-menu2 col-s-12">
                     <li><a href="../store/silent">조용한</a></li>
                     <li><a href="#">사진찍기 좋은</a></li>
                     <li><a href="#">친구와 함께</a></li>
                     <li><a href="#">예술적인</a></li>
                  </ul></li>
            </ul></li>
         <li class="col-s-3"><a href="../gallery/gallery">갤러리</a></li>
         <li class="col-s-3"><a href="../community/commuList">커뮤니티</a></li>
         <li class="col-s-3"><a href="../event/eventMain">이벤트</a></li>
      </ul>
   </nav>
   <!--</div>
   </div>-->

   <div class="banner">
      <img src="../img/banner_1.png">
   </div>

   <div class="search">
      <input type="text" id="search-bar" placeholder="서점 명을 입력하세요.">
      <input type="image" id="search-btn" src="../img/search.svg">
   </div>


<!-- 
   <div id="login-box" class="login-popup">
      <a href="#" class="close"><img class="btn_close"
         src="../img/close_pop.png" /></a>


      <form id="form1" name="form1" method="post" class="signin" action = "../main/login_input">
         <fieldset>

            <span><h3>Login</h3></span><br/> 
            <label class="username">
               <input id="username" name="email" value="" type="text"
               autocomplete="on" placeholder="이메일"><br />
            </label> 
            <label class="password"> <input id="password"
               name="password" value="" type="password" placeholder="비밀번호">
            </label><br /> <br />
            
            <br />


            <button type="submit" class="btn btn-warning">로그인</button>
            <a href = "signUp" id= "underline"><button class="btn btn-warning" type="button">회원가입</button></a>

         </fieldset>
      </form><br />
      
      
      
      <div id = "message"></div>
   

   </div>


 -->