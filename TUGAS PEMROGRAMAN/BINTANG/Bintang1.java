public class Bintang1 {
    /* Target:
    ***********
    ***** *****
    ****   ****
    ***     ***
    **       **
    *         *
    */
    public static void main(String[] args) {
        int lebar = 11;
        System.out.println("*".repeat(lebar)); // baris pertama penuh
        for (int i = 2; i <= 6; i++) {
            int sisi = 7 - i;          // jumlah bintang kiri & kanan
            int spasi = lebar - 2 * sisi;
            System.out.println("*".repeat(sisi) + " ".repeat(spasi) + "*".repeat(sisi));
        }
    }
}
