public class Bintang7 {
    /* Target: jam pasir (hourglass) rata kiri
    *****
    ****
    ***
    **
    *
    **
    ***
    ****
    *****
    */
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            System.out.println("*".repeat(i));
        }
        for (int i = 2; i <= 5; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
