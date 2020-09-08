<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<link rel="stylesheet" type="text/css" href="/static/css/bootstrap.css">
<script src="/static/js/bootstrap.js"></script>
</head>
<body>
	<header>
		<%@ include file="/WEB-INF/views/include/header.jsp" %>
	</header>
	
	<h1> 아이템 리스트 </h1>
	
	<div id="powerList"></div>
	
	<div id="itemlist"></div>
	
	<c:if test="${!empty loginInfo}">
	<div><input class="btn btn-primary" type="button" value="글쓰기" onclick="goItemReg();"> </div>
	</c:if>
	<c:if test="${empty loginInfo}">
	<div><input class="btn btn-primary" type="button" value="글쓰기" onclick="goLogin();"> </div>
	</c:if>
	<div id="itemDetails"></div>
</body>
</html>
<script>
	// Item 객체 생성
	function Item(iidx, title, price, count_m, count_w, regdate, 
			receive, addr, content, state, view_count, category, midx) {
		
		this.iidx = iidx;
		this.title = title;
		this.price = price;
		this.count_m = count_m;
		this.count_w = count_w;
		this.regdate = regdate;
		this.receive = receive;
		this.addr = addr;
		this.content = content;
		this.state = state;
		this.view_count = view_count;
		this.category = category;
		this.midx = midx;
		
	} // Item 객체 생성 end
	
	// ItemListView 객체 생성
	function ItemListView (itemTotalCount, currentPageNumber, itemList, pageTotalCount, itemCountPerPage, startRow){
		this.itemTotalCount = itemTotalCount;
		this.currentPageNumber = currentPageNumber;
		this.itemList = itemList;
		this.pageTotalCount = pageTotalCount;
		this.itemCountPerPage = itemCountPerPage;
		this.startRow = startRow;
	
	} // ItemListView 객체 생성 end
	
	function getItemListView () {
		
		var html = '';
		
	} // getItemListView() end
	
	// 게시글 등록으로 이동
	function goItemReg() {
		location.href="/wifi/itemRegForm";
	} 
	
	// 로그인하러 이동
	function goLogin() {
		alert('로그인 페이지로 이동합니다.')
		location.href="wifi/kakaoLogin";
	} 
	
</script>