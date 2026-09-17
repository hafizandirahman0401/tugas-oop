public class Soal39 {
    // Animasi 0 dari kiri atas ke kiri bawah, lalu kembali dari kiri bawah ke kiri atas (bolak-balik)
    static final int TINGGI = 10;

    static void gambar(int barisAktif) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int baris = 0; baris < TINGGI; baris++) {
            System.out.println(baris == barisAktif ? "0" : "");
        }
        try { Thread.sleep(150); } catch (InterruptedException e) {}
    }

    public static void main(String[] args) {
        for (int i = 0; i < TINGGI; i++) gambar(i);       // atas -> bawah
        for (int i = TINGGI - 1; i >= 0; i--) gambar(i);  // bawah -> atas
    }
}
