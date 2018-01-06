import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/6, good luck.
 */
public class J1406 {
    public static void main(String[] args) {
        new J1406().run();
    }

    private void run() {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int a = input.nextInt();
            int b = input.nextInt();
            if (a == 0) {
                System.out.println(0);
            } else {
                int ret = (int) (((float) b) / a / 2.0 + 0.5 - 1e-6);
                System.out.println(ret);
            }
        }
    }
}
