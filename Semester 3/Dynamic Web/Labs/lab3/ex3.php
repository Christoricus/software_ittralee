<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Exercise 2 - If Esle If Else</title>
		<meta charset="utf-8">
			
	</head>
		
	<body>
		
	<?php
		$income = 160;
		
		
		if ($income <= 14800 ) {
			echo "<h2>Based on income of <strong>$income</strong> your tax rate is <strong>20%</strong></h2>";
		} elseif ($income <= 29600) {
			echo "<h2>Based on income of <strong>$income</strong> your tax rate is <strong>42%</strong></h2>";
		} else {
			echo "<h2>Based on income of <strong>$income</strong> your tax rate is <strong>50%</strong></h2>";
		}
	?>
		
	</body>
		
</html>