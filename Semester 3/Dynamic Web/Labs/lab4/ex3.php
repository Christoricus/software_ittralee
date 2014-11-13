<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Exercise 3 - localeconv()</title>
		<meta charset="utf-8">
			
	</head>
		
	<body>
		
	<?php
		
		setlocale(LC_ALL, "en-US");
		$locale_info = localeconv();
		$myNumber = 123456.784321;
		
		
		echo $locale_info["currency_symbol"]
		.number_format( $myNumber, 2, '.', $locale_info["mon_thousands_sep"]);
		
	?>
		
	</body>
		
</html>