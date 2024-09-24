import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();  // 시작 범위
        int N = sc.nextInt();  // 끝 범위

        // 소수 여부를 저장하는 배열
        boolean[] isPrime = new boolean[N + 1];

        // 배열 초기화: 처음에는 모두 소수(true)로 가정
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체 알고리즘
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;  // 소수가 아닌 수를 false로 변경
                }
            }
        }

        // M 이상 N 이하의 소수를 출력
        for (int i = M; i <= N; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
