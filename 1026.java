import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // 배열 A와 B 생성
        int[] A = new int[N];
        Integer[] B = new Integer[N]; //B는 내림차순 정렬을 위해 Integer로 선언 
        
        // 배열 A와 B에 값 입력
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        
        // 배열 A는 오름차순으로 정렬
        Arrays.sort(A);
        
        // 배열 B는 내림차순으로 정렬
        Arrays.sort(B, Collections.reverseOrder());
        
        // S의 최솟값 계산
        int S = 0;
        for (int i = 0; i < N; i++) {
            S += A[i] * B[i];
        }
        
        System.out.println(S);
        
        sc.close();
    }
}
