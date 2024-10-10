import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();
            if (number == 0) {
                stack.pop();  // 가장 최근에 입력된 수를 제거
            } else {
                stack.push(number);  // 스택에 수 추가
            }
        }

        int sum = 0;
        for (int num : stack) {
            sum += num;  // 스택에 남은 수들의 합을 계산
        }

        System.out.println(sum);
    }
}
