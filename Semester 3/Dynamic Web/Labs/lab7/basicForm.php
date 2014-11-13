<!DOCTYPE html>
<html lang="en">
	<head>
		<title>User Interaction Forms</title>
		<meta charset="utf-8">
		<?php
			$username = $_POST['username'];
			
			if ($username == "letmein") {
				echo "Welcome back, Nazzy!";
			
			} else {
				echo "You're not a member of this site!";
			}
		
		?>
	</head>

	<body>
		<form name="form1" method="post" action="basicForm.php">
			<input type="text" value="username" name="username">
			<input type="submit" name="submit1" value="login">
		</form>
		
			
	</body>

</html> 