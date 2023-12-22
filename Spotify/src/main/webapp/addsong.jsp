<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="add" method="post">

		<input type="text" name="songName" placeholder="Song Name">
		<h2>${SongName}</h2>
		
		<input type="text" name="articesName" placeholder="Artices Name" >
		<h2>${ArticesName}</h2>
		<input type="text" name="type" placeholder="Type">
		<h2>${type}</h2>
		<input type="number" name="duration" placeholder="Duration">
		<h2>${duration}</h2>
		
		<button type="submit">Submit</button>

	</form>

</body>
</html>