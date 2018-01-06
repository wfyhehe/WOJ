import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/6, good luck.
 */
public class J1403 {
    private int[] ufs;
    private int[] temp;
    private int count;

    public static void main(String[] args) {
        new J1403().run();

    }

    private void run() {
        Scanner input = new Scanner(System.in);
        this.count = input.nextInt();
        ufs = new int[10001];
        temp = new int[10001];
        for (int i = 0; i <= count; i++) {
            ufs[i] = i;
            temp[i] = i;
        }
        int yesCount = 0;
        int noCount = 0;
        while (true) {
            char command = input.next().charAt(0);
            if (command == 'e') break;
            if (command == 'c') {
                int from = input.nextInt();
                int to = input.nextInt();
                int root1 = find(temp[from]);
                int root2 = find(temp[to]);
                if (root1 != root2) {
                    union(root1, root2);
                }
            } else if (command == 'd') {
                int from = input.nextInt();
                delete(from);
            } else { // q
                int from = input.nextInt();
                int to = input.nextInt();
                if (find(temp[from]) == find(temp[to])) {
                    yesCount++;
                } else {
                    noCount++;
                }
            }
        }
        System.out.printf("%d , %d", yesCount, noCount);
    }

    private void union(int x, int y) {
        ufs[x] = y;
    }

    private int find(int x) {
        if (ufs[x] == x) {
            return x;
        }
        int ret = find(ufs[x]);
        ufs[x] = ret;
        return ret;
    }

    private void delete(int x) {
        count++;
        temp[x] = count;
        ufs[count] = count;
    }
}
