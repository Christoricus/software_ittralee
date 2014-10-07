<!DOCTYPE html>
<html lang="en">
	<head>
		<title>PHP Include</title>
		<meta charset="utf-8">
	</head>

	<body>
		<h1>Calling function 1</h1>
		<div class="leftmenu">
			<?php 
				require("calcPay.php"); 
			?>
		</div>
		
		<h1><br>Calling function 2</h1>
		<div class="leftmenu">
			<?php 
				require("subtractNumbers.php"); 
			?>
		</div>
		
		
	</body>

</html> 
