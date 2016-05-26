<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function cheackout(user){
		var uname=user.value;
		if(!uname){
			alert("用户名不能为空!");
		}else{
			var url="RegisterServlet";
			var userinfo="uname="+uname;
			xmlhttprequest = new creatxmlhttprequest();
			xmlhttprequest.onreadystatechange=callback;
			xmlhttprequest.open("post",url,true);
			xmlhttprequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
			xmlhttprequest.send(userinfo);
		}
	}
	
	function creatxmlhttprequest(){
		if(window.XMLHttpRequest){
			xmlhttprequest=new XMLHttpRequest();
			return xmlhttprequest;
		}else{
			xmlhttprequest=new ActiveXObject("Microsoft.XMLHTTP");
			return xmlhttprequest;
		}
	}
	
	function callback(){
		if(xmlhttprequest.readyState==4 && xmlhttprequest.status==200){
			var result=xmlhttprequest.responseText;	
			result=result.replace(/(^\s*)|(\s*$)/g,"");
			if(result){
				alert("用户名已经存在");
			}else{
				alert("用户名可以是用");
			}
		}
	}
</script>
</head>
<body>
	<form action="RegisterServlet" method="get">
		用户名：<input type="text" name="uname" onblur="cheackout(this)"/>
		密码：<input type="password" name="password"/>
		<input type="submit" value="提交"/>	
	</form>
</body>
</html>