import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int K = sc.nextInt();
        
        // K개의 숫자를 가능한 균등하게 분배
        int q = S / K;  // 몫
        int r = S % K; // 나머지
        
        // 최대 곱을 저장할 변수
        long max = 1;
        
        // 나머지가 있는 경우 그만큼의 숫자를 분배 및 곱하기 
        for (int i = 0; i < K; i++) {
            if (i < r) {
                max *= (q+ 1); // 몫+1인 숫자들을 곱함
            } else {
                max *= q; // 나머지는 몫인 숫자들을 곱함
            }
        }
        
        System.out.println(max);
    }
}
