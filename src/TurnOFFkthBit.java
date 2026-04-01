public class TurnOFFkthBit {
    public static void main(String[] args) {
        int n = 10;
        int k = 2;

        System.out.println("Before: " + n + " (binary " + Integer.toBinaryString(n) + ")");

        n = n & ~(1 << k);

        System.out.println("After: " + n + " (binary " + Integer.toBinaryString(n) + ")");
    }
}
