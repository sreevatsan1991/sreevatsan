<?php
session_start();
include("includes/config.php");
if(!isset($_SESSION['upusername']))
{
$sql="select Name from person_Data WHERE Username= '".$_SESSION['login_person']."'";
$conn=mysqli_query($connection,$sql);
$name=mysqli_fetch_array($conn);
}
?>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="">

    <title>Dashboard</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <p class="navbar-brand">My Drone Assist</p>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="../clogin/home">Home</a></li>
            <li><a href="../clogin/about.php">About</a></li>
            <li><a href="../clogin/contact.php">Contact</a></li>
			<li><a href="../clogin/logout.php">Log Out</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
	<div class="container">
	    <div class="container">

      <div class="starter-template">
        <h1>Dashboard</h1>
        <p class="lead">My Drone Assist</p>
      </div>
	  <td id="page">
                        <h2><p "color:red;"><strong>About the Project:<br></p></h2>
	  <table border="1" width="100%" height="300">
						<tr><td width="100%" height="200"><style>p.sansserif {
    font-family: Arial, Helvetica, sans-serif;
}</style><h4><p class="sans-serif" "color:green;"><i>The project focuses on providing a temporary relief to people who get a sudden cardiac arrest where the medical team may take some time to reach and at times the patient faints. 
All the people who are enrolled with this technology will be having a wrist wearable smart device(fitbit) that gives a real time update of their heart rates.
With that their basic medical data will be recorded and stored in the system at the base station. 
As soon as there is a fluctuation in their real time heart rate, the base station will go through a number of checks to know whether there is some medical emergency or not and as soon as it confirms a drone will be sent to the patients location.
The drone calculating the shortest path and time will reach the patient and give him temporary relief preventing him to faint till the medical team arrives.
</p></h4>
						<style>.floatTL{
	position:absolute;
    top:70px;
    left:50px;
}</style>