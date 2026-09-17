public class Soal19 {
    // Target: 3 9 4 12 7 21 16 48 43 129  => n*3, n-5, ...
    public static void main(String[] args) {
        int n = 3;
        int jumlahSuku = 10;
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        for (int i = 1; i < jumlahSuku; i++) {
            if (i % 2 == 1) n = n * 3;
            else n = n - 5;
            sb.append(" ").append(n);
        }
        System.out.println(sb);
    }
}
