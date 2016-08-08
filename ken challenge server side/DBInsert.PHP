<?php>

require "conn.php";

$user_token ="$_POST['token']";

$sql = mysqli_query("INSERT INTO clients_players (tclient_token) VALUES ('{$user_token}')";

if($sql){
echo "GOOD JOB GO SLEEP";
}



?>