public class Bintang2 {
    /* Target: piramida bintang rata tengah
         *
        ***
       *****
      *******
     *********
    ***********
    */
    public static void main(String[] args) {
        int tinggi = 6;
        int lebarMaks = 2 * tinggi - 1;
        for (int i = 1; i <= tinggi; i++) {
            int bintang = 2 * i - 1;
            int spasi = (lebarMaks - bintang) / 2;
            System.out.println(" ".repeat(spasi) + "*".repeat(bintang));
        }
    }
}
