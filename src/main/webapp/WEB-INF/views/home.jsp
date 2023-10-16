<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Management</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>User Management</h1>

        <div class="form-container">
            <form action="addUser" method="post">
                <div class="form-group">
                    <label for="firstName">First Name:</label>
                    <input type="text" id="firstName" name="firstName" required>
                </div>

                <div class="form-group">
                    <label for="lastName">Last Name:</label>
                    <input type="text" id="lastName" name="lastName" required>
                </div>

                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="email" id="email" name="email" required>
                </div>

                <button type="submit" class="btn">Add</button>
            </form>

            <form action="showAllUsers" method="post">
                <button type="submit" class="btn">Show All Users</button>
            </form>
        </div>

        <h2>Added Users:</h2>
        <ul class="user-list">
            <!-- Здесь будут отображаться добавленные пользователи -->
        </ul>
    </div>
</body>
</html>


