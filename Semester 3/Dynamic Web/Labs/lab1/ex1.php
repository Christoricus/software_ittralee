<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Exercise 1 - My first php</title>
		<meta charset="utf-8">
		
	</head>
	
	
	<body>
	<?php
	
	echo "<h1>Hello, World!</h1>";
	
	date_default_timezone_set("Asia/Dhaka");
	//echo "<p>Today's date is " .date("l, F dS Y") ." and it's " .date("g:i a") ." on the clock" ."</p>";
	echo "<p>Current time in Dhaka is " .date("g:i a") ." on the clock.</p>";
	
	?>
	
	</body>
</html>