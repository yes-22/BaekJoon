import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // N개의 수

        int numList[] = new int[N]; // 입력 받은 수 저장

        for (int i = 0; i < N; i++) {
            numList[i] = scanner.nextInt(); // 키보드에서 입력받은 정수 저장
        }

        Arrays.sort(numList);

        for (int i = 0; i < N; i++) {   //N번째 숫자까지 차례대로 출력 
            System.out.print(numList[i] + "\n");
        }
        scanner.close();
    }
}
