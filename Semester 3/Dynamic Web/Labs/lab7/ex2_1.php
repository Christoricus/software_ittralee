<?php
	$km = (int) $_POST['km'];
	
	$miles = $km * 0.62137;
	
	echo ("<h1>$km km to Miles: " .number_format($miles,2) ."m</h1>");
?>