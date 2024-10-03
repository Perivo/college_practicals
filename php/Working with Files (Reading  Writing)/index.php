<!DOCTYPE html>
<html>
<head>
    <title>File Handling in PHP</title>
</head>
<body>
    <h2>Write to File</h2>
    <form action="file_operations.php" method="POST">
        <label for="content">Enter content to write to file:</label><br>
        <textarea id="content" name="content" rows="4" cols="50" required></textarea><br><br>
        <input type="submit" value="Write to File">
    </form>

    <h2>Read from File</h2>
    <form action="file_operations.php" method="GET">
        <input type="submit" value="Read from File">
    </form>
</body>
</html>
