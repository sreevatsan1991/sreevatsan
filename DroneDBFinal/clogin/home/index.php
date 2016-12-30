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
          <p class="navbar-brand">My Drone Assist</p>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="../home">Home</a></li>
            <li><a href="../about.php">About</a></li>
            <li><a href="../contact.php">Contact</a></li>
			<li><a href="../logout.php">Log Out</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container">

      <div class="starter-template">
        <h1>Dashboard</h1>
        <p class="lead">Welcome <?php echo "Mr.".$name['Name']; ?>,<br></p>
      </div>
	  <ul class="list-group">
	  <li class="list-group-item list-group-item-success"><h4>Health Risk Factor:</h4></li>
	   <h4>More the Progress of the Bars, More the Risk</h4>
<link href="css/bootstrap.min.css" rel="stylesheet">
<head>
<body>
<?php
echo 'Heart_Rate: ';
$a="select person_id from person_Data where username ='".$_SESSION['login_person']."'";
			$conn=mysqli_query($connection,$a);
			$f= mysqli_fetch_array($conn);
			$b="SELECT 
        AVG(`mydb`.`patient`.`heart_rate`) AS `avg(Heart_Rate)`
    FROM
        `mydb`.`patient`
    WHERE `mydb`.`patient`.`Person_ID`='".$f['person_id']."'";
	$c=mysqli_query($connection,$b);
	$result=mysqli_fetch_array($c);
	$p="select distinct age from patient where Person_ID= '".$f['person_id']."'";
	$q=mysqli_query($connection,$p);
	$age=mysqli_fetch_array($q);
	if (($age['age'])<30){
	if (($result['avg(Heart_Rate)'])>100){
		$percent = 100;
		$status = 'danger';
		echo $status;
	}
	else if (($result['avg(Heart_Rate)'])>90){
		$percent = 80;
		$status = 'warning';
		echo $status;
	}
	else if (($result['avg(Heart_Rate)'])>80){
		$percent = 40;
	$status = 'Slight Risk';
		echo $status;
	}
	else if ((($result['avg(Heart_Rate)'])>60) && (($result['avg(Heart_Rate)'])>60)) {
		$percent = 20;
		$status = 'Safe';
		echo $status;
	}
	}
	
	else if (($age['age'])<40){
	if (($result['avg(Heart_Rate)'])>90){
		$percent = 100;
		$status = 'danger';
		echo $status;
	}
	else if (($result['avg(Heart_Rate)'])>85){
		$percent = 80;
		$status = 'warning';
		echo $status;
		
	}
	else if (($result['avg(Heart_Rate)'])>80){
		$percent = 40;
		$status = 'Slight Risk';
		echo $status;
	}
	else if ((($result['avg(Heart_Rate)'])>60) && (($result['avg(Heart_Rate)'])<75)) {
		$percent = 20;
		$status = 'Safe';
		echo $status;
	}
	}
	
	else if (($age['age'])<50){
	if (($result['avg(Heart_Rate)'])>85){
		$percent = 100;
		$status = 'danger';
		echo $status;
	}
	else if (($result['avg(Heart_Rate)'])>80){
		$percent = 80;
		$status = 'warning';
		echo $status;
		
	}
	else if (($result['avg(Heart_Rate)'])>80){
		$percent = 40;
		$status = 'Slight Risk';
		echo $status;
	}
	else if ((($result['avg(Heart_Rate)'])>60) && (($result['avg(Heart_Rate)'])<75)) {
		$percent = 20;
		$status = 'Safe';
		echo $status;
	}
	}
	
	else if (($age['age'])<60){
	if (($result['avg(Heart_Rate)'])>85){
		$percent = 100;
		$status = 'danger';
		echo $status;
	}
	else if (($result['avg(Heart_Rate)'])>80){
		$percent = 80;
		$status = 'warning';
		echo $status;
		
	}
	else if (($result['avg(Heart_Rate)'])>80){
		$percent = 40;
		$status = 'Slight Risk';
		echo $status;
	}
	else if ((($result['avg(Heart_Rate)'])>60) && (($result['avg(Heart_Rate)'])<75)) {
		$percent = 20;
		$status = 'Safe';
		echo $status;
	}
	}
	
	else if (($age['age'])>60){
	if (($result['avg(Heart_Rate)'])>80){
		$percent = 100;
		$status = 'danger';
		echo $status;
	}
	else if (($result['avg(Heart_Rate)'])>75){
		$percent = 80;
		$status = 'warning';
		echo $status;
		
	}
	else if (($result['avg(Heart_Rate)'])>73){
		$percent = 40;
		$status = 'Slight Risk';
		echo $status;
	}
	else if ((($result['avg(Heart_Rate)'])>60) && (($result['avg(Heart_Rate)'])<72)) {
		$percent = 20;
		$status = 'Safe';
		echo $status;
	}
	}
