public class Cal_Assignment {
    public static void main(String[]args){
        System.out.println("--- 이번 달 생활비 계좌 내역 ---");

        int balance = 300000;
        System.out.println("1. 부모님 용돈 입금: " + balance + "원");

        balance += 150000;
        System.out.println("2. 주말 알바비 입금 (누적 잔액): " + balance + "원");

        balance -=  45000;
        System.out.println("3. 전공 교재 구매 (남은 잔액): " + balance + "원");

        balance /= 4;
        System.err.println("4. 남은 잔액을 4주로 나눈 1주일 예산: " + balance + "원");

        balance %= 10000; // 풀어쓰면: balance = balance % 10000;
        System.err.println("5. 1주 예산에서 1만 원 단위로 모두 출금 후 통장에 남은 잔돈: " + balance + "원");
    }
}
