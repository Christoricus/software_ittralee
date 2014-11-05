<?php
	function swapNum(&$i, &$j) {
	$temp = $i;
        $i = $j;
	$j = $temp;
	}
	
	 $a = 10;
	 $b = 20;
	 echo("<h1>Demonstrating pass by reference </h1>");
	 echo ("<h2>Before the swap A is $a and B is $b <br /> </h2>"); 
	 swapNum($a, $b);
	 echo ("<h2>After the swap A is $a and B is $b <br /> </h2>"); 
	  
?>

