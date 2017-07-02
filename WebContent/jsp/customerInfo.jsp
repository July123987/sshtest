<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>客户信息维护</title>
<style>
.divcss5{width:600px;height:120px;border:1px solid #000} 
body,table{ 
font-size:12px; 
} 
table{ 
table-layout:fixed; 
empty-cells:show; 
border-collapse: collapse; 
margin:0 auto; 
} 
td{ 
height:30px; 
} 
h1,h2,h3{ 
font-size:12px; 
margin:0; 
padding:0; 
} 
.table{ 
border:1px solid #000; 
color:#000; 
} 
.table th { 
background-repeat:repeat-x; 
height:30px; 
} 
.table td,.table th{ 
border:1px solid #000; 
padding:0 1em 0; 
} 
.table tr.alter{ 
background-color:#000; 
}
</style>
</head>
 <script language="JavaScript" type="text/javascript">
 function openwind(){
    feature="dialogWidth:650px;dialogHeight:200px;status:no;help:no;scrollbars:no;dialogTop:150;";  
    window.showModalDialog("customerAdd.jsp",null,feature);               
 };
 function updatewindow(){
    feature="dialogWidth:650px;dialogHeight:200px;status:no;help:no;scrollbars:no;dialogTop:150;";  
    window.showModalDialog("custUpdate.jsp",null,feature);               
 };
 function funDelete(){
    //window.onload = alert(111);   
    if(confirm('确定要执行此操作吗?')){
    	return true;
    }else{
    	return false;
    }           
 }
</script>
<body>
	<CENTER>
	<center><div><font color="red" size="6">客户信息维护</font></div></center>
	<div style="width:20px"></div>
	<div class="divcss5"> 
	<s:form action="findCdtCustList" theme="simple">
	<div style="width:10px"></div>
		客户编号：<s:textfield name="cust.custno"    label="custno"></s:textfield>
		客户名称：<s:textfield name="cust.custname"  label="custname"></s:textfield><br>
		出生日期：<s:textfield name="cust.address"   label="address"></s:textfield>
		电话号码：<s:textfield name="cust.telephone" label="telephone"></s:textfield><br>
		<div style="width:20px"></div>
		<input width="100" type = "button" id = "add" name = "btn" value="新增" onClick="openwind();"/>
		<s:submit value="查询"></s:submit>
		<input width="100" type = "button" id = "smt" name = "btn" value="返回" onClick="history.go(-1)"/>
	</s:form>
	</div>
	<div style="width:20px"></div>
	<table border="1" width="47%" class="table">
		<tr>
		 <td>客户编号</td>
		 <td>姓名</td>
		 <td>性别</td>
		 <td>年龄</td>
		 <td>联系方式</td>
		 <td>职务</td>
		 <td>出生日期</td>
		 <td width="80">操作</td>
		</tr>
	    <s:iterator value="#request.list" id="customer">
	      <tr>
	       <td><s:property value="#customer.custno"/></td>
	       <td><s:property value="#customer.custname"/></td>
	       <td>
	       <s:if test="#customer.sex == 1">
	       <s:property value="'男'"/>
	       </s:if>
	       <s:elseif test="#customer.sex == 2">
	       <s:property value="'女'"/>
	       </s:elseif>
	       <s:elseif test="#customer.sex == 3">
	       <s:property value="'其他'"/>
	       </s:elseif>
	       </td>
	       <td><s:property value="#customer.age"/></td>
	       <td><s:property value="#customer.telephone"/></td>
	       <td><s:property value="#customer.position"/></td>
	       <td><s:property value="#customer.logindate"/></td>
	       <td>
	       <s:a href="updatePreviewCust.action?customer.id=%{#customer.id}">修改</s:a>
	       <s:a href="delectCustomer.action?customer.id=%{#customer.id}" onClick="return funDelete();">删除</s:a>
	       </td>
	      </tr>
	      
	    </s:iterator>
	</table>
	</CENTER>
</body>
</html>