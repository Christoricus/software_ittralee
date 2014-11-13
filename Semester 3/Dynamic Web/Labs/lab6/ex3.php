<?php

	$foo = 2.5;
	$bar = $foo+1;
	$string = 'string';
	settype($string, "boolean");
	echo gettype($string);

?>