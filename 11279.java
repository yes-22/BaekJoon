import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	
	  //최소 힙을 설정후 큰 값이 우선순위로 나올 수 있게 Collections.reverseOrder() 
		PriorityQueue<Integer> p = new PriorityQueue<Integer>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			if(x == 0) {
				if(p.isEmpty()) sb.append(0).append("\n");  //큐가 비어있으므로 0 출력 
				else {
					sb.append(p.poll()).append("\n");   // 최대값 출력 후 제거
				}
			}else {
				p.offer(x);   // x가 0이 아닌 경우 최대 힙에 값 삽입
			}
		}
		System.out.println(sb);
	}

}
