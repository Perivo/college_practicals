<?php
// Function to calculate factorial
function factorial($n) {
    if ($n == 0 || $n == 1) {
        return 1; // Base case: factorial of 0 or 1 is 1
    } else {
        return $n * factorial($n - 1); // Recursive case
    }
}

// Check if the form is submitted via POST method
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Retrieve the number from the form
    $number = intval($_POST['number']); // Convert input to integer

    // Calculate factorial
    $result = factorial($number);

    // Display the result
    echo "Factorial of " . $number . " is: " . $result;
}
?>
