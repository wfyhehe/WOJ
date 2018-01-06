import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class WIPJ1006 {
    public static void main(String[] args) {
        new WIPJ1006().run();
    }

    private void run() {
        Scanner input = new Scanner(System.in);
        int animalCount = input.nextInt();
        int pairCount = input.nextInt();
        int[][] graph = new int[animalCount][animalCount];
        for (int i = 0; i < animalCount; i++) {
            graph[i][i] = 1;
        }
        for (int i = 0; i < pairCount; i++) {
            int animal1 = input.nextInt();
            int animal2 = input.nextInt();
            graph[animal1][animal2] = 1;
            graph[animal2][animal1] = 1;
        }
        int resultCount = input.nextInt();
        for (int i = 0; i < resultCount; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            if (x == y || graph[x][y] == 1) {
                System.out.println(0);
                continue;
            }
            // BFS
            boolean flag = false;
            boolean[] visited = new boolean[animalCount];
            int[] levels = new int[animalCount];
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(x);
            while (!(queue.isEmpty() || flag)) {
                int current = queue.poll();
                visited[current] = true;
                for (int j = 0; j < animalCount; j++) {
                    if (graph[current][j] != 0 && !visited[j]) {
                        levels[j] = levels[j] == 0 ?
                                levels[current] + 1 :
                                Math.min(levels[j], levels[current] + 1);
                        if (j == y) {
                            System.out.println(Math.max(0, levels[y] - 1));
                            flag = true;
                            break;
                        }
                        queue.offer(j);
                    }
                }
            }
            if (!flag) {
                System.out.println(-1);
            }
        }
    }
}
