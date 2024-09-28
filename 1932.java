import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //삼각형의 값을 저장할 2차원 배열 생성
        int[][] sum = new int[n][n];
        int[][] dp = new int[n][n];  //최대 합을 저장할 DP 배열 생성
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                sum[i][j] = sc.nextInt();
            }
        }
        
        //DP 배열의 첫 번째 값을 첫 번째 값으로 초기화
        dp[0][0] = sum[0][0];
        
        //위에서 아래로 내려가며 최대 경로 값을 계산
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    // 왼쪽 끝에 있는 수
                    dp[i][j] = dp[i-1][j] + sum[i][j];
                } else if (j == i) {
                    // 오른쪽 끝에 있는 수
                    dp[i][j] = dp[i-1][j-1] + sum[i][j];
                } else {
                    // 나머지 처리 -> 이전 값들의 합 + 현재 값 
                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + sum[i][j];
                }
            }
        }
        
        //가장 큰 값 출력
        int maxSum = 0;
        for (int j = 0; j < n; j++) {
            if (dp[n-1][j] > maxSum) {
                maxSum = dp[n-1][j];
            }
        }
        
        System.out.println(maxSum);
    }
}
