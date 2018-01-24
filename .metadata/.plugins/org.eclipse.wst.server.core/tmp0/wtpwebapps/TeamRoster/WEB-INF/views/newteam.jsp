<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Make a new Team</title>
</head>
<body>
	<h1>Create a new team</h1>
	<form action="create" method="POST">
		<label>Team Name: <input type="text" name="name"/></label>
		<input type="submit" name="submit" value="submit" />
	</form>
</body>
</html>