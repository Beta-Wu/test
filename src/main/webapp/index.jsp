<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  	<form action="${pageContext.request.contextPath }/login.jsp">
		<input type="text" name="username">
		<input type="password" name="password">
		<input type="submit" value="登录">
	</form>
	
<%-- 	<a href="${pageContext.request.contextPath }/register">注册</a> --%>
<%--    <input type="button" name="login" value="登录" onclick="window.location.href='${pageContext.request.contextPath }/showLogin.jsp'"> --%>
    <input type="button" name="login" value="登录" onclick="window.location.href='${pageContext.request.contextPath }/login.jsp'">
    <input type="button" name="register" value="注  册" onclick="window.location.href='${pageContext.request.contextPath }/register.jsp'">
	<button onclick="window.location='${pageContext.request.contextPath }/list'">用户</button>
	
</body>
</html>