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

	<h1>글쓰기.</h1>
	
	<form name="insert" method="POST" action="${pageContext.request.contextPath}/insert" onsubmit="return valid();">
		<input type="hidden" value="${grpno}" name="grpno">
		<input type="hidden" value="${grpord}" name="grpord">
		<input type="hidden" value="${depth}" name="depth">
		
		<table>
			<tr>
				<td>제목</td>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="5" cols="50" name="content"></textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="작성"></td>
			</tr>
		</table>
		<a href="${pageContext.request.contextPath}/">홈으로</a>
	</form>
	<script type="text/javascript">
	function valid(){
		var insertForm = document.forms["insert"];
		
		if(insertForm['title'].value.length < 1){
			alert("제목을 입력하세요");
			return false;
		}
		if(insertForm['content'].value.length < 1){
			alert("내용을 입력하세요");
			return false;
		}
		return true;
	}
	</script>
</body>
</html>

