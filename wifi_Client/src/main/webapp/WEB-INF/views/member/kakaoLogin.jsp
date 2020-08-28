<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카카오 로그인 REST API 테스트</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
</head>
<body class="text-center">
<header>
	<%@ include file="/WEB-INF/views/include/header.jsp" %>
</header>


    <form id="index-form" class="form-signin" method="post">
    <c:if test="${empty loginInfo}">
      <img class="mb-4" src=<c:url value="/static/images/1Ps.png" /> alt="" width="72" height="72" />
      <h1 class="h3 mb-3 font-weight-normal">"w1-f1"의 모든 서비스는 로그인이 필요합니다.</h1>
    	<div class="checkbox mb-3">
    		<label>
        		<input type="checkbox" value="remember-me"> 로그인 안할꺼면 ㄲㅈ
      		</label>
    	</div>
    </c:if>  
    <c:if test="${empty loginInfo}">
		<a href="${kakao_url}"> <img id="button" src=<c:url value="/static/images/kakao_login_medium_narrow.png" />/></a>
	</c:if>
   	</form>

 
 <footer>
 	<p class="mt-5 mb-3 text-muted">© 2019-2020</p>
 </footer> 
	
</body>
</html>