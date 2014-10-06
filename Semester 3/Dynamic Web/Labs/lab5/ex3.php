<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Exercise 3 - Passing by Reference</title>
		<meta charset="utf-8">
	</head>
	<body>
		<?php
		/*	Create a function that takes as arguments:
				A savings amount
				Interest rate which should be set to have a default value of 20%
			The function should calculate the new savings amount 
			(get interest rate and add it to the amount) and return it via pass by reference.
			The new savings amount should then be displayed in the main body of the program
		*/

		function savingsAmount(&$amount, $interest = 1.20) {
			$amount = $amount * $interest;
			echo $amount;
			//return $amount;
		}
		$amount = 200;
		
		//Referencing
		echo savingsAmount($amount, 1.40) ."<br>";
		//Without referencing
		echo savingsAmount($amount);
		
		?>
	</body>
</html>