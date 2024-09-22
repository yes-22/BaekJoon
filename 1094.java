import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        int count = 0;
        int stick = 64;

        // 막대를 자르면서 반복
        while (X > 0) {
            if (stick > X) { //막대가 더 클 경우 반으로 나눔
                stick /= 2;
            } else {  //X가 더 클 경우 X에서 막대의 길이를 뻄
                X -= stick;
                count++;
            }
        }

        // 막대의 수 출력
        System.out.println(count);
        
        scanner.close();
    }
}
