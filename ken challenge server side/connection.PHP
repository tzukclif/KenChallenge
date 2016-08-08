<?php

$db_name = "2119303_androapp";
$mysql_username = "2119303_androapp";
$mysql_password = "FriedChips3.14";
$server_name = "fdb7.freehostingeu.com";
$conn = mysqli_connect($server_name, $mysql_username, $mysql_password, $db_name);
if($conn) {
echo "connection success";
}
else{
echo "connection NOT success";
}

?>