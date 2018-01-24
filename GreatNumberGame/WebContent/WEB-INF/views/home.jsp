<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Great Number Game</title>
</head>
<body>
	<h1>Welcome to the Greater Number Game!</h1>
	<p>I am thinking of a number between 1 and 100</p>
	<p>(Hint: it's <c:out value="${randnum}"/> )</p>
	<p>Take a Guess!</p>
	<form action="guess" method="POST">
		<input type="text" name="guessnumber" />
		<input type="submit" value="submit"/>
		<input type="submit" name ="reset" value="reset"/>
	</form>
	<!-- IF you guess correctly -->
	<c:if test="${randnum == usernum}">
		<p>You guessed correctly!</p>
	</c:if>
	
	<!-- IF you don't guess correctly -->
	<c:if test="${usernum != null}">
		<c:if test="${randnum != usernum}">
			<p>Guess Again.</p>
		</c:if>
	</c:if>
	
	<!-- Display your guessed number -->
	<c:if test="${usernum != null}">
		<p>Your guess: <c:out value="${usernum}" /></p>
	</c:if>
</body>
</html>