<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Exercise 2 - Working with Functions</title>
		<meta charset="utf-8">
	</head>
	<body>
		<?php
			/* Create a function called subtractNumbers that will 
			subtract 2 numbers and return the result.  Call the function, 
			passing through the values contained in $var1 and $var2 as arguments.
			*/
			
			function subtractNumbers($var1, $var2) {
				if ($var2 > $var1) {
					echo "<h2>Ooops, second number should be less than the first one.</h2>";
					echo "<h1>0</h1>";
				} else {
					echo "<h2>$var1 - $var2 = " .($var1-$var2) ."</h2>";
				}
			}
			
			subtractNumbers(10, 5);
			
			/* Create a function called calcPay that takes as parameters the number of hours 
			worked and an hourly rate and returns the pay. 
				According to the companys rules, no employee may be paid for more 
				than 60 hours at which point the hours are capped and a message stating 
				that is displayed.  This validation is done within the function. The pay 
				returned from the function is displayed in the main body of the program.
			*/
			echo "<br><br>";
			
			function calcPay($numOfHours, $ratePerHour) {
				
				if ($numOfHours > 60) {
					echo "<h2>Your hours have been capped.</h2>";
					echo "<h2>Your pay this week is: " .(60*$ratePerHour) ."</h2>";
				} else { 
					echo "<h2>Your pay this week is: " .($numOfHours*$ratePerHour) ."</h2>";
				
				}
			}
			
			calcPay(100, 8.65);

		?>
	</body>
</html>