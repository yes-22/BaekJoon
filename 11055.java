import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int[] a = new int[n+1];  
        int[] dp = new int[n+1];  
        int max = 0;  
        
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();  
        }
        
        //최대 합 구하기
        for (int i = 1; i <= n; i++) {
            dp[i] = a[i]; 
            for (int j = 1; j < i; j++) {
                if (a[j] < a[i] && dp[i] < dp[j] + a[i]) {
                    dp[i] = dp[j] + a[i];  // 부분 수열의 합
                }
            }
            if (max < dp[i]) {
                max = dp[i];  
            }
        }
        
        System.out.println(max);  
        sc.close();
    }
}
