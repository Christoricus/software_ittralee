<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Exercise 2 - While Loop</title>
		<meta charset="utf-8">
			
	</head>
		
	<body>
		
	<?php
		$num = 1;
		
		echo ("<table border='1'");
		echo ("<tr><th>Number</th>");
		echo ("<th>Square</th>");
		echo ("<th>Cube</th></tr>");

		while ( $num <= 100 ) {
			echo ("<tr><td>");
			echo ($num);
			echo ("</td><td>");
			
			echo ($num * $num);
			echo ("</td><td>");
			
			echo ($num*$num*$num);
			echo ("</td></tr>");
			
			$num++;
		}
		echo ("</table>");
	?>
		
	</body>
		
</html>