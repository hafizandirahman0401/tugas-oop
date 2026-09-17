public class Bintang12 {
    /* Target: kebalikan formasi 9
    00000000000
    **********0
    **********0
    **********0
    **********0
    **********0
    */
    public static void main(String[] args) {
        int lebar = 11;
        System.out.println("0".repeat(lebar));
        for (int i = 1; i <= 5; i++) {
            System.out.println("*".repeat(lebar - 1) + "0");
        }
    }
}
