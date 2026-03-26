public class TypeConversion {
    public static void main(String[]args){
        byte b = -1;
        char c = (char)b; // 강제 형변환 필수
        int i = c; //char를 다시 숫자로 확인

    System.out.println("byte 값: " +b); // -1
    System.out.println("char를 int로 출력: " + i); // 65535
    }
}
