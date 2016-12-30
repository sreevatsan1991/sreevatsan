<?php
$connection = mysqli_connect("localhost","root","root","mydb");
if (!$connection) {
die ("Cannot connect to Database".mysqli_connect_error());
}
$db_select = mysqli_select_db($connection, "mydb") or die("oops something went wrong");
 if (!$db_select) {
        die("Database selection failed: " . mysqli_connect_error());
    }
?>