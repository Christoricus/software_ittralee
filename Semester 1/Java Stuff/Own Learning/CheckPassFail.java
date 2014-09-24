public class CheckPassFail { // saved as "CheckPassFail.java"
   public static void main(String[] args) {
      int mark = 49;        // set the value of mark here!
      String x = "Pass", y = "Fail";
      System.out.println("The mark is " + mark);
 
      if (mark >= 50) {
         System.out.println(x);
      } else {
         System.out.println(y);
      }
   }
}