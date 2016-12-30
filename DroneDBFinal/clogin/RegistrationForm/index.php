<!DOCTYPE html>
<?php
    $f=0;
    $da=0;
    if(isset($_POST['submit']))
       {
		   echo '1';
            $cxn=mysqli_connect("localhost","root","root","mydb") or die("Cannot connect to database");
            $qc="select * from person_data where Email_ID='".$_POST['InputEmail']."'";
            
			
			$res=mysqli_query($cxn,$qc);
            if(!$res)
            {
                die("Error");
            }
            $nr=mysqli_num_rows($res);
            if($nr!=0)
            {
                $f=1;
            }
            
            else
            {
                
                
                    
					$pass= password_hash("'".$_POST['InputPassword']."'",PASSWORD_BCRYPT,array('cost' => 12));
					
					
$qc="insert into person_data(Name,Username,password,Email_Id,SSN,Role,Age) values('".$_POST['InputName']."','".$_POST['InputEmail']."','".$pass."','".$_POST['InputEmail']."',".$_POST['InputSSN'].",'patient',".$_POST['InputAge'].")";
                   
                    $out=mysqli_query($cxn,$qc);
                    if(!$out)
                    {
						 
                           $da=2;
                    }
                    else
                    header("Location:../index.php");
            }
  
            
            
            //echo $qc;
            
        }
?>
<html>
<head>
<style type="text/css">
   body { background: gray !important; } 
</style>
    <meta charset="utf-8" />
    <title>Registration form Template | PrepBootstrap</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="font-awesome/css/font-awesome.min.css" />

    <script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">

<div class="page-header">
    <h1><Strong>Registration form</h1>
</div>

<!-- Registration form - START -->
<div class="container">
    <div class="row">
        <form class="form-signin"method="post">
            <div class="col-lg-6">
                <div class="well well-sm"><strong><span class="glyphicon glyphicon-asterisk"></span>Required Field</strong></div>
                <div class="form-group">
                    <label for="InputName">Enter Name</label>
                    <div class="input-group">
                        <input type="text" class="form-control" name="InputName" id="InputName" placeholder="Enter Name" required>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="InputEmail">Enter Email</label>
                    <div class="input-group">
                        <input type="email" class="form-control" id="InputEmail" name="InputEmail" placeholder="Enter Email" required>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                    </div>
                </div>
				<div class="form-group">
                    <label for="InputPassword">Enter Password</label>
                    <div class="input-group">
                        <input type="password" class="form-control" name="InputPassword" id="InputPassword" placeholder="Enter Password" required>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="InputAge">Enter Age</label>
                    <div class="input-group">
                        <input type="text" class="form-control" name="InputAge" id="InputAge" placeholder="Enter Age" required>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                    </div>
                </div>
				<div class="form-group">
                    <label for="InputSSN">Enter SSN</label>
                    <div class="input-group">
                        <input type="integer" class="form-control" name="InputSSN" id="InputSSN" placeholder="Enter Height" required>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                    </div>
                </div>
                <input type="submit" name="submit" id="submit" value="submit" class="btn btn-info pull-right" onSubmit=
				"alert('Success! Account Created')">
            </div>
       
        <!<div class="col-lg-5 col-md-push-1">
            <!<div class="col-md-12">
                <!<div class="alert alert-success">
                    <!<strong><!<span class="glyphicon glyphicon-ok"><!</span><!Success! Account Created.<!</strong>
                <!</div>
                <!<div class="alert alert-danger">
                    <!<span class="glyphicon glyphicon-remove"><!</span><!<strong><!Error! Please check all page inputs.<!</strong>
                <!</div>
            <!</div>
        <!</div>
    </div>
</div>
 </form>
<!-- Registration form - END -->

</div>

</body>
</html>