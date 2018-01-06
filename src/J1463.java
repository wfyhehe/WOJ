import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/6, good luck.
 */
public class J1463 {
    private static Map<Character, Integer> holeMap = new HashMap<>();

    static {
        holeMap.put('0', 1);
        holeMap.put('1', 0);
        holeMap.put('2', 0);
        holeMap.put('3', 0);
        holeMap.put('4', 1);
        holeMap.put('5', 0);
        holeMap.put('6', 1);
        holeMap.put('7', 0);
        holeMap.put('8', 2);
        holeMap.put('9', 1);
        holeMap.put('A', 1);
        holeMap.put('a', 1);
        holeMap.put('B', 2);
        holeMap.put('b', 2);
        holeMap.put('C', 0);
        holeMap.put('c', 0);
        holeMap.put('D', 1);
        holeMap.put('d', 1);
        holeMap.put('E', 0);
        holeMap.put('e', 0);
        holeMap.put('F', 0);
        holeMap.put('f', 0);
    }

    public static void main(String[] args) {
        new J1463().run();
    }

    private void run() {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int integer = input.nextInt();
            String hexString = Integer.toHexString(integer);
            char[] charArray = hexString.toCharArray();
            int holeCount = 0;
            for (char c : charArray) {
                holeCount += holeMap.get(c);
            }
            System.out.println(holeCount);
        }
    }
}
