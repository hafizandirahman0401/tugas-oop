public class Bintang9 {
    /* Target:
    **********0
    **********0
    **********0
    **********0
    **********0
    00000000000
    */
    public static void main(String[] args) {
        int lebar = 11;
        for (int i = 1; i <= 5; i++) {
            System.out.println("*".repeat(lebar - 1) + "0");
        }
        System.out.println("0".repeat(lebar));
    }
}
