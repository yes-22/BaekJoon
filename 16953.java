import java.io.*;
import java.util.*;

public class Main {
    static long a, b;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //a와 b를 입력 받음
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
        
        System.out.println(bfs());
    }
    
    static int bfs() {
        Queue<Long> queue = new LinkedList<>();
        queue.add(a);
        int count = 0;
        
        while (!q.isEmpty()) {
            count++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                long p = queue.poll();
                //p와 b가 같으면 count 반환
                if (p == b) {
                    return count;
                }
                //p가 b보다 크다면 넘어감 
                if (p > b) {
                    continue;
                }
                //2를 곱하는 경우
                queue.add(p * 2);
                //1을 수의 가장 오른쪽에 추가하는 경우
                queue.add(p * 10 + 1);
            }
        }
        return -1;
    }
}
