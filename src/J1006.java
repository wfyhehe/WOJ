/**
 * Created by Administrator on 2018/1/6, good luck.
 */

import java.util.*;

public class J1006 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int animalCount = in.nextInt();
        int pairCount = in.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < animalCount; i++) {
            List<Integer> list = new ArrayList<>();
            graph.add(list);
        }
        int from;
        int to;
        for (int i = 0; i < pairCount; i++) {
            from = in.nextInt();
            to = in.nextInt();
            graph.get(from).add(to);
            graph.get(to).add(from);
        }
        int needCount = in.nextInt();
        for (int i = 0; i < needCount; i++) {
            from = in.nextInt();
            to = in.nextInt();
            System.out.println(getLength(graph, from, to));
        }
    }

    private static int getLength(List<List<Integer>> graph, int start, int end) {
        int[] visited = new int[graph.size()];
        Arrays.fill(visited, 0);
        if (start == end)
            return 0;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(start);
        visited[start] = 1;
        int element;
        while (!queue.isEmpty()) {
            element = queue.poll();
            for (int node : graph.get(element)) {
                if (node == end)
                    return visited[element] - 1;
                if (visited[node] == 0) {
                    queue.offer(node);
                    visited[node] = visited[element] + 1;
                }
            }
        }
        return -1;
    }
}
