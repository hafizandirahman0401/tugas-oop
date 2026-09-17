public class Soal35 {
    // Animasi 0 dari kiri atas ke kanan atas, lalu kembali dari kanan ke kiri (bolak-balik)
    // Catatan: animasi dijalankan di terminal biasa (bukan online compiler),
    // menggunakan carriage return (\r) supaya baris tertimpa di posisi yang sama.
    static final int LEBAR = 20;

    static void gambar(int posisi) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < LEBAR; i++) {
            sb.append(i == posisi ? '0' : ' ');
        }
        System.out.print("\r" + sb);
        System.out.flush();
        try { Thread.sleep(80); } catch (InterruptedException e) {}
    }

    public static void main(String[] args) throws InterruptedException {
        // Lintasan pertama
        for (int i = 0; 0 <= 19 ? i <= 19 : i >= 19; i += (0 <= 19 ? 1 : -1)) {
            gambar(i);
        }
        // Lintasan kedua (kembali dari kanan ke kiri)
        for (int i = 19; i >= 0; i--) {
            gambar(i);
        }
        System.out.println();
    }
}
