<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>Bejelentkezés</title>
</head>
<body>

	<h2>Bejelentkezés</h2>
	<form method="POST" action="">
		<table>
			<tr>
				<td><label path="username">Felhasználónév</label></td>
				<td><input name="username" path="username" /></td>
			</tr>
			
			<tr>
				<td><label path="password">Jelszó</label></td>
				<td><input name="password" type="password" path="password" /></td>
			</tr>



			<!-- 			<tr> -->
			<!-- 				<td><label path="id">Id</label></td> -->
			<!-- 				<td><input name="id" path="id" /></td> -->
			<!-- 			</tr> -->
			<!-- 			<tr> -->
			<!-- 				<td><label path="gender">Is Male?</label></td> -->
			<!-- 				<td><input name="gender" checked="checked" type="checkbox" path="gender" /></td> -->
			<!-- 			</tr> -->
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>