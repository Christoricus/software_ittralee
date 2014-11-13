<html>
<head>
<?php
$male_status = 'unchecked';
$female_status = 'unchecked';

	if (isset($_POST['submit1'])) {
		$selected_radio = $_POST['gender'];
		if ($selected_radio == 'male') {
			echo $selected_radio;
			$male_status = 'checked';
		}
		else if ($selected_radio == 'female') {
			echo $selected_radio;
			$female_status = 'checked';
		}
		//echo $selected_radio;
	}
?>
</head>
<body>


<form name="form1" method="post" action="radioButton.php">
	<input type="radio" name="gender" value='male' <?php echo $male_status; ?>>Male
	
	<input type="radio" name="gender" value='female' <?php echo $female_status; ?>>Female
	
	<input type="submit" name='submit1' value="Submit">
</form>

</body>
</html>