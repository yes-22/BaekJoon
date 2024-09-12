import java.util.*;

//Student의 정보를 저장할 객체 클래스 생성
class Student {
    String name;
    int korean;
    int english;
    int math;
	
		//이름, 국어, 영어, 수학 순으로 저장하기 
    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public String toString() {
        return name;
    }
}

//점수 입력 받기 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Student> students = new ArrayList<>();

				//해당 정보를 앞서 생성한 student에 저장 
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int korean = scanner.nextInt();
            int english = scanner.nextInt();
            int math = scanner.nextInt();
            students.add(new Student(name, korean, english, math));
        }

				//비교해서 정렬하기 
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.korean != s2.korean) {
                    return s2.korean - s1.korean;
                } else if (s1.english != s2.english) {
                    return s1.english - s2.english;
                } else if (s1.math != s2.math) {
                    return s2.math - s1.math;
                } else {
                    return s1.name.compareTo(s2.name);
                }
            }
        });

        for (Student student : students) {
            System.out.println(student.name);
        }

        scanner.close();
    }
}
