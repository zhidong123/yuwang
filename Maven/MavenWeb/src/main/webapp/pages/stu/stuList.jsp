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
	<h2>学生列表</h2>
	
	<s:if test="#parameters.msg[0]==-1">
		<p style="color:red">操作班级失败!</p>
	</s:if>
	<s:elseif test="#parameters.msg[0]==1">
		<p style="color:green">操作班级成功!</p>
	</s:elseif>
	<!-- 列表 -->
	<table border="1" width="600">
	<tr>
		<td>序号</td><td>学生名称</td>
		<td>性别</td><td>年龄</td>
		<td>入学时间</td><td>所在班级</td>
		<td colspan="2">管理</td>
	</tr>
	<s:iterator var="obj" value="stuList" status="ids">
	<tr>
		<td>${ids.index + 1 }</td><td>${obj.sname }</td>
		<td>${obj.ssex==1?'男':'女' }</td><td>${obj.sage }</td>
		<td>${obj.sintime }</td><td>${obj.cls.cname }</td>
		<td><a href="stuAction_deleteStu?stu.sno=${obj.sno }">删除</a></td>
		<td><a href="stuAction_toUpdateStu?stu.sno=${obj.sno }">修改</a></td>
	</tr>
	</s:iterator>
	</table>
	<a href="${pageContext.request.contextPath }/index.jsp">主页</a>
</body>
</html>