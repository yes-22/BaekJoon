import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int count = 0;
        
        //5로 최대한 나누기
        while (N > 0) {
            if (N % 5 == 0) {
                count += N / 5;
                N = 0;
                break;
            }
            //더 이상 5로 나누어지지 않을 시 3을 제거 
            N -= 3;
            count++;
        }
        
        //5와 3으로 나누어지지 않을 경우 -1 출력 
        if (N < 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
    sc.close();
}
