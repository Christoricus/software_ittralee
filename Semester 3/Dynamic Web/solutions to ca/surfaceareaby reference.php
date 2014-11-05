<?php  


function calcarea($rad, $height, &$ans)
{
  
 $ans = (2*3.142*$rad*$rad) + (2*3.142*$rad*$height);

}
$rad = (int)4;
$height = (int)6;
$ans=0;
calcarea($rad, $height, $ans);
echo "the surface area of the cyclinder is : based on a radius of $rad  and a height of $height is $ans"; 
 

 

 
?>  

 