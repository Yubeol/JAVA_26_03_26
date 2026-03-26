import java.util.Scanner;

public class TTest3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("2026학년도 1학기 수장 정보를 빈칸으로 분리하여 입력하세요: ");
        System.out.println("(형식: 과목명 학점 목표평점 재수강여부)");
        System.out.println("입력 예시: 객체지향프로그래밍 1 4.5 false");
        System.out.print(">> 입력: ");
        String courseName = scanner.next();
        int credits = scanner.nextInt();
        double targetGpa = scanner.nextDouble();
        boolean isRetake = scanner.nextBoolean();
        System.out.println("\n ---이번 학기 목표 설정 완료 ---");
        System.out.println("1. 과목명: " + courseName);
        System.out.println("2. 학 점: " + credits + " 학점");
        System.out.println("3. 목 표: " + targetGpa + " (A+ 가즈아!)");
        System.out.println("4. 재수강: " + isRetake + " -> " + (isRetake? "이번엔 반드시 C+ 탈출!" : "첫 수강 화이팅!"));
        System.out.println("-----------------------");
        scanner.close();
    }
}
