<?php           

   $numOfHours = (int) $_POST['hours'];
   $ratePerHour = (int) $_POST['rate'];

   function calcPay($numOfHours, $ratePerHour) {

        if ($numOfHours > 60) {
            echo "<h2>Your hours have been capped.</h2>";
            echo "<h2>Your pay this week is: " .(60*$ratePerHour) ."</h2>";
            echo "<h2>Payment due for " .($numOfHours-60) ." hours: " .(($numOfHours-60)*$ratePerHour) ."</h2>";
        } else { 
            echo "<h2>Your pay this week is: " .($numOfHours*$ratePerHour) ."</h2>";

        }
    }

    //calcPay(70, 8.65);
	calcPay($numOfHours, $ratePerHour);
?>