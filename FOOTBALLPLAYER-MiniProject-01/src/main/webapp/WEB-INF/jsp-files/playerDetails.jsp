<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Player Details</title>
    <style>
        body {
            background-image: url('images/ronaldo-2.jpg'); /* Replace with your actual image path */
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            color: white;
        }

        .container {
            background-color: rgba(0, 0, 0, 0.85);
            max-width: 500px;
            margin: 100px auto;
            padding: 40px 30px;
            border-radius: 20px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.7);
        }

        h2 {
            text-align: center;
            font-size: 30px;
            margin-bottom: 30px;
            color: #1abc9c;
            border-bottom: 2px solid #1abc9c;
            padding-bottom: 10px;
        }

        p {
            font-size: 18px;
            margin: 15px 0;
        }

        ul {
            margin-top: 10px;
            padding-left: 20px;
        }

        li {
            font-size: 16px;
        }

        a {
            display: block;
            text-align: center;
            margin-top: 30px;
            padding: 12px 20px;
            background-color: #1abc9c;
            color: white;
            text-decoration: none;
            border-radius: 8px;
            font-weight: bold;
            transition: background-color 0.3s ease;
        }

        a:hover {
            background-color: #16a085;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Player Details</h2>
        <p><strong>ID:</strong> ${player.playerId}</p>
        <p><strong>Name:</strong> ${player.playerName}</p>
        <p><strong>Jersey Number:</strong> ${player.jerseyNumber}</p>
        <p><strong>Country:</strong> ${player.country}</p>
        <p><strong>Goals:</strong> ${player.goals}</p>
        <p><strong>Assists:</strong> ${player.assists}</p>
        <p><strong>Clubs:</strong>
            <ul>
                <c:forEach var="club" items="${player.clubs}">
                    <li>${club}</li>
                </c:forEach>
            </ul>
        </p>
        <a href="search">← Back to Search</a>
    </div>
</body>
</html>
