import java.util.*;

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
            for (int j = 0; j < animalCount; j++) {
                graph[i][j] = i == j ? 0 : -1;
            }
        }
        for (int i = 0; i < pairCount; i++) {
            int animal1 = input.nextInt();
            int animal2 = input.nextInt();
            graph[animal1][animal2] = 0;
            graph[animal2][animal1] = 0;
        }
        for (int k = 0; k < animalCount; k++) {
            for (int i = 0; i < animalCount; i++) {
                for (int j = 0; j < animalCount; j++) {
                    int originalEdge = graph[i][j];
                    int newEdgePart1 = graph[i][k];
                    int newEdgePart2 = graph[k][j];
                    if (newEdgePart1 == -1 || newEdgePart2 == -1) {
                        continue;
                    }
                    if (originalEdge == -1) {
                        graph[i][j] = newEdgePart1 + newEdgePart2 + 1;
                    } else {
                        graph[i][j] = Math.min(originalEdge, newEdgePart1 + newEdgePart2 + 1);
                    }
                }
            }
        }
        int resultCount = input.nextInt();
        for (int i = 0; i < resultCount; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            System.out.println(graph[x][y]);
        }
        input.close();
    }
}
