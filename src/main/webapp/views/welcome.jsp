<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<c:if test="${result == 'fail' }">
	噺据亜脊 叔鳶 ばばばばばばばばばばばばばばばばばば<br/>
	<a href="/">五昔生稽 亜奄 ばばばばば</a>
</c:if>

<c:if test="${result == 'good' }"> 
	${user.name }還 噺据亜脊 ずせずせずせ <br/>
	<a href="/">五昔生稽 壱壱壱壱壱壱壱壱</a>
</c:if>

</body>
</html>