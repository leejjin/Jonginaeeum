<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>종이내음</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>로그인 페이지 </title>
		
		<!-- button class 설정 -->
		<style type="text/css">
			@font-face { font-family: 'KoPubDotumMedium'; 
									src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_two@1.0/KoPubDotumMedium.woff') format('woff');
									font-weight: normal; 
									font-style: normal; } 
			
			.login{
				width:200px;
				height:35px;
				background-color:#7F8081;
				border:none;
				text-align:center;
				text-color:black;
				font-size:17px;
				cursor:pointer;
			}
			.insta_login{
				width:85px;
				height:17px;
				background: transparent;
				border:0.5px solid gray;
				text-color:black;
				text-align:center;
				font-size:10px;
				cursor:pointer;
			}
			.find_id{
				width:85px;
				height:35px;
				background:transparent;
				border:none;
				text-align:center;
				text-color:black;
				font-size:13px;
				cursor:pointer;
			}
			.find_password{
				width:85px;
				height:35px;
				background:transparent;
				border:none;
				text-align:center;
				text-color:black;
				font-size:13px;
				white-space:nowrap;
				cursor:pointer;
			}
			.join{
				width:90px;
				height:35px;
				background:transparent;
				border:none;
				text-align:center;
				text-color:black;
				font-size:13px;
				cursor:pointer;
			}
		</style>
		
		<!--회원가입 정보와 일치한지 확인-->
		<script type="text/javascript">
			function chkValue(){
				inputForm=eval("document.loginInfo");
				if(!inputForm.email.value){
					alert("이메일을 입력하세요!");
					return false;
				}
				if(!inputForm.password.value){
					alert("비밀번호를 입력하세요!");
					return false;
				}
			}
		</script>
	</head>

	<body>
		<img src="../img/bar.jpg" width="100%" height="25px" style="margin-left:auto margin-right:auto;display:block;"/>
		<img src="../img/main_logo.png" width="100%" style="margin-left:auto margin-right:auto;display:block;width: 180px; height: 100px;"/>
	
		<form method="post" name="loginInfo" action="loginpro.jsp" onsubmit="chkValue()">
			<br><br><br><br>
			<table style="margin-left:auto; margin-right:auto;" cellspacing="10">
			
				<tr>
					<td>
						<!-- 이메일 --> 
						<input type="text" name="email" placeholder="email" maxlength="50" style="width:200px; height:25px">
					</td>
				</tr>
				
				<tr>
					<td>
						<!-- 비밀번호 -->
						<input type="password" name="password" placeholder="password" maxlength="50" style="width:200px; height:25px">
					</td>
				</tr>
				
				<tr></tr>
				<tr></tr>
				
				<tr>
					<td align="center">
						<button class="login">LOGIN</button>
					</td>
				</tr>
				
				<tr>
					<td align="right">
						<button class="insta_login" >Instagram Login</button>
					</td>
				</tr>
				
			</table>
				<br>
		</form>	

			<center>
				<button class="find_id" onclick="" >아이디 찾기</button>
				<button class="find_password" onclick="">비밀번호 찾기</button>
				<button class="join" onclick="location.href='signUp'" >회원가입</button>
			</center>
		
		<%
			//email, 비밀번호 틀릴 경우 메시지 표시
			//MemberDAO.java - 로그인 성공: 1, 비밀번호 오류: 0, 이메일 오류: -1
			String msg=request.getParameter("msg");
			
			if (msg!=null&&msg.equals("0")){
				out.println("비밀번호를 확인해주세요!");
			}
			else if(msg!=null&&msg.equals("-1")){
				out.println("이메일을 확인해주세요!");
			}
		%>
		
		<br><br><br>
		
		<img src="../img/services.jpg" width="100%" style="margin-left:auto margin-right:auto;display:block;"/>
		<img src="../img/footer.jpg" width="100%" style="margin-left:auto margin-right:auto;display:block;"/>
	</body>
</html>