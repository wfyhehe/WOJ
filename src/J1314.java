import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/6, good luck.
 */
public class J1314 {
    public static void main(String[] args) {
        new J1314().run();
    }

    private void run() {
        Scanner input = new Scanner(System.in);
        while (true) {
            int maxLength = 0;
            int lowerBound = input.nextInt();
            int higherBound = input.nextInt();
            if (lowerBound == 0 && higherBound == 0) break;
            for (int i = lowerBound; i <= higherBound; i++) {
                if (i == 1 || i == 0) {
                    maxLength = 1;
                    continue;
                }
                int length = 1;
                int current = i;
                while (current != 1) {
                    length++;
                    if (current % 2 == 0) {
                        current /= 2;
                    } else {
                        current = current * 3 + 1;
                    }
                }
                if (length > maxLength) {
                    maxLength = length;
                }
            }
            System.out.println(maxLength);
        }
    }
}
