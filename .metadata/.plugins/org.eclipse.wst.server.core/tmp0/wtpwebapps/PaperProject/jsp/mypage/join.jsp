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

		<title>회원가입 페이지</title>
		
		<!-- div, button class 설정 -->
		<style type="text/css">	
			@font-face { font-family: 'KoPubDotumMedium'; 
									src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_two@1.0/KoPubDotumMedium.woff') format('woff');
									font-weight: normal; 
									font-style: normal; } 
			
			.box-wrap{
				position: relative;
			}
			.box-wrap img{
				width: 60%;
			}
			.box-text{
				position: absolute;
				top: 50%;
				left: 50%;
				transform: translate( -50%, -50%);
			}
			
			.join{
				width:200px;
				height:45px;
				background-color:#7F8081;
				border:none;
				text-align:center;
				text-color:black;
				font-size:17px;
				cursor:pointer;
			}
		
		.input_chk input[type="checkbox"]{
			display:none;
		}
		.input_chk label {
			width:100%;
			height:20%;
		}
		.input_chk input[type="checkbox"] + label .chk_img{
			cursor: pointer;
			line-height: 22px;
			padding: 0 0 0 30px;
			background: url("../img/agree.png"")no-repeat ;
		}
		.input_chk input[type="checkbox"]:checked + label .chk_img{
			background: url("../img/agree_filled.png")no-repeat;
		}
		</style>

		<!--사용자 이메일, 비밀번호가 입력되었는지 확인-->
		<script type="text/javascript">
			function chkValue(){
				if(!document.member.email.value){
					alert("이메일을 입력하세요!");
					return false;
				}
				if(!document.member.password.value){
					alert("비밀번호를 입력하세요!");
					return false;
				}
				if(document.member.password.value!=document.member.passwordchk.value){
					alert("동일한 비밀번호가 아닙니다!");
					return false;
				}
			}
		</script>
	</head>

	<body>
		<img src="../img/bar.jpg" width="100%" height="25px" style="margin-left:auto margin-right:auto;display:block;"/>
		<img src="../img/logo.jpg" width="100%" style="margin-left:auto margin-right:auto;display:block;"/>
	
		<form method="post" action="joinpro.jsp" name="member" onsubmit="return chkValue()">
			<br><br><br><br>

			<table style="margin: 0 auto;" cellspacing="30">
				<tr>
					<div class="box-wrap">
						<div class="box-image" align="center"><img src="../img/box.jpg" /></div>
						<div class="box-text">
							<div class="input_chk">
									<input type="checkbox" id="agree" >
									<label for="agree">						
										<div class="chk_img">
										이용약관, 개인정보 수집 및 이용, 위치정보 이용약관(선택), <br>
										프로모션 안내 메일 수신(선택)에 모두 동의합니다.</div>
									</label>
							</div>
						</div>
					</div>
				</tr>
		
				<tr></tr>		
				<tr>
					<td align="center">이메일 </td>
					<td><input type="text" name="email" maxlength="50" style="width: 250px; height:20px;"></td>
				</tr>
				
				<tr>
					<td align="center">비밀번호</td>  
					<td><input type="password" name="password" maxlength="50" style="width: 250px; height:20px;"></td>
				</tr>
				
				<tr>
					<td width="80" align="center">비밀번호 재확인</td>  
					<td><input type="password" name="passwordchk" maxlength="50" style="width: 250px; height:20px;"></td>
				</tr>
	
				<tr>
					<td align="center">닉네임 </td>
					<td><input type="text" name="nickname" maxlength="20" style=" width: 250px; height:20px;"></td>
				</tr>
	
				<tr>
					<td align="center">생년월일</td>
					<td><input type="text" name="birthyy" maxlength="4" placeholder="년(4자)" size="6" style="width: 120px; height:20px;">
						<input type="text" name="birthmm" maxlength="2" placeholder="월" size="4" style="width: 55px; height:20px;">
						<input type="text" name="birthdd" maxlength="2" placeholder="일" size="4" style="width: 55px; height:20px;">
					</td>
				</tr>
				
				<tr>
					<td align="center">휴대전화</td>  
					<td><input type="text" name="tel" style="width: 250px; height:20px;"></td>
				</tr>
			</table>
			
			<br><br>
			<center><button class="join">가입하기</button></center>
		</form>	

		
		<br><br><br>
			<img src="../img/services.jpg" width="100%" style="margin-left:auto margin-right:auto;display:block;"/>
			<img src="../img/footer.jpg" width="100%" style="margin-left:auto margin-right:auto;display:block;"/>
	</body>
</html>