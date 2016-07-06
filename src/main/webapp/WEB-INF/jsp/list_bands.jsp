<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>


	<c:forEach items="${bands}" var="band">
		<tr>
			<td>Név: ${band.name}</td>
		</tr>
	</c:forEach>
	
</body>
</html>
