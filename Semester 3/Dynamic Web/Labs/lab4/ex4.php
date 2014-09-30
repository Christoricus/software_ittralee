<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Exercise 3 - For Loop</title>
		<meta charset="utf-8">
			
	</head>
		
	<body>
		
	<?php
		
		$squared = 0;
		$cubed = 0;
		
		echo ("<table border='1'>");
		echo ("<tr><th>Number</th>");
		echo ("<th>Squared</th>");
		echo ("<th>Cubed</th></tr>");
		
		for ($i = 1; $i < 11; $i++) {
			
			echo ("<tr><td> $i </td>");
			$squared = $i*$i;
			echo ("<td> $squared</td>");
			$cubed = $i*$i*$i;
			echo ("<td> $cubed</td></tr>");
			
		
		}
		
		echo ("</table>");
	?>
		
	</body>
		
</html>