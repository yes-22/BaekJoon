import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        //학생 정보를 입력받을 배열 설정 
        String[][] students = new String[n][4];
        
        //이름, 일, 월, 연도 순으로 입력받기
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            students[i][0] = parts[0]; 
            students[i][1] = parts[1];
            students[i][2] = parts[2]; 
            students[i][3] = parts[3];
        }
        
        Arrays.sort(students, new Comparator<String[]>() {
            @Override
            public int compare(String[] a, String[] b) {
		            //연도 비교 후 정렬
                int year = Integer.parseInt(a[3]) - Integer.parseInt(b[3]);
                if (year != 0) {
                    return year;
                }
                //월 비교 후 정렬 
                int month = Integer.parseInt(a[2]) - Integer.parseInt(b[2]);
                if (month != 0) {
                    return month;
                }
                //일 비교 
                return Integer.parseInt(a[1]) - Integer.parseInt(b[1]);
            }
        });
        
        System.out.println(students[n-1][0]); //가장 나이가 어린 사람
        System.out.println(students[0][0]);  // 가장 나이가 많은 사람 
        
        scanner.close(); 
    }
}
