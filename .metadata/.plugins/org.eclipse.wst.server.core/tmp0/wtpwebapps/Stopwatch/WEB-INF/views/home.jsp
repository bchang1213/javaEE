<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Stopwatch</title>
</head>
<body>
	<form action="timer" method="POST">
		<input type="submit" name='start' value="start">
		<input type="submit" name='stop' value="stop">
		<input type="submit" name='reset' value="reset">
	</form>
	
	<div class="times">
		<p>Start: <c:out value="${newTimer.getStart()}" /></p>
		<p>Current Time: <c:out value="${currentTime}" /></p>
		<p>
			Running Time:
			<c:if test="${newTimer.getStop() != null}">
				<c:out value="${newTimer.getTotal()}" />
			</c:if>
		</p>
	</div>
	
	<table>
		<tr>
			<th>Start</th>
			<th>Stop</th>	
			<th>Total</th>
		</tr>
		
<c:forEach items="${tabledata}" var="current">
		<tr>
			<td><c:out value="${current.start}" /><td>
			<td><c:out value="${current.stop}" /><td>
			<td><c:out value="${current.total}" /><td>
		</tr>
</c:forEach>
		
	</table>
	
</body>
</html>