public class Bintang4 {
    /* Target:
    *         *
    **       **
    ***     ***
    ****   ****
    ***** *****
    ***********
    */
    public static void main(String[] args) {
        int lebar = 11;
        for (int i = 1; i <= 5; i++) {
            int spasi = lebar - 2 * i;
            System.out.println("*".repeat(i) + " ".repeat(spasi) + "*".repeat(i));
        }
        System.out.println("*".repeat(lebar)); // baris terakhir penuh
    }
}
