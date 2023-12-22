<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="find " method="get">
		<input type="text" placeholder="search ">
		<button type="submit">click</button>
	</form>
	<p>${dto.songName}</p>
	<p>${dto.articesName}</p>
	<p>${dto.type}</p>
	<p>${dto.duration}</p>

</body>
</html>