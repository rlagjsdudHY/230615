<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
    <!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>Document</title>
		<link rel="stylesheet" href="/style/style.css">
		<style>
		
		</style>
	</head>
	<body>
		<div id="wrap">
			<h1>리스트</h1>
			<hr>
			<button onclick="location.href='/inputPage'">입력</button>
			<button onclick="location.href='/'">평균석차</button>
			<div class="listHeader listColumn dFlex">
				<span>석차</span>
				<span>수험번호</span>
				<span>이름</span>
				<span>국어</span>
				<span>한국사</span>
				<span>평균</span>
				<span>연락처</span>
				<span>등록일</span>
				<span>삭제</span>
			</div>
			<c:forEach var="list" items="${boardList}" varStatus="status">
				<div class="listRow listColumn dFlex" data-link="${list.num}">
					<span>${status.index + 1}</span>
					<span>${list.examCode}</span>
					<span>${list.userName}</span>
					<span>${list.korean}</span>
					<span>${list.histore}</span>
					<span>${list.avga}</span>
					<span>${list.phone}</span>
					<span>${list.regTM }</span>
					<button type="submit" onclick="location.href='/del?num=${list.num}'">삭제</button>
				</div>
			</c:forEach>
			
			
		</div>	
		<!-- div#wrap -->
		<script src="/script/jquery-3.6.4.min.js"></script>
        <script src="/script/script.js"></script>	
	</body>
</html>
   
 