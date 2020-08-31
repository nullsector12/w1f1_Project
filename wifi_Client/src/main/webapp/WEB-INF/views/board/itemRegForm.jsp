<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.27.0/moment.min.js"></script>
</head>
<body>

	<%@ include file="/WEB-INF/views/include/header.jsp" %>
	
	<div id="itemList"></div>
	
	<br>
	
	<div id="itemDetails"></div>
	
	<br><br>
	<div id="itemListView"></div>
	
	<br><br>
	<div id="pageNumber"></div>

	<div id="testArea">
	</div>
		<form method="post" enctype="multipart/form-data">
			<div class="form-group row mb-4">
			    <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3">제목</label>
			    <div class="col-sm-12 col-md-7">
			      <input type="text" class="form-control" id="title" name="title" required>
			    </div>
			  </div>
			  <div class="form-group row mb-4">
			    <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3">카테고리</label>
			    <div class="col-sm-12 col-md-7">
			      <select class="form-control selectric" id="category" name="category">
					<option value="0">과일</option>
					<option value="1">육류</option>
					<option value="2">해산물</option>
					<option value="3">채소</option>
					<option value="4">생필품</option>
					<option value="5">음료</option>
					<option value="6">기타</option>
			      </select>
			    </div>
			  </div>
			  <div class="form-group row mb-4">
			    <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3">가격</label>
			    <div class="col-sm-12 col-md-7">
			      <input type="number" class="form-control" id="price" name="price" placeholder="숫자만 입력해주세요" required>
			    </div>
			  </div>
			  <div class="form-group row mb-4">
			    <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3">모집 인원</label>
			    <div class="col-sm-12 col-md-7">
			      <input type="number" class="form-control" id="count_m" name="count_m" min="2" placeholder="숫자만 입력해주세요" required>
			    </div>
			  </div>
			  <div class="form-group row mb-4">
			    <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3">물품 수령 장소</label>
			    <div class="col-sm-12 col-md-7">
			      <input type="text" class="form-control" id="addr" name="addr" required>
			  </div>
			  </div>
			  <div class="form-group row mb-4">
			    <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3">수령 날짜</label>
			    <div class="col-sm-12 col-md-7">
			      <input type="datetime-local" id="receive" name="receive" required>
			  </div>
			  </div>
			  <div class="form-group row mb-4">
			    <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3">내용</label>
			    <div class="col-sm-12 col-md-7">
			      <textarea class="form-control" id="content" name="content" style="resize: none; height: 200px" required></textarea>
			  </div>
			</div>
<!-- 			<div class="form-group row mb-4">
			  <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3">사진 업로드</label>
			  <div class="col-sm-12 col-md-7">
			    <input type="file" name="img" id="img">
			  </div>
			</div> -->
			<div class="form-group row mb-4">
			    <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3">추가 옵션</label>
			    <div class="col-sm-12 col-md-7">
			      <input type="radio" class="state" name="state" id="powerList" value="1">추천공구로 등록하기 
			      <span></span> 
			      <input type="radio" class="state" name="state" id="normalList" value="0" checked>일반공구로 등록하기
				</div>
			</div>
			<div class="form-group row mb-4">
			  <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3">게시자 idx</label>
			  <div class="col-sm-12 col-md-7">
			   <input type="number" name="midx" id="midx" value="${loginInfo.midx}">
			  </div>
			</div>
			<div class="form-group row mb-4">
			  <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3"></label>
			  <div class="col-sm-12 col-md-7">
			    <input class="btn btn-primary" value="등록" type="submit" onclick="regItem();">
			  </div>
			</div>
         </form>
</body>
</html>	

<script>


	
function regItem() {
	
	var regFormData = new FormData();
	regFormData.append('title', $('#title').val());
	regFormData.append('category', $('#category').val());
	regFormData.append('price', $('#price').val());
	regFormData.append('count_m', $('#count_m').val());
	regFormData.append('count_w', $('#count_m').val()*2);
	regFormData.append('addr', $('#addr').val());
	regFormData.append('receive', moment($('#receive').val()).format('YYYY-MM-DD hh:mm:ss'));
	regFormData.append('content', $('#content').val());
	regFormData.append('state', $('.state').val());
	regFormData.append('view_count', 0);
	regFormData.append('midx', $('#midx').val());
	
	$.ajax({
		
		url: "http://localhost:8090/wifi/regItem",
		type: 'POST',
		processDate: false,
		contentType: false,
		data: regFormData,
		success: function(data) {
			alert('등록이 완료되었습니다.');
			
		},
		error: function(data) {
			console.log(data);
			alert('등록에 실패했습니다.');
			
		} // regItem ajax error end
		
		
	}); // regItem ajax end
	
}// regItem function end
	
	
</script>