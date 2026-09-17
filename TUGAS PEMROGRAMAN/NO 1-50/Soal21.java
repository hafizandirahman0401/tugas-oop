public class Soal21 {
    // Target: 1 2 4 8 16 32 64 128 256 512 (dikali 2 tiap suku)
    public static void main(String[] args) {
        int n = 1;
        int jumlahSuku = 10;
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        for (int i = 1; i < jumlahSuku; i++) {
            n = n * 2;
            sb.append(" ").append(n);
        }
        System.out.println(sb);
    }
}
