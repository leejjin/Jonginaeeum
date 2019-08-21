<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%= request.getContextPath()%>"></c:set>  
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

<title></title>
<link rel = "stylesheet" href = "../css/commons.css">
<link rel = "stylesheet" href = "../css/review.css">
<link type="text/css" rel="stylesheet" href="../css/home-style.css">
<!-- 다음 에디터 -->
<link rel="stylesheet" href="${contextPath}/daumeditor/css/editor.css" type="text/css" charset="utf-8"/>
<script src="${contextPath}/daumeditor/js/editor_loader.js" type="text/javascript" charset="utf-8"></script>
<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
</head>
<body>
	
	<!-- navi -->
	<%@ include file="/jsp/common/navi.jsp" %>
	<!-- navi end -->
	
	<br/><br/>
	<div class="container">
        <div>
        <h5>커뮤니티   >   자유게시판</h5>
    </div><br>
		<!--review-->
		<div class="review_write_wrap">
			<h2>글쓰기</h2><br>
			
			<form action="../community/commuWriteInsert" method="post" id="userBoardInsert" >
				<table class="table table-bordered">
					<tr>
						<th width="200px;" class="active">이름</th>
						<td>소영이
						 <input type="hidden" name="userId" value="${mb.user_id}"/> 
						 </td>
					</tr>
					<tr>
						<th class="active">제목</th>
						<td><input type="text" name="title" id="title"  class="form-control"></td>
					</tr>
					<tr>
						<th class="active">내용</th>
						<td>
							 <div id="editor_frame"></div>
							 <textarea name="daumeditor" id="daumeditor"   rows="10" cols="100" style="width:920px; height:412px;display: none;">
							 </textarea>
							 
						</td>
					</tr>
				</table>
				<div class="btns">
					<input type="submit" id="save_button" class="btn btn-primary btn-lg" value="작성완료">
					<a href="../reivew/reviewMain" class="btn btn-default btn-lg">목록으로</a>

				</div>
			</form>

		</div>
	</div>
	<!-- review_write end -->
	

<script>
/* 다음 에디터 */
$.ajax({
    url : "${contextPath}/daumeditor/editor_frame.html",
    success : function(data){
        $("#editor_frame").html(data);
        // 에디터UI load
        var config = {
            /* 런타임 시 리소스들을 로딩할 때 필요한 부분으로, 경로가 변경되면 이 부분 수정이 필요. ex) http://xxx.xxx.com */
            txHost: '',
            /* 런타임 시 리소스들을 로딩할 때 필요한 부분으로, 경로가 변경되면 이 부분 수정이 필요. ex) /xxx/xxx/ */
            txPath: '',
            /* 수정필요없음. */
            txService: 'sample',
            /* 수정필요없음. 프로젝트가 여러개일 경우만 수정한다. */
            txProject: 'sample',
            /* 대부분의 경우에 빈문자열 */
            initializedId: "",
            /* 에디터를 둘러싸고 있는 레이어 이름(에디터 컨테이너) */
            wrapper: "tx_trex_container",
            /* 등록하기 위한 Form 이름 */
            form: "userBoardInsert",
            /*에디터에 사용되는 이미지 디렉터리, 필요에 따라 수정한다. */
            txIconPath: "${contextPath}/daumeditor/images/icon/editor/",
            /*본문에 사용되는 이미지 디렉터리, 서비스에서 사용할 때는 완성된 컨텐츠로 배포되기 위해 절대경로로 수정한다. */
            txDecoPath: "${contextPath}/daumeditor/images/deco/contents/",
            canvas: {
                styles: {
                    /* 기본 글자색 */
                    color: "#123456",
                    /* 기본 글자체 */
                    fontFamily: "굴림",
                    /* 기본 글자크기 */
                    fontSize: "10pt",
                    /*기본 배경색 */
                    backgroundColor: "#fff",
                    /*기본 줄간격 */
                    lineHeight: "1.5",
                    /* 위지윅 영역의 여백 */
                    padding: "8px"
                },
                showGuideArea: false
            },
            events: {
                preventUnload: false
            },
            sidebar: {
                attachbox: {
                    show: true,
                    confirmForDeleteAll: true
                }
            },
            size: {
                /* 지정된 본문영역의 넓이가 있을 경우에 설정 */
                contentWidth: 700
            }
            
            
            
        };
        
        //에디터내에 환경설정 적용하기
        new Editor(config);
        
    }
});



//form submit 버튼 클릭
$("#save_button").click(function(){
    //다음에디터가 포함된 form submit
	//유효성 검사
	
 	if (!$("#title").val()) {
		alert("제목을 입력해주세요");
		$("#title").focus();
		return false;
	} 
    
       
    if(!confirm("저장하시겠습니까?")) {
    	
		return false;
		
    }else {
    	
	 	Editor.save();
   		 $("#userBoardInsert").submit();
    }
	
    
});

//Editor.save() 호출 한 다음에 validation 검증을 위한 함수
//validation 체크해줄 입력폼들을 이 함수에 추가 지정해줍니다.
function validForm(editor) {
var validator = new Trex.Validator();
var content = editor.getContent();
if (!validator.exists(content)) {
    alert('내용을 입력하세요');
    return false;
}
return true;
}

//validForm 함수까지 true값을 받으면 이어서 form submit을 시켜주는  setForm함수
function setForm(editor) {
var content = editor.getContent();
$("#daumeditor").val(content)
return true;
}

/*다음에디터 끝 */

</script>
</body>
</html>