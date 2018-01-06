import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/6, good luck.
 */
public class J1413 {
    public static void main(String[] args) {
        new J1413().run();
    }

    private void run() {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        for (int i = 0; i < count; i++) {
            double a = input.nextDouble();
            double b = input.nextDouble();
            double h = input.nextDouble();
            System.out.printf("%.2f\n", h * b / a);
        }
    }
}
