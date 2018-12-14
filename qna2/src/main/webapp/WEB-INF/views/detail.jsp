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

	<h1>상세.</h1>
	<table>
		<tr>
			<td>제목</td>
			<td>${vo.title}</td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea rows="5" cols="50">${vo.content}</textarea></td>
		</tr>
	</table>
	<a href="${pageContext.request.contextPath}/delete?qnum=${vo.qnum}">삭제</a>
	<a href="${pageContext.request.contextPath}/">홈으로</a>
	<a href="${pageContext.request.contextPath}/update?qnum=${vo.qnum}">수정</a>
	<a href="${pageContext.request.contextPath}/insert?grpno=${vo.grpno}&grpord=${vo.grpord}&depth=${vo.depth}">답변</a>
</body>
</html>