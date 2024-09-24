import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 배열 A 입력 받기
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // 배열 B 입력 받기
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }

        // 배열 A와 B를 합친 새로운 배열 C 생성
        int[] C = new int[N + M];
        System.arraycopy(A, 0, C, 0, N);
        System.arraycopy(B, 0, C, N, M);

        // 배열 C를 정렬
        Arrays.sort(C);

        StringBuilder sb = new StringBuilder();
        for (int num : C) {
            sb.append(num).append(" ");
        }

        System.out.println(sb.toString().trim());
        sc.close();
    }
}
