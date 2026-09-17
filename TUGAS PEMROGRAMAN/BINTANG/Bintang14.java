public class Bintang14 {
    /* Target: kebalikan kiri-kanan dari formasi 13
    *000000
    **00000
    ***0000
    ****000
    *****00
    ******0
    */
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i) + "0".repeat(n + 1 - i));
        }
    }
}
