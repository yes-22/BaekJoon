import java.util.*;

public class Main {
    static int N, M;
    static int[] numbers;
    static List<Integer> sequence = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        Set<Integer> uniqueNumbers = new TreeSet<>(); 
        for (int i = 0; i < N; i++) {
            uniqueNumbers.add(sc.nextInt());
        }
        numbers = uniqueNumbers.stream().mapToInt(Integer::intValue).toArray(); 
        backtracking(0, 0);
        System.out.println(sb.toString());
    }

    // 백트래킹 함수
    static void backtracking(int start, int depth) {
        // 길이가 M인 수열을 완성하면 출력
        if (depth == M) {
            for (int num : sequence) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        // 가능한 수열을 백트래킹으로 생성
        for (int i = start; i < numbers.length; i++) {
            sequence.add(numbers[i]);
            backtracking(i, depth + 1);
            sequence.remove(sequence.size() - 1);
        }
    }
}
