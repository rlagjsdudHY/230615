<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>Document</title>
		<link rel="stylesheet" href="/style/style.css">
		<style>
		div#a{ text-align: center; width: 600px; margin: 0 auto; border: 1px solid #000;  }
		</style>
	</head>
	<body>
		<div id="a">
			<h1>${resultList.userName} 수험 정보</h1>
			<hr>
			 <div>수험 번호 : ${resultList.examCode}</div>
			 <div>국어 : ${resultList.korean}</div>
			 <div>한국사 : ${resultList.histore}</div>
			 <div>평균 : ${resultList.avga}</div>
			 <div>연락처 : ${resultList.phone}</div>
			 <div>등록시간 : ${resultList.regTM }</div>
			 <button type="submit" onclick="location.href='/list'">목록</button>
			 <button type="submit" onclick="location.href='/inputPage'">입력</button>
			 <button type="submit" onclick="location.href='/modifyPage?num=${resultList.num}'">수정</button>
				 
			
		</div>	
		<!-- div#wrap -->
		<script src="/script/jquery-3.6.4.min.js"></script>
        <script src="/script/script.js"></script>	
	</body>
</html>
   
 