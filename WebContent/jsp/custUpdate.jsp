<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!-- 下拉菜单 -->
<s:action name="typeAction" id="list"></s:action>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>修改客户信息</title>
<style>
.divcss5{width:600px;height:100px;border:1px solid #000} 
</style>
</head>
<script type="text/javascript">
 function updatewindow(){
    alert("保存成功"); 
    window.showModalDialog("custUpdate.jsp",null,feature);               
 };
</script>
<body>
	<CENTER>
	<div><font size="5" color="red">修改客户信息</font></div>
	<center></center>
	<div style="width:20px"></div>
	<div class="divcss5"> 
	<s:form action="updateCust" theme="simple">
	<div style="width:10px"></div>
		客户编号：<s:textfield name="customer.custno" value="%{customer.custno}"    label="custno"></s:textfield>
		性别：<s:select name="strList" headerKey="0" value="%{customer.sex}" headerValue="-----------请选择-----------" list="#list.strList" listKey="id" listValue="name"/><br>
		客户名称：<s:textfield name="customer.custname" value="%{customer.custname}"  label="custname"></s:textfield>
		年龄：<s:textfield name="customer.telephone" label="%{customer.telephone}"></s:textfield><br>
		<s:hidden name="customer.id" value="%{customer.id}" ></s:hidden>
		<tr><td>&nbsp;</td></tr>
		<s:submit value="保存" onClick="window.history.back(-1);"></s:submit>
		<input width="100" type = "button" id = "smt" name = "btn" value="关闭" onClick="history.go(-1);"/>
	</s:form>
	</div>
	<div style="width:20px"></div>
	</CENTER>
</body>
</html>