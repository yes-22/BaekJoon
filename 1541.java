import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        // "-" 기호를 기준으로 분리하기
        String[] parts = s.split("-");
        
        int result = 0;

        // "+" 기호들을 먼저 계산
        String[] plus = parts[0].split("\\+");
        for (String num : plus) {
            result += Integer.parseInt(num);
        }

        // "-" 기호들 계산
        for (int i = 1; i < parts.length; i++) {
            String[] minus = parts[i].split("\\+");
            // 합계 계산
            int sum = 0;
            for (String num : minus) {
                sum += Integer.parseInt(num);
            }
            result -= sum;
        }

        System.out.println(result);
    }
}
