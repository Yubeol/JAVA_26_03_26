import java.util.Scanner;

public class CafeOrder {
    public static void main(String[] args){
        Scanner scanner = new Scanner( System.in, "UTF-8");
        System.out.println("--- 카페 주문 시스템 ---");
        System.out.println("메뉴명, 수량, 단가, 테이크아웃 여부(true/false)를 입력하세요: ");

        String menu = scanner.next();
        int count = scanner.nextInt();
        double price = scanner.nextDouble();
        boolean isTakeOut = scanner.nextBoolean();
        double totalPrice = count * price;

        System.out.println("\n[주문 확인]");
        System.out.println("주문 메뉴: " + menu);
        System.out.println("결제 금액: " + totalPrice + "원");
        System.out.println("포장 여부: " + (isTakeOut? "포장" : "메장 식사"));

        scanner.close();
    }
}
