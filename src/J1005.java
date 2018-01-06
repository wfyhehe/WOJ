import java.util.Scanner;

public class J1005 {
    private int[] sizes;
    private int[] values;
    private int[] resultList;

    private void run() {
        Scanner input = new Scanner(System.in);
        do {
            int count = input.nextInt();
            sizes = new int[count];
            values = new int[count];
            for (int i = 0; i < count; i++) {
                sizes[i] = input.nextInt();
                values[i] = input.nextInt();
            }
            int packSize = input.nextInt();
            resultList = new int[packSize + 1];
            for (int i = 0; i < count; i++) {
                int size = sizes[i];
                int value = values[i];
                for (int j = packSize; j >= 0; j--) {
                    if (size <= j) {
                        if (i == 0) {
                            resultList[j] = value;
                        } else {
                            int newResult = resultList[j - size] + value;
                            if (newResult > resultList[j]) {
                                resultList[j] = newResult;
                            }
                        }
                    } else {
                        break;
                    }
                }
            }
            System.out.println(resultList[packSize]);
        } while(input.hasNext());
        input.close();
    }

    public static void main(String[] args) {
        new J1005().run();
    }
}
