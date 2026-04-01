import java .util.Scanner;
public class KthBit {

   public  static void main(String[] args) {
       int n = 13;
       int k = 2;
       if ((n & (1 << k)) != 0) {
           System.out.println("Bit" +k + "is SET in " +n);


       }  else{
           System.out.println("Bit " + k + " is NOT SET in " + n);
       }
   }
}
