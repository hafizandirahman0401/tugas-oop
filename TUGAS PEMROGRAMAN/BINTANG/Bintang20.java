public class Bintang20 {
    /* Target: 3 baris (0, *, =) diulang dua kali
    0000000
    *******
    =======
    0000000
    *******
    =======
    */
    public static void main(String[] args) {
        int n = 7;
        for (int ulang = 1; ulang <= 2; ulang++) {
            System.out.println("0".repeat(n));
            System.out.println("*".repeat(n));
            System.out.println("=".repeat(n));
        }
    }
}
