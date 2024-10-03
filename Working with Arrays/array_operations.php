<?php
// Function to display an array
function display_array($arr, $title) {
    echo "<h3>" . $title . "</h3>";
    echo implode(", ", $arr) . "<br>";
}

// Check if form is submitted
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Retrieve the input and convert it into an array
    $input = $_POST['array'];
    $array = explode(',', str_replace(' ', '', $input)); // Removing spaces and splitting by commas

    // Display original array
    display_array($array, "Original Array");

    // Sort the array
    $sorted_array = $array;
    sort($sorted_array);
    display_array($sorted_array, "Sorted Array");

    // Reverse the array
    $reversed_array = array_reverse($array);
    display_array($reversed_array, "Reversed Array");

    // Add a new element to the array
    $array[] = "NewElement";
    display_array($array, "Array After Adding a New Element");

    // Display array length
    echo "<h3>Array Length</h3>";
    echo count($array);
}
?>
