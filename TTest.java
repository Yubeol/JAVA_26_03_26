import java.io.IOException;

public class TTest {
    public static void main(String[] arg) throws IOException{
        System.out.print("알파벳 하나를 입력하고 Enter를 누르세요: ");
        int keyCode = System.in.read();
        System.out.println("==========================");
        System.out.println("입력받은 바이트(숫자) 값: " + keyCode);
        System.out.println("문자로 다시 변환한 값: " + (char)keyCode);
    }
}
