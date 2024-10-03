<?php
// Check if the cookie 'username' is set
if (isset($_COOKIE['username'])) {
    echo "Cookie 'username' is set!<br>";
    echo "Value: " . $_COOKIE['username'];
} else {
    echo "Cookie 'username' is not set.";
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Retrieve Cookie</title>
</head>
<body>
    <h2>Retrieve a Cookie</h2>
    <p><a href="retrieve_cookie.php">Refresh page to check if the cookie is set.</a></p>
</body>
</html>
