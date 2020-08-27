<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#itemList {
		overflow: hidden;
	}
	div.card {
		width: 33%;
		float: left;
		
		border : 1px solid #DDD;
		
	}
	
	div.card>ul>li {
		list-style: none;
		font-size: 12px;
	}
	
	div.keywordBox {
		display: block;
	}
	
	div.categoryBox {
		display: none;
	}
	
	#regForm {
		display: none;
	} 
	
	#itemDetails {
		display: none;
	}
	#emphasis {
		color: red;
		font-weight: bold;
	}
</style>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.27.0/moment.min.js"></script>
<link rel="stylesheet" href="resources/css/bootstrap.css">
<script src="resources/js/bootstrap.js"></script>
</head>
<body>


	<h1>공구게시판</h1>

	
	<div id="itemList"></div>
	
	<br>
	
	<div id="itemDetails"></div>
	
	<br><br>
	<div id="itemListView"></div>
	
	<br><br>
	<div id="pageNumber"></div>

	<div id="testArea">
	</div>
	
	<div id="regArea"><input type="button" value="글쓰기" onclick="itemReg();">
		<form action="@{/save}" method="post" enctype="multipart/form-data">
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
			      <input type="number" class="form-control" id="countM" name="countM" min="2" placeholder="숫자만 입력해주세요" required>
			    </div>
			  </div>
			  <div class="form-group row mb-4">
			    <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3">물품 수령 장소</label>
			    <div class="col-sm-12 col-md-7">
			      <input type="text" class="form-control" id="title" name="title" required>
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
			      <input type="checkbox" name="state" id="state" value="3">추천공구로 등록하기<input type="checkbox" name="state" id="state" value="4">일반공구로 등록하기
				</div>
			</div>
			게시자idx : <input type="number" name="midx" id="midx" value="${loginInfo.midx}">
			<div class="form-group row mb-4">
			  <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3"></label>
			  <div class="col-sm-12 col-md-7">
			    <input class="btn btn-primary" value="등록" type="submit">
			  </div>
			</div>
         </form>
	</div>
</body>
</html>	