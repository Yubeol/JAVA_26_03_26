public class SpeedLimit {
    public static void main(String[] args){
        //상수: 고속도로 제한 속도(km/h)
        final int MAX_SPEED = 110;
        int currentSpeed = 125;
        boolean isOverSpeed = currentSpeed > MAX_SPEED;

        System.out.println("고속도로 제한 속도: "+ MAX_SPEED + "km/h");
        System.out.println("현제 주행 속도: "+ currentSpeed + "km/h");
        System.out.println("속도 위반 (여부): "+ isOverSpeed);
    } 
}