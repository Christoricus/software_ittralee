<html>
<head>
<title>Radio Buttons</title>
</head>

<?PHP

$twentytwo_status = 'unchecked';
$fortytwo_status = 'unchecked';
$result = 0;
$wage=0;
if (isset($_POST['submit1'])) {
$selected_radio = $_POST['tax'];

if ($selected_radio == '22') {

$twentytwo_status = 'checked';
}
else if ($selected_radio == '42') {

$fortytwo_status = 'checked';
}
$wage=$_POST['wage'];
$result = ($wage + ($wage / 100 * $selected_radio));
}
?>


<body>

<form name ="form1" method ="post" action ="wage.php">
<input type = "text"  name ="wage" value = "<?PHP echo $wage; ?>">
<Input type = 'Radio' Name ='tax' value= '22' <?PHP echo $twentytwo_status; ?>>22
<Input type = 'Radio' Name ='tax' value= '42' <?PHP echo $fortytwo_status; ?>>42
<input type = "text" name ="result"  value = "<?PHP echo $result; ?>"">
<p><Input type = "Submit" Name = "submit1" VALUE = "Select a Radio Button">
</form>


</body>
</html>


