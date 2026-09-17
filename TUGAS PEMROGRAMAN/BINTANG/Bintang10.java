public class Bintang10 {
    /* Target: jam pasir rata kiri (lebih tinggi dari formasi 7)
    ******
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
        for (int i = 6; i >= 1; i--) {
            System.out.println("*".repeat(i));
        }
        for (int i = 2; i <= 5; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
