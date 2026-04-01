public class SetKthBit {
    public static void main(String[] args) {
        int n = 13;   // binary: 1101
        int k = 1;    // turn on 1st bit (0-based)

        System.out.println("Before: " + n + " (binary " + Integer.toBinaryString(n) + ")");

        n = n | (1 << k);  // set the k-th bit

        System.out.println("After: " + n + " (binary " + Integer.toBinaryString(n) + ")");
    }
}
