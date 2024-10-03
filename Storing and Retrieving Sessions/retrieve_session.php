<?php
// Start the session
session_start();

// Check if the session variable is set
if (isset($_SESSION['username'])) {
    echo "Session 'username' is set!<br>";
    echo "Value: " . $_SESSION['username'];
} else {
    echo "No session data is set.";
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Retrieve Session</title>
</head>
<body>
    <h2>Retrieve Session Data</h2>
    <p><a href="retrieve_session.php">Refresh page to check if session data is set.</a></p>
</body>
</html>
