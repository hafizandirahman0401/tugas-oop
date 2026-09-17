public class Bintang3 {
    /* Target: dua segitiga bertumpuk
    *
    **
    ***
      *
     **
    ***
    */
    public static void main(String[] args) {
        // segitiga pertama rata kiri
        for (int i = 1; i <= 3; i++) {
            System.out.println("*".repeat(i));
        }
        // segitiga kedua, indentasi mengecil (rata kanan bawah)
        for (int i = 1; i <= 3; i++) {
            int spasi = 3 - i;
            System.out.println(" ".repeat(spasi) + "*".repeat(i));
        }
    }
}