?>
<div class="progress">
  <div class="progress-bar progress-bar-success progress-bar-striped" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width:<?php echo $percent?>%">
    <span class="sr-only">Heart Average</span>
  </div>
</div>
<?php
echo 'Systolic Pressure: ';
$bp1="select person_id from person_Data where username ='".$_SESSION['login_person']."'";
			$bp2=mysqli_query($connection,$bp1);
			$bp3= mysqli_fetch_array($bp2);
			$sp="select sys_pressure from patient where person_id='".$bp3['person_id']."'";
			$sp1=mysqli_query($connection,$sp);
			$sp2=mysqli_fetch_array($sp1);
			$p1="select distinct age from patient where Person_ID= '".$bp3['person_id']."'";
	$q1=mysqli_query($connection,$p1);
	$age1=mysqli_fetch_array($q);
	
	
	if (($age1['age'])<30){
	if (($sp2['sys_pressure'])>180){
		$percent = 100;
		$status = 'danger';
		echo $status;
	}
	else if (($sp2['sys_pressure'])>160){
		$percent = 80;
		$status = 'warning';
		echo $status;
	}
	else if (($sp2['sys_pressure'])>120){
		$percent = 40;
	$status = 'Slight Risk';
		echo $status;
	}
	else if ((($sp2['sys_pressure'])>80) && (($sp2['sys_pressure'])<100)) {
		$percent = 20;
		$status = 'Safe';
		echo $status;
	}
	}
	
	else if (($sp2['sys_pressure'])<40){
	if (($result['avg(Heart_Rate)'])>170){
		$percent = 100;
		$status = 'danger';
		echo $status;
	}
	else if (($sp2['sys_pressure'])>150){
		$percent = 80;
		$status = 'warning';
		echo $status;
		
	}
	else if (($sp2['sys_pressure'])>130){
		$percent = 40;
		$status = 'Slight Risk';
		echo $status;
	}
	else if ((($sp2['sys_pressure'])>70) && (($sp2['sys_pressure'])<100)) {
		$percent = 20;
		$status = 'Safe';
		echo $status;
	}
	}
	
	else if (($age['age'])<50){
	if (($sp2['sys_pressure'])>160){
		$percent = 100;
		$status = 'danger';
		echo $status;
	}
	else if (($sp2['sys_pressure'])>140){
		$percent = 80;
		$status = 'warning';
		echo $status;
		
	}
	else if (($sp2['sys_pressure'])>120){
		$percent = 40;
		$status = 'Slight Risk';
		echo $status;
	}
	else if ((($sp2['sys_pressure'])>80) && (($sp2['sys_pressure'])<100)) {
		$percent = 20;
		$status = 'Safe';
		echo $status;
	}
	}
	
	else if (($age1['age'])<60){
	if (($sp2['sys_pressure'])>150){
		$percent = 100;
		$status = 'danger';
		echo $status;
	}
	else if (($sp2['sys_pressure'])>140){
		$percent = 80;
		$status = 'warning';
		echo $status;
		
	}
	else if (($sp2['sys_pressure'])>120){
		$percent = 40;
		$status = 'Slight Risk';
		echo $status;
	}
	else if ((($sp2['sys_pressure'])>80) && (($sp2['sys_pressure'])<100)) {
		$percent = 20;
		$status = 'Safe';
		echo $status;
	}
	}
	
	else if (($age['age'])>60){
	if (($sp2['sys_pressure'])>140){
		$percent = 100;
		$status = 'danger';
		echo $status;
	}
	else if (($sp2['sys_pressure'])>130){
		$percent = 80;
		$status = 'warning';
		echo $status;
		
	}
	else if (($sp2['sys_pressure'])>120){
		$percent = 40;
		$status = 'Slight Risk';
		echo $status;
	}
	else if ((($sp2['sys_pressure'])>80) && (($sp2['sys_pressure'])<100)) {
		$percent = 20;
		$status = 'Safe';
		echo $status;
	}
	}
	?>

