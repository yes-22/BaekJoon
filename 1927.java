import java.io.*;
import java.util.*;

public class Main{
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	    int N = Integer.parseInt(br.readLine());

	    for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            
            if (x == 0) {
                // 0이 입력되면 최소값 출력 후 제거
                if (minHeap.isEmpty()) {
                    System.out.println(0); // 배열이 비어있으면 0 출력
                } else {
                    System.out.println(minHeap.poll()); // 최소값 출력 후 제거
                }
            } else {
                // 자연수 입력 시 힙에 추가
                minHeap.offer(x);
            }
        }
    }
}
