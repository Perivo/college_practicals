<?php
$servername = "localhost:3305";  // Change if your database server is not local
$username = "root";         // Replace with your MySQL username
$password = "";             // Replace with your MySQL password
$dbname = "my_database";    // The database name

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// SQL query to select all records from the users table
$sql = "SELECT id, name, email, reg_date FROM users";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    // Display records in a table
    echo "<h2>User Records</h2>";
    echo "<table border='1'>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Registration Date</th>
            </tr>";

    // Output each row of the result
    while($row = $result->fetch_assoc()) {
        echo "<tr>
                <td>" . $row["id"] . "</td>
                <td>" . $row["name"] . "</td>
                <td>" . $row["email"] . "</td>
                <td>" . $row["reg_date"] . "</td>
              </tr>";
    }
    echo "</table>";
} else {
    echo "No records found.";
}

$conn->close();
?>
