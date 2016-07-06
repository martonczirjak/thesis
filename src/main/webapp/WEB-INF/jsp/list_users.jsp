<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>


	<c:forEach items="${users}" var="user">
		<tr>
			<td>Név: ${user.name}</td>
			<td>Kor: ${user.age}</td>
		</tr>
	</c:forEach>
	
</body>
</html>
