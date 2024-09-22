import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // 점을 저장할 배열 선언
        int[][] points = new int[N][2];

        // 점 입력 받기
        for (int i = 0; i < N; i++) {
            points[i][0] = scanner.nextInt();  // x 좌표
            points[i][1] = scanner.nextInt();  // y 좌표
        }

        // comparator를 사용하여 정렬
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] point1, int[] point2) {
                if (point1[0] == point2[0]) {
                    return Integer.compare(point1[1], point2[1]);
                }
                return Integer.compare(point1[0], point2[0]);
            }
        });

        // 정렬된 점들 출력
        for (int i = 0; i < N; i++) {
            System.out.println(points[i][0] + " " + points[i][1]);
        }

        scanner.close();
    }
}
