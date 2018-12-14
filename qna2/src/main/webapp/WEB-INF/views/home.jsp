<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>홈입니다.</h1>
	<a href="${pageContext.request.contextPath}/insert">글쓰기</a>
	<table border="1" width="1000">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성일</th>
		</tr>
		<c:choose>
			<c:when test="${fn:length(board) eq 0}">
				<tr>
					<td colspan="3">등록된 게시물이 없습니다.</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="vo" items="${board}">
					<tr>
						<td>${vo.qnum}</td>
						<td>
						<c:forEach begin="1"  end="${vo.depth}">&nbsp;Re:</c:forEach>
						<a href="${pageContext.request.contextPath}/detail?qnum=${vo.qnum}">${vo.title}</a></td>
						<td>${vo.regdate}</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
	
	<c:choose>
		<c:when test="${pageNum > 1}">
			<a href="${pageContext.request.contextPath}/?pageNum=${pageNum - 1}">[<<]</a>
		</c:when>
		<c:otherwise>
			[<<]
		</c:otherwise>
	</c:choose>
	
	<c:forEach var="i" begin="${util.startPage}" end="${util.endPage}">
		<c:choose>
			<c:when test="${i eq pageNum}">
				<a href="${pageContext.request.contextPath}/?pageNum=${i}"><span style="color:red">[${i}]</span></a>
			</c:when>
			<c:otherwise>
				<a href="${pageContext.request.contextPath}/?pageNum=${i}"><span style="color:black">[${i}]</span></a>
			</c:otherwise>
		</c:choose>
	</c:forEach>
	<c:choose>
		<c:when test="${pageNum < maxPage}">
			<a href="${pageContext.request.contextPath}/?pageNum=${pageNum + 1}">[>>]</a>
		</c:when>
		<c:otherwise>
			[>>]
		</c:otherwise>
	</c:choose>
</body>
</html>