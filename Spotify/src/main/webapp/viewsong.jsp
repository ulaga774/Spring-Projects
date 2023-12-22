<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Song Information</title>
</head>
<body>

    <h1>All Song</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Song Name</th>
                <th>Artist Name</th>
                <th>Type</th>
                <th>Duration</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="dto" items="${all}">
                <tr>
                    <td>${dto.songName}</td>
                    <td>${dto.articesName}</td>
                    <td>${dto.type}</td>
                    <td>${dto.duration}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
