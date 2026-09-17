public class Bintang5 {
    /* Target: piramida terbalik rata tengah
    ***********
     *********
      *******
       *****
        ***
         *
    */
    public static void main(String[] args) {
        int tinggi = 6;
        for (int i = 0; i < tinggi; i++) {
            int bintang = 11 - 2 * i;
            int spasi = i;
            System.out.println(" ".repeat(spasi) + "*".repeat(bintang));
        }
    }
}
