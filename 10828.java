import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //정수를 저장할 스택 생성
        Stack<Integer> stack = new Stack<>();
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            String[] parts = command.split(" ");
            //명령어를 cmd에 저장 
            String cmd = parts[0];
            
            //cmd에 입력 받은 문자열에 따라 switch 문 실행
            switch (cmd) {
		            //push를 입력 받으면 스택에 값을 넣음
                case "push":
                    int X = Integer.parseInt(parts[1]);
                    stack.push(X);
                    break;
                    
                // pop을 입력 받으면 비었을 시 -1을 출력, 비어있지 않으면 가장 위의 값을 뺌
                case "pop":
                    if (stack.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }
                    break;
                
                //size를 입력 받으면 스택의 크기를 출력
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                    
                //empty를 입력 받으면 비어있는지 확인
                case "empty":
                    if (stack.isEmpty()) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                    
                //top을 입력 받으면 가장 위의 값을 출력
                case "top":
                    if (stack.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(stack.peek()).append("\n");
                    }
                    break;
            }
        }
        
        System.out.print(sb.toString());
    }
}
