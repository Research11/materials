<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function cheackout(ouser){
		
		var uname=ouser.value;
		
		if(!uname){
			alert("用户名不能为空");
			ouser.focus();
		}else{
			
			var url="http://localhost:8080/AjaxDemo/Log?uname="+uname;
			
			 xmlhttprequest=creatxmlhttprequest();
			
			xmlhttprequest.onreadystatechange=callba1;
			
			xmlhttprequest.open("get",url,true);
			
			xmlhttprequest.send(null);
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
	
	function callba1(){
		
		if(xmlhttprequest.readyState==4 && xmlhttprequest.status==200){
			
			var b=xmlhttprequest.responseText;
			
			b=b.replace(/(^\s*)|(\s*$)/g,"");
			alert(b);
			if(b=="true"){
				alert(b);
				alert("用户名已经存在");
			}
			else{
				alert("用户名可以使用");
			}
			
		}
	}

</script>
</head>
<body>
	<form action="Login" method="get">
		用户名：<input type="text" name="uname" onblur="cheackout(this)"/>
		密码：<input type="password" name="password"/>
		<input type="submit" value="提交"/>
	</form>
 </body>
</html>