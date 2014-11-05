<?php  

function fact($n)
{

$x = 1;  

for($i=1;$i<=$n-1;$i++)  

{  

 $x*=($i+1);   

}  
return $x;
}

$n = $_POST['checknum'];



echo "The factorial of  $n =" . fact($n);  

 

 
?>  

 