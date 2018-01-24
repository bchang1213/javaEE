<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Random Word Generator</title>
</head>
<body>
	<h1>You have generated a word <%= session.getAttribute("sessioncount") %> times.</h1>
	<h1><%= session.getAttribute("word") %></h1>
	<form action="HomePage" method="GET">
		<input type="submit" name="submit" value="Generate">
	</form>
	
	<fieldset>
		<legend>The last time you generated a word was:</legend>
		<p><%= session.getAttribute("timestamp") %></p>
	</fieldset>
</body>
</html>