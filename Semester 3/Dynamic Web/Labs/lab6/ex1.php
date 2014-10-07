<!DOCTYPE html>
<html lang="en">
	<head>
		<title>PHP Include</title>
		<meta charset="utf-8">
	</head>

	<body>

		<div class="leftmenu">
			<?php 
				require("wrongFile.php"); 
			?>
		</div>

		<h1>Welcome to my home page.</h1>
		<p>Some text.</p>
	</body>

</html> 
