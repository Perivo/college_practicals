<?php
// Start the session
session_start();

// Store session data when form is submitted
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $_SESSION['username'] = $_POST['username'];
    echo "Session 'username' is set!<br>";
    echo "Value: " . $_SESSION['username'];
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Store Session</title>
</head>
<body>
    <h2>Set Session Data</h2>
    <form action="store_session.php" method="POST">
        <label for="username">Enter your name:</label><br>
        <input type="text" id="username" name="username" required><br><br>
        <input type="submit" value="Set Session">
    </form>
</body>
</html>
