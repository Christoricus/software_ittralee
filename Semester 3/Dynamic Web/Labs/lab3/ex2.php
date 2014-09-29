<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Exercise 2 - Logical Operators</title>
		<meta charset="utf-8">
			
	</head>
		
	<body>
		
	<?php
		$income = 158800;
		
		
		if ($income >= 0 and $income <= 14800 ) {
			echo "<h2>Based on income of <strong>$income</strong> your tax rate is <strong>20%</strong></h2>";
		} else {
			echo "<h2>Based on income of <strong>$income</strong> your tax rate is <strong>42%</strong></h2>";
		}
	?>
		
	</body>
		
</html>