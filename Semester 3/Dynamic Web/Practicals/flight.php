<html>
<head>
<title>Checkboxes</title>

<?PHP
	$ch1 = 'unchecked';
	$ch2 = 'unchecked';
	$ch3 = 'unchecked';

  $cost=0;
  $flight=0;

  
if (isset($_POST['Submit1'])) {

	if (isset($_POST['ch1'])) {
		$ch1 = $_POST['ch1'];

		if ($ch1 == 'insurance') {
			$ch1 = 'checked';
      $cost+=100;
		}
	}

	if (isset($_POST['ch2'])) {
		$ch2 = $_POST['ch2'];

		if ($ch2 == 'baggage') {
			$ch2 = 'checked';
      $cost+=50;
		}   
	}

	if (isset($_POST['ch3'])) {
		$ch3 = $_POST['ch3'];

		if ($ch3 == 'board') {
			$ch3 = 'checked';
      $cost+=20;
		}
	}

 $flight =  $_POST['flight'];
$cost+=$flight;

}

?>


</head>

<body>

<FORM NAME ="form1" METHOD ="POST" ACTION ="flight.php">
<input type = "text"  name ="flight" value = "<?PHP echo $flight; ?>">
 <br>
<Input type = 'Checkbox' Name ='ch1' value ="insurance" <?PHP print $ch1; ?>>Insurance
 <br>

<Input type = 'Checkbox' Name ='ch2' value="baggage" <?PHP print $ch2; ?>>baggage
 <br>
<Input type = 'Checkbox' Name ='ch3' value="board" <?PHP print $ch3; ?>>priority boarding
 <br>
 <input type = "text"  name ="cost" value = "<?PHP echo $cost; ?>">

<INPUT TYPE = "Submit" Name = "Submit1"  VALUE = "Cost of flight">
</FORM>

</body>
</html>

