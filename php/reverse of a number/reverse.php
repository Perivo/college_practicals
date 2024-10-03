<?php
// Function to reverse a number
function reverse_number($num) {
    return strrev((string)$num);
}

// Check if form is submitted
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $number = $_POST['number'];
    $reversed = reverse_number($number);
    
    echo "Original Number: " . $number . "<br>";
    echo "Reversed Number: " . $reversed;
}
?>
