public class Soal41 {
    // Animasi 0 dari kanan atas ke kanan bawah, lalu kembali dari kanan bawah ke kanan atas (bolak-balik)
    static final int TINGGI = 10;
    static final int LEBAR = 20;

    static void gambar(int barisAktif) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        StringBuilder spasi = new StringBuilder();
        for (int i = 0; i < LEBAR - 1; i++) spasi.append(" ");
        for (int baris = 0; baris < TINGGI; baris++) {
            System.out.println(baris == barisAktif ? spasi.toString() + "0" : "");
        }
        try { Thread.sleep(150); } catch (InterruptedException e) {}
    }

    public static void main(String[] args) {
        for (int i = 0; i < TINGGI; i++) gambar(i);       // atas -> bawah
        for (int i = TINGGI - 1; i >= 0; i--) gambar(i);  // bawah -> atas
    }
}
