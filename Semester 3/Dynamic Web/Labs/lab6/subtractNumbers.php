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
?>