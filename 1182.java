import java.util.*;

public class Main {
    static int result;
    static int s;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        s = sc.nextInt();
        result = 0;
        
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
        
        // 비트마스크 알고리즘으로 모든 경우의 수 생성
        for (int mask = 1; mask < (1 << n); mask++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum += data[i];
                }
            }
            // 계산된 값이 s와 같으면 result를 증가시킨다
            if (sum == s) {
                result++;
            }
        }
        
        System.out.println(result);
    }
}
