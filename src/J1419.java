import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/6, good luck.
 */
public class J1419 {
    public static void main(String[] args) {
        new J1419().run();
    }

    private void run() {
        Scanner input = new Scanner(System.in);
        int totalCount = input.nextInt();
        for (int i = 0; i < totalCount; i++) {
            int count = input.nextInt();
            int xayScore = 0;
            int amrScore = 0;
            boolean xaysTurn = false;
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < count; j++) {
                xaysTurn = !xaysTurn;
                int current = input.nextInt();
                list.add(current);
                int prevIndex = list.indexOf(current);
                if (prevIndex < list.size() - 1) {
                    int score = list.size() - prevIndex;
                    if (prevIndex == 0) {
                        list.clear();
                    } else {
                        list = list.subList(0, prevIndex);
                    }
                    if (xaysTurn) {
                        xayScore += score;
                    } else {
                        amrScore += score;
                    }
                }
            }
            System.out.println(xayScore > amrScore ? "xay" : "amr");
        }
    }
}
