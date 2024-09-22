import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();

        // 접미사 배열 생성
        int length = S.length();
        String[] arr = new String[length]; //단어 크기 만큼의 배열을 생성 

        for (int i = 0; i < length; i++) {
            arr[i] = S.substring(i); //첫번째 문자부터 제거하며 문자열을 잘라서 저장 
        }

        Arrays.sort(arr);

        // 배열 출력
        for (String i : arr) {
            System.out.println(i);
        }
    }
}
