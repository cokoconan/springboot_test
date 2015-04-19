<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
	function aa(){
		location.href="/";
	}
</script>
</head>
<body style="text-align: center; margin: 10px 10px 10px 10px;">

<table class="table table-hover">
<tr>
	<td>순번</td>
	<td>이름</td>
	<td>폰번호</td>
	<td>나이</td>
</tr>
<c:forEach items="${usr }" var="a" varStatus="aa">
<tr>
	<td>${aa.count }</td>
	<td>${a.name }</td>
	<td>${a.phone }</td>
	<td>${a.age }</td>
</tr>
</c:forEach>

</table>

<button type="button" class="btn btn-info" id="goback" onclick="aa()">뒤로가기</button>
</body>
</html>