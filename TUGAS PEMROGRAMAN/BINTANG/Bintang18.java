public class Bintang18 {
    /* Target: garis diagonal '*' dari kiri-atas ke kanan-bawah
    *000000
    0*00000
    00*0000
    000*000
    0000*00
    00000*0
    */
    public static void main(String[] args) {
        int n = 7;
        for (int baris = 1; baris <= 6; baris++) {
            int posisiBintang = baris;
            StringBuilder sb = new StringBuilder();
            for (int kolom = 1; kolom <= n; kolom++) {
                sb.append(kolom == posisiBintang ? '*' : '0');
            }
            System.out.println(sb);
        }
    }
}
