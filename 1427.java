import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        char[] numList = num.toCharArray(); //numList에 문자를 하나하나 넣어줌

        Arrays.sort(numList); //오름차순으로 정렬

        StringBuilder sb = new StringBuilder(new String(numList));
        sb.reverse(); // 순서를 바꿔준다.

        System.out.print(sb.toString()); //순서가 바뀐 문자열 출력 
        
        scanner.close();
    }
}
