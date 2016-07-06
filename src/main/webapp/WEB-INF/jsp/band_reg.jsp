<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>

	<h2>Banda Regisztráció</h2>
	<form method="POST" action="">
		<table>
			<tr>
				<td><label path="name">Név</label></td>
				<td><input name="name" path="name" /></td>
			</tr>
			<tr>
				<td><label path="style">Stílus</label></td>
				<td><input name="style" path="style" /></td>
			</tr>

			<tr>
				<td><label path="email">Email</label></td>
				<td><input name="email" path="email" /></td>
			</tr>
			
			<tr>
				<td><label path="password">Jelszó</label></td>
				<td><input name="password" path="password" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>