public class SwaptwoNumbers {
  public  static void main(String[] args) {
        int a =8;
        int b=5;

      System.out.println("Before Swapping a = " + a + ", b = " + b);
      a=a^b;
      b=a^b;
      a=a^b;
      System.out.println("Aftr swapping a=" +a + "b =" +b);


  }
}