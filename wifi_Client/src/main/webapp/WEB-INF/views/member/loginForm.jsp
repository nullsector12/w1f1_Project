<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 확인</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
</head>
<body>

	<%@ include file="/WEB-INF/views/include/header.jsp" %>

	<form method="post">
		<table>
			<tr>
				<td>카카오 인증 아이디 확인</td>
				<td><input type="email" name="id" id="id" value="${email}" readonly></td>
			</tr>
			<tr>
				<td><input type="submit" value="확인"></td>
			</tr>
		</table>
	</form>
</body>
</html>
