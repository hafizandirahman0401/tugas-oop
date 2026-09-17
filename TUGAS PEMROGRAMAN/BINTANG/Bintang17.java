public class Bintang17 {
    /* Target: garis diagonal '*' dari kanan-atas ke kiri-bawah
    000000*
    00000*0
    0000*00
    000*000
    00*0000
    0*00000
    */
    public static void main(String[] args) {
        int n = 7;
        for (int baris = 1; baris <= 6; baris++) {
            int posisiBintang = n - baris; // posisi 1..n dari kiri
            StringBuilder sb = new StringBuilder();
            for (int kolom = 1; kolom <= n; kolom++) {
                sb.append(kolom == posisiBintang ? '*' : '0');
            }
            System.out.println(sb);
        }
    }
}
