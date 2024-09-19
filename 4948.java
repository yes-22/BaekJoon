import java.util.*;

public class Main {

    public static void main(String[] args) {            
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt(); 
            if (n == 0) break;  
            
            int count = 0;
            boolean[] arr = new boolean[(2 * n) + 1]; 
            
            // 에라토스테네스의 체 알고리즘을 통해 소수 찾기
            arr[0] = arr[1] = true;  
            for (int i = 2; i <= Math.sqrt(2 * n); i++) {
                if (!arr[i]) { 
                    for (int j = i * i; j <= 2 * n; j += i) {
                        arr[j] = true; 
                    }
                }
            }

            // n보다 크고 2n보다 작거나 같은 소수 개수를 셈
            for (int i = n + 1; i <= 2 * n; i++) {
                if (!arr[i]) {
                    count++;
                }
            }

            // 소수 개수 출력
            System.out.println(count);
        }
        
        sc.close();  
    }
}
