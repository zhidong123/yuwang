<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>班级列表</h2>
	
	<s:if test="#parameters.msg[0]==-1">
		<p style="color:red">操作班级失败!</p>
	</s:if>
	<s:elseif test="#parameters.msg[0]==1">
		<p style="color:green">操作班级成功!</p>
	</s:elseif>
	<!-- 列表 -->
	<table border="1" width="600">
	<tr>
		<td>序号</td><td>班级名称</td>
		<td>添加时间</td><td>状态</td>
		<td colspan="2">管理</td>
	</tr>
	<s:iterator var="obj" value="stulist" status="ids">
	<tr>
		<td>${ids.index + 1 }</td><td>${obj.cname }</td>
		<td>${obj.createtime }</td><td>${obj.status==1?'启用':'禁用' }</td>
		<td><a href="classAction_deleteClass?cla.cno=${obj.cno }">删除</a></td>
		<td><a href="classAction_toupdateClass?cla.cno=${obj.cno }">修改</a></td>
	</tr>
	</s:iterator>
	</table>
	<a href="${pageContext.request.contextPath }/index.jsp">主页</a>
</body>
</html>