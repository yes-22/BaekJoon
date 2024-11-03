import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int[] s = new int[n];
        
        // 목표 수열을 배열에 저장
        for (int i = 0; i < n; i++) {
            s[i] = Integer.parseInt(br.readLine());
        }
        
        Stack<Integer> stack = new Stack<>();
        int current = 1; // 스택에 넣을 수 
        boolean isPossible = true;
        
        for (int num : s) {
            // 스택에 현재 수까지  push
            while (current <= num) {
                stack.push(current++);
                sb.append("+\n");
            }
            
            // 스택 최상단이 목표 수와 같다면 pop
            if (stack.peek() == num) {
                stack.pop();
                sb.append("-\n");
            } else {
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            System.out.print(sb);
        } else {
            System.out.println("NO");
        }
    }
}
