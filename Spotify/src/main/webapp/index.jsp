<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="styles.css">
<style type="text/css">
body {
	margin: 0;
	padding: 0;
	font-family: Arial, sans-serif;
}

/* Style the navigation bar */
.navbar {
	background-color: #333; /* Background color for the navbar */
	color: #fff; /* Text color for links */
	display: flex;
	justify-content: space-between;
	align-items: center;
	padding: 10px 20px;
}

/* Style the logo */
.logo img {
	max-height: 40px; /* Adjust the height as needed */
}

/* Style the navigation links */
.nav-links ul {
	list-style: none;
	margin: 0;
	padding: 0;
}

.nav-links li {
	display: inline;
	margin-left: 20px; /* Adjust the spacing between links */
}

.nav-links a {
	text-decoration: none;
	color: #fff;
	font-weight: bold;
}

.nav-links a:hover {
	text-decoration: underline; /* Add underline on hover */
}
</style>
</head>
<body>

	<div class="navbar">
		<div class="logo">
			<img src="logo.png" alt="Logo">
		</div>
		<div class="nav-links">
			<ul>

				<li><a href="addsong.jsp">Add Song</a></li>

				<li>
					<form action="read" method="get">
						<button type="submit">Read all</button>
					</form>
				</li>
			</ul>


		</div>
	</div>
</body>
</html>

