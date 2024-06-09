<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="load" modelAttribute="emp">
	<pre>
		EID   : <form:input path="eid"/>
		ENAME : <form:input path="ename"/>
		ESAL  : <form:input path="esal"/>
				<form:button>submit</form:button>
	</pre>
	</form:form>
</body>
</html>