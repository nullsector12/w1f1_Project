<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="resources/css/bootstrap.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>    

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
					<c:if test="${!empty loginInfo}"><c:url value="/board/itemList"/></c:if>
					<c:if test="${empty loginInfo}"><c:url value="${kakao_url}"/></c:if> ">게시판으로</a>
				</li>
			<c:if test="${!empty loginInfo}">
				<li id="logout" class="nav-item">
					<a class="nav-link active" href="${logout_url}">로그아웃</a>
				</li>
				<li id="info" class="nav-item">
					<h3 class="nav-link disabled">아이디 출력 : ${loginInfo.id}</h3>
				</li>
			</c:if>
			</ul>
        </div>
      </div>
    </header>
	

	
	

