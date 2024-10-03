PHP Sessions, Cookies, and Database Operations
Overview
This project demonstrates simple PHP scripts for:

Storing and retrieving session data.
Storing and retrieving cookie data.
Basic file handling in PHP.
Working with MySQL databases (storing and retrieving records).
The project is intended to be run locally using XAMPP, which provides a local development environment for PHP and MySQL.

Features
Session Management: Set, retrieve, and destroy session data using PHP.
Cookie Management: Set and retrieve cookies using PHP.
Database Operations: Store and retrieve user data in a MySQL database using PHP and MySQLi.
File Handling: Simple scripts for reading and writing to text files using PHP.
Requirements
To run this project locally, you need the following software:

XAMPP (includes Apache, MySQL, PHP)
Download XAMPP
A web browser (Chrome, Firefox, etc.)
Project Setup
Step 1: Install XAMPP
Download and install XAMPP for your operating system from here.
During installation, select Apache and MySQL components.
After installation, open the XAMPP Control Panel and start the Apache and MySQL services.
Step 2: Clone the Repository
Clone the repository into your XAMPP htdocs directory.


git clone https://github.com/Perivo/college-practicals.git
On Windows, the typical location for htdocs is:


C:\xampp\htdocs\
For macOS/Linux:


/Applications/XAMPP/htdocs/
After cloning, your project folder should be located at:


C:\xampp\htdocs\php-sessions-cookies-database\
Step 3: Create the Database (Optional)
To use the database-related scripts, follow these steps:

Open your browser and go to http://localhost/phpmyadmin/.

Create a new database named my_database.

Run the following SQL query in phpMyAdmin to create the users table:


CREATE DATABASE my_database;

USE my_database;

CREATE TABLE users (
    id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    reg_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
Step 4: Configure PHP Sessions and Cookies (Optional)
Open the XAMPP Control Panel.

Click on Config next to Apache and select php.ini.

Make sure the following line is configured correctly for session storage:


session.save_path = "C:\xampp\tmp"
Save and close the file, then restart Apache in the XAMPP Control Panel.

Running the Project
Running the Session and Cookie Scripts
Open your browser and go to:

For setting session: http://localhost/php-sessions-cookies-database/store_session.php
For retrieving session: http://localhost/php-sessions-cookies-database/retrieve_session.php
For destroying session: http://localhost/php-sessions-cookies-database/destroy_session.php
For cookies:

For setting cookies: http://localhost/php-sessions-cookies-database/store_cookie.php
For retrieving cookies: http://localhost/php-sessions-cookies-database/retrieve_cookie.php
Running the Database Scripts
Store a record: Open the form and submit user data at: http://localhost/php-sessions-cookies-database/store_record.php

Retrieve records: View the stored records at: http://localhost/php-sessions-cookies-database/retrieve_records.php

File Handling Scripts
Writing to a file: Use the form to write content to a file: http://localhost/php-sessions-cookies-database/file_operations.php

Reading from a file: View the contents of the file: http://localhost/php-sessions-cookies-database/file_operations.php (submit form with GET request).

Project Structure

php-sessions-cookies-database/
│
├── store_session.php         # Script to store session data
├── retrieve_session.php      # Script to retrieve session data
├── destroy_session.php       # Script to destroy session data
│
├── store_cookie.php          # Script to store cookie data
├── retrieve_cookie.php       # Script to retrieve cookie data
│
├── store_record.php          # Script to store data into MySQL database
├── retrieve_records.php      # Script to retrieve data from MySQL database
│
├── file_operations.php       # Script for reading and writing files
│
└── README.md                 # This README file
Troubleshooting
XAMPP Control Panel Issues:

Ensure Apache and MySQL are running.
If ports are blocked, change the port number for Apache in the XAMPP Control Panel (Config -> Service and Port Settings -> Apache).
Database Connection Errors:

Make sure that your database credentials in the scripts are correct. Modify store_record.php as needed:


$servername = "localhost";
$username = "root";
$password = "";          // Default password is empty for XAMPP
$dbname = "my_database"; // Your database name
PHP Errors:

If you are getting PHP errors, make sure error reporting is enabled in php.ini:


error_reporting = E_ALL;
display_errors = On;
Restart Apache after modifying php.ini.

License
This project is licensed under the MIT License - see the LICENSE file for details.

This README file provides comprehensive setup instructions, how to run the project, and troubleshooting tips for your PHP project using XAMPP.
