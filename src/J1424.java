import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/6, good luck.
 */
public class J1424 {
    public static void main(String[] args) {
        new J1424().run();
    }

    private void run() {
        Scanner input = new Scanner(System.in);
        while (true) {
            int n = input.nextInt();
            if (n == 0) break;
            StringBuilder sb = new StringBuilder();
            if (n == 1) {
                sb.append("1 ");
            } else if (n % 3 == 1) { // 4 + k * 3
                sb.append("2 2 ");
                for (int i = 0; i < n / 3 - 1; i++) {
                    sb.append("3 ");
                }
            } else if (n % 3 == 2) { // 2 + k * 3
                sb.append("2 ");
                for (int i = 0; i < n / 3; i++) {
                    sb.append("3 ");
                }
            } else if (n % 3 == 0) { // k * 3
                for (int i = 0; i < n / 3; i++) {
                    sb.append("3 ");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb);
        }
    }
}