<div class="progress">
  <div class="progress-bar progress-bar-info progress-bar-striped" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width:<?php echo $percent ?>%">
    <span class="sr-only">Systolic Pressure</span>
  </div>
</div>
<?php
echo 'Diastolic Pressure: ';
$dp1="select person_id from person_Data where username ='".$_SESSION['login_person']."'";
			$dp2=mysqli_query($connection,$dp1);
			$dp3= mysqli_fetch_array($dp2);
			$dp="select distinct dias_pressure from patient where person_id='".$dp3['person_id']."'";
			$d1=mysqli_query($connection,$dp);
			$d2=mysqli_fetch_array($d1);
		if (($d2['dias_pressure'])>90){
		$percent = 100;
		$status = 'danger';
		echo $status;
	}
	else if (($d2['dias_pressure'])>85){
		$percent = 80;
		$status = 'warning';
		echo $status;
	}
	else if (($d2['dias_pressure'])>80){
		$percent = 40;
	$status = 'Slight Risk';
		echo $status;
	}
	else if ((($d2['dias_pressure'])>60) && (($d2['dias_pressure'])<79)) {
		$percent = 20;
		$status = 'Safe';
		echo $status;
	}
?>

<div class="progress">
  <div class="progress-bar progress-bar-warning progress-bar-striped" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: <?php echo $percent ?>%">
    <span class="sr-only">Diastolic pressure</span>
  </div>
</div>

	  </ul>
       <div class="list-group">
		<li class="list-group-item list-group-item-success"><h4>Heart Rate:</h4></li>                
		 <div class = "row">
           <div class="col-lg-8">
			<img src="../img/giphy.gif">
			</div>
			
			<form class="form-signin"method="post">
			<div class="col-lg-8">
			<button class="btn btn-primary" type="submit" name="calculate">Click Here to Check Average Heart Rate</button>
			</div>
			</form>
			</div>
			</div>
			<?php
			if(isset($_POST['calculate'])){
			$a="select person_id from person_Data where username ='".$_SESSION['login_person']."'";
			$conn=mysqli_query($connection,$a);
			$f= mysqli_fetch_array($conn);
			$b="SELECT 
        AVG(`mydb`.`patient`.`heart_rate`) AS `avg(Heart_Rate)`
    FROM
        `mydb`.`patient`
    WHERE `mydb`.`patient`.`Person_ID`='".$f['person_id']."'";
	$c=mysqli_query($connection,$b);
	$result=mysqli_fetch_array($c);
	echo  "<h2 style="."color:red;".">"."<strong>".$result['avg(Heart_Rate)']."</h2>";
			}
			?>
		
		<div class="list-group">
		<li class="list-group-item list-group-item-success"><h4>My Location Details</h4></li>
		<?php
		$p= "select person_id from person_Data where username ='".$_SESSION['login_person']."'";
		$conn=mysqli_query($connection,$p);
			$f= mysqli_fetch_array($conn);
		$query = "SELECT Name,address FROM mydb.patient_current_location where Person_ID='".$f['person_id']."'";
		$y =mysqli_query($connection,$query);
		echo "<table border=".'"'."1".'"'.">";
						echo "<tr>";
                                echo "<th>Name</th>";
								echo "<th>Location</th>";
                             echo   "</tr>";
while($row = mysqli_fetch_array($y))
 { 
echo "<tr>";
echo "<td>".$row['Name']."<br>"."</td><td>".$row['address']."</td>";
 }
 echo"</tr>";
 echo"</table>";
 ?>
		<div class="list-group">
		<li class="list-group-item list-group-item-success"><h4>Emergency Contact:</h4></li>
		<?php
			$sql="select person_id from person_Data where username ='".$_SESSION['login_person']."'";
			$q=mysqli_query($connection,$sql);
			$res= mysqli_fetch_array($q);
		$a = "SELECT DISTINCT emergency_contact from patient where Person_ID ='".$res['person_id']."'";
		$conn = mysqli_query($connection,$a);
		$result = mysqli_fetch_array($conn);
		echo "<strong>".$result['emergency_contact'];
		?>
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
