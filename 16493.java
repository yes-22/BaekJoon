import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        // 남은 기간 N과 챕터 수 M 입력
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // 각 챕터의 소요 일 수와 페이지 수를 저장할 배열 생성
        int[] day = new int[M];
        int[] page = new int[M];
        
        // scanner를 통해 배열에 정보 입력
        for (int i = 0; i < M; i++) {
            day[i] = sc.nextInt();
            page[i] = sc.nextInt();
        }
        
        // DP 배열 초기화
        int[] dp = new int[N + 1];
        
        // DP를 이용한 최대 페이지 수 계산
        for (int i = 0; i < M; i++) {
            for (int j = N; j >= day[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - day[i]] + page[i]);
            }
        }
        
        // 결과 출력
        System.out.println(dp[N]);
        
        sc.close();
    }
}
