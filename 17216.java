import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        // 수열의 크기 N 입력
        int N = sc.nextInt();
        int[] A = new int[N];
        
        // 수열 A 입력
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        // dp 배열 초기화
        int[] dp = new int[N];
        for (int i = 0; i < N; i++) {
            dp[i] = A[i]; // 각 원소로 초기화
        }
        
        // 감소 부분 수열의 최대 합 계산
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] < A[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + A[i]);
                }
            }
        }
        
        // 최대 합 계산
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum = Math.max(sum, dp[i]);
        }
        
        System.out.println(sum);
        sc.close();
    }
}
