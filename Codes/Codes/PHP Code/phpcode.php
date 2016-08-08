<?php
$servername = "mysql6.000webhost.com";
$username = "a4911644_tashfik";
$password = "omygod12";
$dbname = "a4911644_demo";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}



$Name=$_POST['Name'];
$Email = $_POST['Email'];
$Number = $_POST['Number'];


$sql = "INSERT INTO demotable (Name,Email,Number)
VALUES ('{$Name}','{$Email}','{$Number}')";

if ($conn->query($sql) === TRUE) {
    echo "New record created successfully";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?> 