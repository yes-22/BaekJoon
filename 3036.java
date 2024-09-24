import java.util.*;

public class Main {
    // 최대공약수를 구하는 함수
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
        return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] rings = new int[N];
        
        for (int i = 0; i < N; i++) {
            rings[i] = sc.nextInt();
        }
        
        // 첫 번째 링을 기준으로 나머지 링은 몇 바퀴를 돌아야 하는지 계산
        for (int i = 1; i < N; i++) {
            int r1 = rings[0];
            int r2 = rings[i];
            
            // 최대공약수를 통해 기약분수로 표현
            int irreducible = gcd(r1, r2);
            
            System.out.println((r1 / irreducible) + "/" + (r2 / irreducible));
        }
        
        sc.close();
    }
}
