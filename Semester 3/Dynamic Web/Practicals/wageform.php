<html>
<body>

<?php
function calcPay($x,$y)
{
if ($x > 60)
{
echo("more than 60 hours worked");
$x = 60;

}

$total=$x*$y;
return $total;
}

$hours = $_GET['wages'];
$baseWage= $_GET['rate'];

$hours = (float)$hours;
$baseWage = (float)$baseWage;

echo "Your wages for this week are: " . number_format(calcPay($hours,$baseWage),2);
?>

</body>
</html> 

