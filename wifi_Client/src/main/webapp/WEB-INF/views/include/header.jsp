<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<link rel="stylesheet" type="text/css" href="/static/css/bootstrap.css">
<script src="/static/js/bootstrap.js"></script>

<header>
      <div class="collapse bg-dark" id="navbarHeader">
        <div class="container">
        </div>
      </div>
      <div class="navbar navbar-dark bg-dark box-shadow">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarHeader" aria-controls="navbarHeader" aria-expanded="false" aria-label="Toggle navigation">
        	<span class="navbar-toggler-icon"></span>
      	</button>
        <div class="container d-flex justify-content-between">
		    <ul id="nav" class="nav justify-content-center">		
				<li id="list" class="nav-item"><a class="nav-link active" href="
					<c:if test="${!empty loginInfo}"><c:url value="${pageContext.request.contextPath}/wifi/itemList"/></c:if>
					<c:if test="${empty loginInfo}"><c:url value="${pageContext.request.contextPath}/wifi/kakaoLogin"/></c:if> ">게시판으로</a>
				</li>
			<c:if test="${!empty loginInfo}">
				<li id="logout" class="nav-item">
					<a class="nav-link active" href="${logout_url}">로그아웃</a>
				</li>
			</c:if>
			</ul>
        </div>
      </div>
    </header>
	

	
	

