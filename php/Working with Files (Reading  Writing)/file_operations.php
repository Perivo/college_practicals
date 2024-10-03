<?php
$filename = "example.txt";

// Writing to the file
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $content = $_POST['content'];
    
    // Open the file for writing ('w' mode will overwrite the file)
    $file = fopen($filename, "w") or die("Unable to open file!");

    // Write the content to the file
    fwrite($file, $content);
    fclose($file);

    echo "Content written to file successfully.<br>";
}

// Reading from the file
if ($_SERVER["REQUEST_METHOD"] == "GET") {
    // Check if the file exists before trying to read it
    if (file_exists($filename)) {
        // Open the file for reading
        $file = fopen($filename, "r") or die("Unable to open file!");

        // Read the file contents
        $content = fread($file, filesize($filename));
        fclose($file);

        // Display the file content
        echo "<h3>File Content:</h3>";
        echo nl2br($content); // nl2br() converts newlines to <br> tags
    } else {
        echo "File does not exist.";
    }
}
?>
