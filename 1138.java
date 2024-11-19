import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] count = new int[N];
        for (int i = 0; i < N; i++) {
            count[i] = sc.nextInt();
        }

        // 각자 자기 선 위치를 기억할 배열
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            int left = count[i]; // 현재 사람의 왼쪽에 있던 큰 사람 수
            int p = 0; 

            // 값을 비교하면 자리를 찾기
            for (int j = 0; j < N; j++) {
                if (result[j] == 0) { // 빈 자리 확인
                    if (left == 0) { // 조건 만족하면 자리 배정
                        p = j;
                        break;
                    }
                    left--; // 남은 큰 사람 수 감소
                }
            }
            result[p] = i + 1;
        }
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
