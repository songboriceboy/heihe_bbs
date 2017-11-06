<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	//ajax helloworld
	window.onload = function(){
		//创建ajax对象
		var req = new XMLHttpRequest();
		
		//与服务器建立连接
		req.open("get","${pageContext.request.contextPath}/ajax.do?username=zhangsan",true);
		//发送请求
		req.send();
		
		//监控当前ajax请求状态，绑定事件处理函数
		req.onreadystatechange = function(){
			//alert(req.readyState);//输出当前ajax请求 所处的状态
			//已经成功获得服务器回应
			if(req.readyState===4){
				//服务器响应成功
				if(req.status === 200)
				{
					alert(req.responseText);
				}
				else//响应失败
				{
					
				}
				
			}
			
		}
		
		
	}
</script>
</head>
<body>

</body>
</html>