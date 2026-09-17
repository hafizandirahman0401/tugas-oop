public class Bintang6 {
    /* Target: kebalikan dari formasi 3
      *
     **
    ***
    *
    **
    ***
    */
    public static void main(String[] args) {
        // segitiga pertama, indentasi mengecil
        for (int i = 1; i <= 3; i++) {
            int spasi = 3 - i;
            System.out.println(" ".repeat(spasi) + "*".repeat(i));
        }
        // segitiga kedua rata kiri
        for (int i = 1; i <= 3; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
