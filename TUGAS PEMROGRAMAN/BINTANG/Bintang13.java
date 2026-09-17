public class Bintang13 {
    /* Target:
    0******
    00*****
    000****
    0000***
    00000**
    000000*
    */
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            System.out.println("0".repeat(i) + "*".repeat(n + 1 - i));
        }
    }
}
