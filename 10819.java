import java.util.*;
import java.io.*;
public class Main{
    public static int n;
    public static int[] arr; //정수를 저장할 배열 생성
    public static int[] pre; //순열을 저장할 배열 생성
    
    //이미 한 번 간 경로를 기억하는 배열 생성 
    public static boolean[] visit; 
    public static int result;
    
    public static void dfs(int cnt){
        if(cnt == n) {
            int sum = 0;
            
            //절대값을 계산하는 for문 생성
            for(int i = 0; i < n-1; i++) {
                sum += Math.abs(pre[i] - pre[i+1]);
            }
            result = Math.max(result, sum);
            return;
        }
        
        //이미 선택했던 경로인지를 확인 
        for(int i = 0; i < n; i++) {
            if(!visit[i]){
                pre[cnt] = arr[i];
                visit[i] = true;
                dfs(cnt + 1);
                visit[i] = false;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        pre = new int[n];
        visit = new boolean[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        dfs(0);
        System.out.println(result);
    }
}
