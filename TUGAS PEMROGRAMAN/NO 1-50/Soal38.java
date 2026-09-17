public class Soal38 {
    // Animasi 0 dari pojok kiri atas ke kiri bawah, lalu ulang lagi dari kiri atas ke kiri bawah (searah)
    // Catatan: menggunakan ANSI clear-screen (\033[H\033[2J), jalankan di terminal yang mendukung ANSI (mis. Code::Blocks/CMD modern, Linux terminal)
    static final int TINGGI = 10;
    static final int LEBAR = 20;

    static void gambar(int barisAktif) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int baris = 0; baris < TINGGI; baris++) {
            if (baris == barisAktif) {
                System.out.println("0");
            } else {
                System.out.println();
            }
        }
        try { Thread.sleep(150); } catch (InterruptedException e) {}
    }

    public static void main(String[] args) {
        for (int i = 0; i < TINGGI; i++) gambar(i);   // atas -> bawah
        for (int i = 0; i < TINGGI; i++) gambar(i);   // ulang lagi atas -> bawah
    }
}
