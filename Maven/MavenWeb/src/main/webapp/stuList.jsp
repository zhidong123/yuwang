<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>学生列表</h2>
	<table border="1" width="650">
		<tr>
		<td>编号</td><td>班级名称</td>
		<td>学生姓名</td><td>年龄</td>
		</tr>
		<s:iterator value="#request.stuList" var="st" status="ids">
		<tr>
		<td>${ids.count}</td><td>${st[1].cname }</td>
		<td>${st[0].sname}</td><td>${st[0].sage}</td>
		</tr>
		</s:iterator>
	</table>
</body>
</html>