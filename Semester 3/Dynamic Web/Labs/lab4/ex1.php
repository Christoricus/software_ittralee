<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Exercise 1 - While Loop</title>
		<meta charset="utf-8">
			
	</head>
		
	<body>
		
	<?php
		$num = 0;
		$sum = 1;
		
		while ($sum < 1000) {
			$sum = $sum * 2;
			$num++;
			
		}
		
		echo ("The sum is $num");
	?>
		
	</body>
		
</html>