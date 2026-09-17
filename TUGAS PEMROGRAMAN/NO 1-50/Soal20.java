public class Soal20 {
    // Target: 1 2 4 7 8 10 13 14 16 19 20 22 25  => n+1, n+2, n+3, berulang
    public static void main(String[] args) {
        int n = 1;
        int jumlahSuku = 13;
        int[] tambah = {1, 2, 3};
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        for (int i = 1; i < jumlahSuku; i++) {
            n = n + tambah[(i - 1) % 3];
            sb.append(" ").append(n);
        }
        System.out.println(sb);
    }
}
