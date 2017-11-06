<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>layPage快速使用</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/layui/css/layui.css" media="all">
</head>
<body>
 
<div id="test1"></div>
 
<script src="${pageContext.request.contextPath}/res/layui/layui.all.js"></script>
<script>
layui.use('laypage', function(){
  var laypage = layui.laypage;
  
  //执行一个laypage实例
  laypage.render({
	  elem: 'test1'
	  ,count: 70 //数据总数，从服务端得到
	  ,jump: function(obj, first){
	    //obj包含了当前分页的所有参数，比如：
	    console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
	    console.log(obj.limit); //得到每页显示的条数
	    
	    //首次不执行
	    if(!first){
	      //do something
	    }
	  }
	});
});
</script>
</body>
</html>