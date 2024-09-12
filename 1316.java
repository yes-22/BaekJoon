import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 단어의 개수 입력 받기
        int N = scanner.nextInt();
        scanner.nextLine();

        int count = 0; // 그룹 단어의 개수

        // 단어들을 순회하며 그룹 단어인지 확인
        for (int i = 0; i < N; i++) {
            String word = scanner.nextLine();
            boolean[] check = new boolean[26]; //알파벳이 따로 나타났는지를 확인 
            boolean group = true;

            for (int j = 0; j < word.length(); j++) {
                int index = word.charAt(j) - 'a';
                if (check[index]) { 
                    if (word.charAt(j) != word.charAt(j - 1)) { //알파벳이 연속적이지 않음 
                        group = false; 
                        break;
                    }
                } else { 
                    check[index] = true; // 알파벳이 처음 나타난 경우 
                }
            }
            if (group) count++;
        }

        // 그룹 단어의 개수 출력
        System.out.println(count);

        scanner.close();
    }
}
