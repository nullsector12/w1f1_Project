<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>    
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/wifi.css">

<nav class="w3-sidebar w3-collapse w3-white w3-animate-left" style="z-index:3;width:300px;" id="mySidebar"><br>
	<div class="w3-container w3-row">
	  <div class="w3-col s4">
	    <img src="../w1f1_login_view/images/pichu.png" class="w3-circle w3-margin-right" style="width:46px">
	  </div>
	  <div class="w3-col s8 w3-bar">
	    <span>Welcome, <strong>닉네임</strong></span><br>
	    <a href="#" class="w3-bar-item w3-button"><i class="fa fa-envelope"></i></a>
	    <a href="#" class="w3-bar-item w3-button"><i class="fa fa-user"></i></a>
	    <a href="#" class="w3-bar-item w3-button"><i class="fa fa-cog"></i></a>
	  </div>
	</div>
	<hr>
	<div class="w3-container">
	  <h5>Dashboard</h5>
	</div>
	<div class="w3-bar-block">
	  <a href="#" class="w3-bar-item w3-button w3-padding-16 w3-hide-large w3-dark-grey w3-hover-black" onclick="w3_close()" title="close menu"><i class="fa fa-remove fa-fw"></i>&nbsp; Close Menu</a>
	    <a href="#" class="w3-bar-item w3-button w3-padding w3-blue"><i class="fa fa-users fa-fw"></i>&nbsp; Overview</a>
	    <a href="#" class="w3-bar-item w3-button w3-padding"><i class="fa fa-eye fa-fw"></i>&nbsp; Views</a>
	    <a href="#" class="w3-bar-item w3-button w3-padding"><i class="fa fa-users fa-fw"></i>&nbsp; Traffic</a>
	
	</div>
</nav>
	
