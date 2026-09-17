public class Bintang19 {
    /* Target: kotak dengan bingkai '0'
    0000000
    0*****0
    0*****0
    0*****0
    0*****0
    0000000
    */
    public static void main(String[] args) {
        int n = 7;
        System.out.println("0".repeat(n));
        for (int i = 1; i <= 4; i++) {
            System.out.println("0" + "*".repeat(n - 2) + "0");
        }
        System.out.println("0".repeat(n));
    }
}
