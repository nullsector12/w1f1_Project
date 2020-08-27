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
<style>
	#index-form {
	 margin-top: 250px;
	}
</style>
</head>
<header>
	<%@ include file="/WEB-INF/views/include/header.jsp" %>
</header>
<body class="text-center">
    <form id="index-form" class="form-signin" method="post">
    <c:if test="${empty loginInfo}">
      <img class="mb-4" src=<c:url value="/static/images/1Ps.png" /> alt="" width="72" height="72" />
      <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
    	<div class="checkbox mb-3">
    		<label>
        		<input type="checkbox" value="remember-me"> Remember me
      		</label>
    	</div>
    </c:if>  
    <div id="login">
		<c:if test="${!empty loginInfo}">
			<div id="kakao_id_logout" style="text-align: center"> 
			<a href="${logout_url}">로그아웃</a> 	
			</div>
		</c:if>
		<c:if test="${!empty loginInfo}">
			<h1>접속한 유저 : ${loginInfo}</h1>
			<h1>아이디 출력 : ${loginInfo.id}</h1>
		</c:if>
	</div>
    <c:if test="${empty loginInfo}">
		<a href="${kakao_url}"> <img id="button" src=<c:url value="/static/images/kakao_login_medium_narrow.png" />/></a>
	</c:if>
    
 
   	</form>
 
 <footer>
 	<p class="mt-5 mb-3 text-muted">© 2019-2020</p>
 </footer> 

</body>
</html>