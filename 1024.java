import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();	
        int L = sc.nextInt();	
        int sum = 0;	

        for(int i = 0; i < L; i++) {
            sum+= i;
        }

        while(true) {
		        //조건을 만족할 경우
            if((N - sum) % L == 0 && (N - sum) / L >= 0) {
                int div = (N - sum) / L;

                for(int i = 0; i < L; i++) {
                    System.out.printf("%d ", div + i);
                }
                return;
            }
            //조건을 만족하지 않을 경우
            else {
                sum += L;
                if(N - sum < 0 || ++L > 100) {	//리스트의 길이가 100보다 긴 경우
                    System.out.println("-1");
                    return;
                }
            }
        }
    }
}
 
