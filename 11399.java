import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N]; //대기 시간을 저장할 리스트 생성

        for(int i =0; i<N; i++){
            arr[i] = scanner.nextInt();
        }

        //대기시간이 짧은 순으로 정렬
        Arrays.sort(arr);

        int time = 0; //사람 별 대기 시간
        int sum = 0;  // 대기시간 총 합

        for(int i = 0; i < N; i++){
            sum += time + arr[i]; //이전 까지 걸린 시간에 i번째 사람 시간 더하기
            time += arr[i]; //누적된 시간에 i 번째 사람 더하기
        }
        System.out.println(sum);
    }
}
