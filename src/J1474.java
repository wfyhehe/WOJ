import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/6, good luck.
 */
public class J1474 {
    public static void main(String[] args) {
        new J1474().run();
    }

    private void run() {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = input.nextInt();
        }
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        int step = 0;
        while (true) {
            int top = array[0];
            if (top == 0) {
                System.out.println(step);
                break;
            }
            step++;
            for (int j = 0; j < top; j++) {
                array[j] = array[j + 1];
            }
            array[top] = top;
            if (Arrays.equals(array, arrayCopy)) {
                System.out.println("-1s");
                break;
            }
        }
    }
}
