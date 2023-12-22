<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="styles.css">
<title>Song Card</title>
<style type="text/css">
body {
	font-family: monospace; margin : 0;
	box-shadow: 0;
	margin: 0;
}

.song-card {

margin:1rem 10rem;
padding:4rem 5rem;
background-color: black;
color: white;
	
}
.song-image{
height: 100px;
width: 100px;
}
</style>
</head>
<body>
	<div class="song-card">
		<div class="song-image">
			<img src="C:\Users\Dell\Desktop\css leaning\car\responsive-car-website\assets\about\ulaga\ulaga.jpg" alt="Album Cover">
		</div>
		<div class="song-details">
			<h2>${save.songName}</h2>
			<h2>${save.articesName}</h2>
			
		</div>
	</div>
</body>
</html>
