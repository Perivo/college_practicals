<?php
// Function to generate Fibonacci series
function fibonacci($n) {
    $fib_series = [];
    $a = 0;
    $b = 1;

    for ($i = 0; $i < $n; $i++) {
        $fib_series[] = $a;
        $next = $a + $b;
        $a = $b;
        $b = $next;
    }

    return $fib_series;
}

// Check if form is submitted via POST method
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Retrieve the number of terms from the form
    $terms = intval($_POST['terms']); // Convert input to integer

    // Calculate Fibonacci series
    $fibonacci_series = fibonacci($terms);

    // Display the Fibonacci series
    echo "Fibonacci series with " . $terms . " terms:<br>";
    echo implode(", ", $fibonacci_series); // Output the series as a comma-separated string
}
?>
