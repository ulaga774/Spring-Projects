<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Your Page Title</title>
<!-- Include Bootstrap CSS -->
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<title>Insert title here</title>
<style>
body {
	margin: 0;
	padding: 0;
	display: flex;
	flex-direction: column;
	min-height: 100vh;
	/* Ensure the page takes at least the full viewport height */
}

header {
	background-color: black;
	color: green;
	text-align: center;
	padding: 10px;
}

header a {
	color: white;
	text-decoration: none;
}

.topic {
	color: white;
}

.content {
	flex-grow: 2;
	text-align: center;
	padding-top: 11rem;
}

footer {
	background-color: black;
	color: white;
	text-align: center;
	padding: 10px;
}

#footerButton {
	background-color: #000;
	color: #fff;
	padding: 10px 20px;
	text-align: center;
	cursor: pointer;
}

#footerButton a {
	color: #fff;
	text-decoration: none;
}
</style>
</head>
<body>
	<header>
		<div class="d-flex justify-content-between">
			<div class="topic">
   			 <h2>Welcome, ${AdminName}</h2>
    	</div>

			<a href="index.jsp">Logout</a>
		</div>
	</header>
	<div class="content">
		<form action="records" method="post">
			<button type="submit" class="btn btn-success" id="AddRecord" name="action" value="addrecords">AddRecords</button>
			<button type="submit" class="btn btn-success" id="AddRecord" name="action" value="viewrecords">ViewRecords</button>
		</form>
	</div>
	<footer id="footerButton">
		<p>
			&copy; 2023 <a href="mailto:ulaga774xworkz@gmail.com">ulaga774xworkz@gmail.com</a>
		</p>
	</footer>

</body>
</html>