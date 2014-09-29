<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Exercise 2 - Switch Statement</title>
		<meta charset="utf-8">
			
	</head>
		
	<body>
		
	<?php
		$product = 'Video';
		
		switch($product) {
		
		case 'Video':
			echo ("$product cards range from €50 to €500");
			break;
		
		case 'LCD':
			echo ("$product monitors range from €200 to €400");
			break;
			
		case 'processors':
			echo ("Intel $product monitors range from €100 to €1000");
			break;
		
		default:
			echo ("Sorry - we don't carry this product");		

		}
	?>
		
	</body>
		
</html>