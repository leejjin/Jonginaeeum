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
<title>Community</title>
<link type="text/css" rel="stylesheet" href="../css/home-style.css">
<script>
$(function(){
	$(".reply_select").change(function(){
		$("#select_form").submit();//값이 바뀌면 저 이름의 폼을 서브밋할거야! 
	});
	
	var select_result = "${select_result}";
	
	$(".reply_select").val(select_result).prop("selected",true);
});
</script>
</head>
<body>
	
	<!-- navi -->
	<%@ include file="/jsp/common/navi.jsp" %>
	<!-- navi end -->
	
	<br/><br/>
	<div class="container">

	<div>
		<h5>커뮤니티   >   자유게시판</h5>
	</div>
	<div class="write_btn">
		<p class="review_wrap">
			<a href="commuWrite" class="btn btn-primary" style="float: right;">글쓰기</a><br />
		</p>
		<br />
	</div>
			<table class="table table-hover">
				<tr>
					<th>게시글</th>
					<th>제목</th>
					<th>글쓴이</th>
					<th>날짜</th>
					<th>조회수</th>
				</tr>
				<!-- <c:forEach var="l" items="${}"> -->
					<tr>
						<td>[공지]</td>
						<td>text</td>
						<td>운영자</td>
						<td>2018/11/16</td>
						<td>158</td>
					</tr>
					<tr>
						<td>[공지]</td>
						<td>text</td>
						<td>운영자</td>
						<td>2018/11/16</td>
						<td>158</td>
					</tr>
					<tr>
						<td>[리뷰]</td>
						<td>text</td>
						<td>운영자</td>
						<td>2018/11/16</td>
						<td>158</td>
					</tr>
					<tr>
						<td>[리뷰]</td>
						<td>text</td>
						<td>운영자</td>
						<td>2018/11/16</td>
						<td>158</td>
					</tr>
					<tr>
						<td>[리뷰]</td>
						<td>text</td>
						<td>운영자</td>
						<td>2018/11/16</td>
						<td>158</td>
					</tr>
					<tr>
						<td>[리뷰]</td>
						<td>text</td>
						<td>운영자</td>
						<td>2018/11/16</td>
						<td>158</td>
					</tr>
				<!-- </c:forEach> -->
			</table><br />
		<div>
			<div class="row" style="padding-left: 250px;">    
        <div class="col-xs-8 col-xs-offset-2">
		    <div class="input-group" style="width: 350px; ">
                <div class="input-group-btn search-panel">
                    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                    	<span id="search_concept">검색</span> <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu" role="menu">
                      <li><a href="#contains">이름</a></li>
                      <li><a href="#its_equal">제목</a></li>
                      <li><a href="#greather_than">내용</a></li>
                    </ul>
                </div>
                <input type="hidden" name="search_param" value="all" id="search_param">         
                <input type="text" class="form-control" name="x" placeholder="검색할 내용을 입력하세요">
                <span class="input-group-btn">
                    <button class="btn btn-default" type="button"><span class="glyphicon glyphicon-search"></span></button>
                </span>
            </div>
        </div>
	</div>
		</div>

		<br /><br />
			<div class="page_wrapper">
			<!-- <c:if test="${!empty pageGroupResult }"> -->
				<ul class="pagination">
					<!-- <c:if test="${pageGroupResult.beforePage}"> -->
						<li class="previous"><a href="qaSearch?reqPage=${pageGroupResult.groupStartNumber -1}"> << </a></li>
						<li class="active"><a href="qaSearch?reqPage=${page}">1</a></li>
						<li><a href="qaSearch?reqPage=${page}">2</a></li>
						<li><a href="qaSearch?reqPage=${page}">3</a></li>
						<li><a href="qaSearch?reqPage=${page}">4</a></li>
						<li><a href="qaSearch?reqPage=${page}">5</a></li>
						<li class="next"><a href="qaSearch?reqPage=${pageGroupResult.groupEndNumber +1}"> >> </a></li>
					<!-- </c:if>	
					<c:forEach var="page" begin="${pageGroupResult.groupStartNumber}" end="${pageGroupResult.groupEndNumber}" step="1">
						<li <c:if test="${pageGroupResult.selectPageNumber == page}"> class="active"</c:if>><a href="qaSearch?reqPage=${page}">${page}</a></li>
					</c:forEach>
					<c:if test="${pageGroupResult.afterPage}">
						<li class="next"><a href="qaSearch?reqPage=${pageGroupResult.groupEndNumber +1}">Next</a></li>
					</c:if> -->
				</ul>
		</c:if>
			</div>	
		</div>
		<!--딱딱한 버전 : <ul class="pagination">-->
		</form>
		
		
	<!-- footer -->
	<%@ include file="/jsp/common/footer.jsp" %>
	<!-- footer end -->
</body>
</html>