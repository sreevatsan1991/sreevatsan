<?php
session_start();
include("../includes/config.php");
if(!isset($_SESSION['upusername']))
{
$sql="select Name from person_Data WHERE Username= '".$_SESSION['login_person']."'";
$conn=mysqli_query($connection,$sql);
$name=mysqli_fetch_array($conn);
}
?>
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
    <link href="../css/bootstrap.min.css" rel="stylesheet">

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
          <p class="navbar-brand">Drone Management</p>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="../admin">AdminHome</a></li>
            <li><a href="../admin/about.php">About</a></li>
            <li><a href="../admin/contact.php">Contact</a></li>
			<li><a href="../logout.php">Log Out</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container">
<link rel="stylesheet" type="text/css" href="mystyle.css">
      <div class="starter-template">
        <h1>Dashboard</h1--
        <p class="lead">Welcome Admin</p
		
      </div>
	  <img src="../img/drone.jpg" style="width: auto; height: auto;max-width: 120px;max-height: 100px">
	<div class="row">
    <div class="col-lg-6">
	<ul class="list-group">
  <li class="list-group-item list-group-item-success">No. Of People Saved</li>
  <?php
  $a = "SELECT * FROM mydb.people_saved;";
$b=mysqli_query($connection,$a);
$result=mysqli_fetch_array($b);
echo $result['drone_count'];
	?>
  <li class="list-group-item list-group-item-info">Drones in Action</li>
  <!<li class="list-group-item list-group-item-warning"Drones in Action</li>
  <?php 
  $p="SELECT * FROM mydb.drone_in_action group by Drone_ID, x,y,start_time;";
 $q=mysqli_query($connection,$p);
 //$row=mysqli_fetch_array($q);
 echo "<table border=".'"'."1".'"'.">";
						echo "<tr>";
						echo "<th>Drone_Id</th>";
						echo "<th>X_Co-ordinate</th>";
						echo "<th>Y_Co-ordinate</th>";
						echo "<th>Start_time From Each Node</th>";
						echo "</tr>";
while($row = mysqli_fetch_array($q))
 { 
echo "<tr>";
echo "<td>"."<br>".$row['Drone_ID']."</td><td>".$row['x']."</td><td>".$row['y']."</td><td>".$row['start_time']."</td>";
 }
 echo"</tr>";
 echo"</table>";
 ?>
</ul>
</div>
    <div class="col-lg-6">
<div class="list-group">
  <a href="#" class="list-group-item list-group-item-success">Drones in Maintenance</a>
    <?php 
  $p="SELECT * FROM mydb.drones_maintenance;";
 $q=mysqli_query($connection,$p);
 //$row=mysqli_fetch_array($q);
 echo "<table border=".'"'."1".'"'.">";
						echo "<tr>";
						echo "<th>Drone_Id</th>";
						echo "</tr>";
while($row = mysqli_fetch_array($q))
 { 
echo "<tr>";
echo "<td>"."<br>".$row['drone_id']."<br>"."</td>";
 }
 echo"</tr>";
 echo"</table>";
 ?>
  <!<a href="#" class="list-group-item list-group-item-info"><!Drone Ride History</a>
  <a href="#" class="list-group-item list-group-item-warning">Deployment Centre</a>
   <?php 
  $x="SELECT Deployment_CentreID,deployed_Drones FROM mydb.deployment_centre 
where Deployment_CentreID in(1,2,3,4);";
  $y=mysqli_query($connection,$x);
  //$result=mysqli_fetch_array($y);
  //echo $result['drones_deployed'];
   echo "<table border=".'"'."1".'"'.">";
						echo "<tr>";
                               echo "<th>Deployment_CentreID</th>";
                                echo "<th>Drones_Deployed</th>";
                             echo   "</tr>";
while($row = mysqli_fetch_array($y))
 { 
echo "<tr>";
echo "<td>"."<br>".$row['Deployment_CentreID']."</td><td>".$row['deployed_Drones']."<br>"."</td><td>";
 }
 echo"</tr>";
 echo"</table>";
  ?> 
  
</div>
	</div>
	</div>
	

    </div><!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="../js/bootstrap.min.js"></script>
  </body>
</html>
