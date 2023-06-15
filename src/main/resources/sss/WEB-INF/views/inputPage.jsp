<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
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
			<h1>수험자 결과입력</h1>
			<hr>
			<form action="/input">
			<fieldset>
				<ul>
					<li>
						<span>수험번호</span>
						<input type="text" name="examCode" id="userName"
						>
					</li>
					<li>
						<span>이름</span>
					<input type="text" name="userName" id="userPhone">
					</li>
					<li>
						<span>국어</span>
					<input type="text" name="korean" id="userPhone">
					</li>
					<li>
						<span>한국사</span>
					<input type="text" name="histore" id="userPhone">
					</li>
					<li>
						<span>연락처</span>
					<input type="text" name="phone" id="userPhone">
					</li>
				</ul>
			</fieldset>
			 
			
			
			<div id="btnArea">
				<button type="submit" >저장</button>
				<button type="button" onclick="location.href='/list'">목록</button>
			</div>
			
			</form>
		</div>	
		<!-- div#wrap -->
		<script src="/script/jquery-3.6.4.min.js"></script>
        <script src="/script/script.js"></script>	
	</body>
</html>
   
 