public class Soal16 {
    // Target: 1 5 3 7 5 9 7 11 9 13 11 15  => n+4, n-2, ...
    public static void main(String[] args) {
        int n = 1;
        int jumlahSuku = 12;
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        for (int i = 1; i < jumlahSuku; i++) {
            if (i % 2 == 1) n = n + 4;
            else n = n - 2;
            sb.append(" ").append(n);
        }
        System.out.println(sb);
    }
}
