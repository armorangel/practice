<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>수정.</h1>
	<form method="POST" action="${pageContext.request.contextPath}/update">
	<input type="hidden" value="${vo.qnum}" name="qnum">
		<table>
			<tr>
				<td>제목</td>
				<td><input type="text" value="${vo.title}" name="title"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="5" cols="50" name="content">${vo.content}</textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="수정"></td>
			</tr>
		</table>
	</form>
	<a href="${pageContext.request.contextPath}/">홈으로</a>
</body>
</html>