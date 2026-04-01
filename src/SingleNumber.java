public class SingleNumber {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 3, 3, 4, 4};
        int xor = 0;

        for (int ele : arr) {
            xor ^= ele;  // XOR each element
        }

        System.out.println("Single number is: " + xor);
    }
}
