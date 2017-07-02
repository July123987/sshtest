<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>operation</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
.divcss5{width:600px;height:200px;border:1px solid #000} 
</style>
  </head>
  
  <body>
    <!--<div><h1>This is my JSP page</h1><br></div>
    <form action="" styles=""><font size="10" color="red">ssh-test-集成环境测试</font></form></center>-->
    <center>
    <div class="divcss5"> 
     <center><h1><font color="red">操作列表</font></h1>
     <s:a href="jsp/customerInfo.jsp">客户信息管理</s:a><br><br><br>
     <s:a href="listCompany.action">查询公司信息</s:a> </center>
    </div>
    <center>
  </body>
</html>
