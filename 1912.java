import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 최대합을 저장할 dp 선언
        int[] dp = new int[n];
        dp[0] = arr[0];
        
        // 최대합을 저장할 sum 선언
        int sum = dp[0];
        
        //더 큰 값 찾기 
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]); //i-1까지 합 + 현재 값이 더 큰지, 현재 값이 더 큰지 비교 
            sum = Math.max(sum, dp[i]);
        }
        
        System.out.println(sum);
    }
}
