<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="updateperson" method="post">
		<input type="text" name="id" value="${person.id}" readonly="readonly"/><br/>
		<input type="text" name="name" value="${person.name}"/><br/>
		<input type="text" name="age" value="${person.age}"/><br/>
		<input type="text" name="email" value="${person.email}"/><br/>
		<input type="text" name="birthday" value="${person.birthday}"/><br/>
		<input type="submit" value="提交"/>	
		<input type="button" onclick="history.go(-1)" value="返回"/>
	</form>
</body>
</html>