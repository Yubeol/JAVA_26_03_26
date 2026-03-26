import java.util.Scanner;

public class Cal_DutchPay{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.print("배달 음식 더치페이(N빵) 정산기");
        System.out.println("1. 음식 총액을 입력하세요(원): ");
        int foodPrice = scanner.nextInt();

        System.out.println("2. 배달비를 입력하세요(원): ");
        int deliveryFee = scanner.nextInt();

        System.out.println("3. 할인 쿠폰 금액을 입력하세요(원): ");
        int discount = scanner.nextInt();

        System.out.println("4. 함께 먹은 인원수를 입력하세요(명): ");
        int people = scanner.nextInt();

        int totalPrice = foodPrice + deliveryFee - discount;
        int payPerPerson = totalPrice / people;
        int remainder = totalPrice % people;

        System.out.println("\n--- 최종 정산 내역 ---");;
        System.out.println("결제 총액: " + totalPrice + "원");
        System.out.println("1인당 카카오페이로 보낼 금액: " + payPerPerson + "원");
        System.out.println("총무가 떠안을 애매한 잔돈: " + remainder + "원");
        System.out.println("----------------------------");

        scanner.close();
    }
}