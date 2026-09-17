public class Bintang11 {
    /* Target: kebalikan formasi 8
    00000000000
    0**********
    0**********
    0**********
    0**********
    0**********
    */
    public static void main(String[] args) {
        int lebar = 11;
        System.out.println("0".repeat(lebar));
        for (int i = 1; i <= 5; i++) {
            System.out.println("0" + "*".repeat(lebar - 1));
        }
    }
}
