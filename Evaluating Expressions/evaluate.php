<?php
// Function to safely evaluate the mathematical expression
function evaluate_expression($expression) {
    // Replace anything other than numbers and operators with an empty string to avoid code injection
    $clean_expression = preg_replace('/[^0-9\+\-\*\/\(\)\.\s]/', '', $expression);
    
    // Use eval to calculate the result
    try {
        eval('$result = ' . $clean_expression . ';');
        return $result;
    } catch (ParseError $e) {
        return "Invalid expression!";
    }
}

// Check if form is submitted via POST method
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Retrieve the mathematical expression from the form
    $expression = $_POST['expression'];

    // Evaluate the expression
    $result = evaluate_expression($expression);

    // Display the result
    echo "Expression: " . htmlspecialchars($expression) . "<br>";
    echo "Result: " . $result;
}
?>
