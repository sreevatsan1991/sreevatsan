<?php
session_start();
include("includes/config.php");

if($_SERVER["REQUEST_METHOD"] == "POST" && (isset($_POST['signup'])))
{
	header("location:http://localhost:8080/clogin/RegistrationForm/");
}

if($_SERVER["REQUEST_METHOD"] == "POST" && (isset($_POST['signin'])))
{
	//USERNAME AND PASSWORD SENT FROM FORM
$myusername= addslashes($_POST['username']);
$mypassword=addslashes($_POST['password']);
$qc="select password from person_data where Email_ID='".$myusername."'";
$out=mysqli_query($connection,$qc);
$ext=mysqli_fetch_array($out);
echo $ext['password'];
if(password_verify("'".$_POST['password']."'",$ext['password']))
	echo '1';
{
$sql="select Role from person_Data WHERE Username= '".$myusername."'";
$role= mysqli_query($connection,"select Role from person_Data WHERE Username= '".$myusername."'");
$res=mysqli_fetch_array($role);
echo $res['Role'];
//echo $role;
if($res['Role'] == "admin"){
if($sql= "select Person_ID from person_Data WHERE Username= '".$myusername."'")
{
$result=mysqli_query($connection,$sql);
$count=mysqli_num_rows($result);
	//IF THE RESULTS MATCHED WITH USERNAME AND PASSWORD THEN RESULT WILL BE 1 ROW

IF($count==1){
$_SESSION['login_person']= $myusername;
header("location:http://localhost:8080/clogin/admin/");
}
}
}
else if($res['Role']== "patient")
{
if($sql= "select Person_ID from person_Data WHERE Username= '".$myusername."'")
{
$result=mysqli_query($connection,$sql);
$count=mysqli_num_rows($result);
	//IF THE RESULTS MATCHED WITH USERNAME AND PASSWORD THEN RESULT WILL BE 1 ROW

IF($count==1){
$_SESSION['login_person']= $myusername;
header("location:http://localhost:8080/clogin/home/");
}	
}
}
}
}
?>

<!DOCTYPE html>
<html lang="en">
  <head>
  <style type="text/css">
   body { background: gray !important; } 
</style>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Login</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>
	
    <div class="container">
	<h1 style="color:navy;"> <p class = "text-center" ><strong>Emergency Ambulance Drone System</p></h1>
   <div class = "row">
   <div class="col-lg-8">
   <img src= "img/heart.gif">
   </div>
   <div class ="col-lg-4">
      <form class="form-signin"method="post">
        <h2 class="form-signin-heading" style="color:blue;">Login</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input name="username"type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">password</label>
        <input name="password"type="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <div class="checkbox">
          <label style="color:yellow;">
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit" name="signin">Sign in</button>
		</form>
		<form class="form-signin"method="post">
		<div class ="text-center">
		<p class="text-center" style="color:yellow;">Don't Have an Account Click Sign Up</p>
		<button class="btn btn-lg btn-primary btn-block" name="signup" type="submit">Sign up </button>
		</div>
      </form
	  </div>
	  </div>
	  </div>
  </body>
</html>