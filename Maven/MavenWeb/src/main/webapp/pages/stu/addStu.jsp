<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>添加新学生</h2>
	<s:if test="#parameters.msg[0]==-1">
		<p style="color:red">添加学生失败!</p>
	</s:if>
	<s:elseif test="#parameters.msg[0]==1">
		<p style="color:green">添加学生成功!</p>
	</s:elseif>
	<s:form method="post" action="stuAction_addStu">
		学生姓名:<s:textfield name="stu.sname"/><br/>
		学生年龄:<s:textfield name="stu.sage"/><br/>
		学生性别:<s:radio name="stu.ssex" list="#{'0':'女','1':'男'}" value="%{'1'}"/><br/>
		入学时间:<s:textfield name="stu.sintime"/><br/>
		加入班级:<s:select name="stu.cls.cno" list="#request.classList" headerKey="" headerValue="请选择" listKey="cno" listValue="cname" value="cno"/><br/>
			 <s:submit value="添加学生"/>
	</s:form>
	<a href="${pageContext.request.contextPath }/index.jsp">主页</a>
</body>
</html>