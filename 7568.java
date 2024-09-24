import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
 
		int[][] arr = new int[N][2]; //몸무게와 키를 저장할 배열 생성
 
		for(int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();	// 몸무게 
			arr[i][1] = sc.nextInt();	//키 
		}
		
		
		for(int i = 0; i < N; i++) {
			int rank = 1;
			
			//다른 사람과 비교
			for(int j = 0; j < N; j++) {
				if(i == j) continue;   // 자기 자신의 경우는 제외
				//몸무게와 키가 둘 다 작을 경우 순위를 증가
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}
			}
 
			System.out.print(rank + " ");
		}
 
	}
}
