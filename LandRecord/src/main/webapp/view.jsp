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
	background-color: #000; /* Black background color */
	color: #fff; /* White text color */
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
				<h4>
					Hi ,Wellcome to LandRecords
					</h4>
			</div>

			<a href="index.jsp">Logout</a>
		</div>
	</header>
	<form action="otp" method="post">
		<div class="form-group">
			<label>Name:</label> 
			
			<input type="text" class="form-control"
				id="adminName" name="adminName" value="${adminName}">
			<label>Email:</label> 
			<input type="text" class="form-control"
				id="email" name="email" value="${Email}">
			
		</div>

		<div class="form-group">
			<label for="otp">OTP:</label> <input type="text" class="form-control"
				id="otp" name="otp" value="${otp}">
		</div>
		<button type="submit" class="btn btn-success" id="submitData"
			 value="submit">Login</button>
	</form>
	<footer id="footerButton">
		<p>
			&copy; 2023 <a href="mailto:ulaga774xworkz@gmail.com">ulaga774xworkz@gmail.com</a>
		</p>
	</footer>

</body>
</html>