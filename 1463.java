import java.util.Scanner;
import java.lang.Math;
import java.io.*; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // 정수 N 입력 받기

        int[] count = new int[num + 1]; //최소 횟수 저장
        count[1] = 0; //1을 넣었을 땐 횟수가 0 

        for (int i = 2; i <= num; i++) {
            count[i] = count[i - 1] + 1; //1을 뺄 경우

            if (i % 2 == 0) {  //2로 나누어 떨어지는 경우
                count[i] = Math.min(count[i], count[i / 2] + 1); //2로 나누는게 빠른지 아닌지 비교
            }

            if (i % 3 == 0) {   // 3으로 나누어 떨어질 경우
                count[i] = Math.min(count[i], count[i / 3] + 1); //3으로 나누고 빠른지 아닌지 비교 
            }
        }

        System.out.println(count[num]);
        scanner.close();
    }
}
