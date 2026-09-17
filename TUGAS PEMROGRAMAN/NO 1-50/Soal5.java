public class Soal5 {
    // Target: 666666555554444333221
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                sb.append(i);
            }
        }
        System.out.println(sb);
    }
}
