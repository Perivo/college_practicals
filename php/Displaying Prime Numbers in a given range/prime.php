<?php
// Function to check if a number is prime
function is_prime($num) {
    if ($num < 2) {
        return false;
    }
    for ($i = 2; $i <= sqrt($num); $i++) {
        if ($num % $i == 0) {
            return false;
        }
    }
    return true;
}

// Function to get all prime numbers in a range
function get_prime_numbers($start, $end) {
    $prime_numbers = [];
    for ($i = $start; $i <= $end; $i++) {
        if (is_prime($i)) {
            $prime_numbers[] = $i;
        }
    }
    return $prime_numbers;
}

// Check if form is submitted via POST method
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Retrieve start and end of the range from the form
    $start = intval($_POST['start']);
    $end = intval($_POST['end']);

    if ($start > $end) {
        echo "Invalid range. Start should be less than or equal to End.";
    } else {
        // Get prime numbers within the range
        $prime_numbers = get_prime_numbers($start, $end);

        // Display the prime numbers
        if (empty($prime_numbers)) {
            echo "No prime numbers found in the range " . $start . " to " . $end;
        } else {
            echo "Prime numbers in the range " . $start . " to " . $end . ":<br>";
            echo implode(", ", $prime_numbers);
        }
    }
}
?>
