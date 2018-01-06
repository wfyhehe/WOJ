import java.util.Scanner;

public class J1402 {

    public static void main(String[] args) {
        new J1402().run();
    }

    private void run() {
        Scanner input = new Scanner(System.in);
        while (true) {
            int count = input.nextInt();
            if (count == 0) return;
            Point[] points = new Point[count];
            for (int i = 0; i < count; i++) {
                float x = input.nextFloat();
                float y = input.nextFloat();
                points[i] = new Point(x, y);
            }
            float doubleArea = 0;
            for (int i = 0; i < count; i++) {
                int j = (i + 1) % count;
                doubleArea += points[i].x * points[j].y - points[j].x * points[i].y;
            }
            int area = Math.round(Math.abs(doubleArea) / 2);
            System.out.println(area);
        }
    }

    private static class Point {
        float x;
        float y;

        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }
    }
}
