import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int dp[] = new int[N];
		Arrays.fill(dp, 1);
		int box = 0;
		
		//i와 j를 비교해 i기 더 클 경우 1을 더함 
		for(int i=1; i<N; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] > arr[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1); //크기를 비교해 더 큰 값을 저장
				}
			}
			box = Math.max(dp[i], box); //max 값을 box에 저장 
		}
		
		System.out.println(box);
	}

}
