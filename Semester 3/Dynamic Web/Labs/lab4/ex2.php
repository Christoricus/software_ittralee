<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Exercise 2 - While Loop</title>
		<meta charset="utf-8">
			
	</head>
		
	<body>
		
	<?php
		$invested = 100000;
		$y = 0;
		while ($invested > 12000) {
		   $invested = $invested * 1.05;
		   $invested = $invested - 12000;
		   $y++;
           //echo $invested . "<br>";
		   //$myNumber = $invested;
		   echo (number_format($invested, 2, ' point ', '') ."<br>");
			
		}
		echo "<h2>It  will take " . $y. " years</h2>";
		//echo (number_format($invested, 2));
		
	?>
		
	</body>
		
</html>