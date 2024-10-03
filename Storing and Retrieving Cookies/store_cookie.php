<?php
// Set a cookie with the name 'username' and value from the form for 1 hour
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $username = $_POST['username'];
    setcookie("username", $username, time() + 3600, "/"); // 3600 = 1 hour
    echo "Cookie 'username' is set!<br>";
    echo "Value: " . $username;
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Set Cookie</title>
</head>
<body>
    <h2>Set a Cookie</h2>
    <form action="store_cookie.php" method="POST">
        <label for="username">Enter your name:</label><br>
        <input type="text" id="username" name="username" required><br><br>
        <input type="submit" value="Set Cookie">
    </form>
</body>
</html>
