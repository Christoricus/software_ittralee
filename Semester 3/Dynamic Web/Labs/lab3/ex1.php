<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Exercise 1 - Conditional Statement (If or Else)</title>
		<meta charset="utf-8">
			
	</head>
		
	<body>
		
	<?php
	
		$mark1 = 55;
		$mark2 = 40;
		$average = ($mark1+$mark2)/2;
	
		if ($average >= 40) {
			echo 'Congratulations - you have passed.';
		} else { 
			echo 'Commiserations - You failed.';
		}	
	
	/*
	if ($average >= 40) {
		echo "<h2>$average"; 
	?> is more than 40 <br> you passed
	<?php } else { 
		echo ("<h2>$average"); ?>
	is less than 40 <br>
	you lose </h2>
	<?php }
	*/
	?>
		
	</body>
		
</html>