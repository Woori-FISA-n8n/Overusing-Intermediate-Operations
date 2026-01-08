package lab01;

public class FinalProcessTest {
    // 1. 상수 정의 (열거형 대신 static final 사용)
    public static final String STARTED = "STARTED";
    public static final String COMPLETED = "COMPLETED";
    public static final String FAILED = "FAILED";

    public static void main(String[] args) {
        // 2. 정상적인 할당
        String status = STARTED;
        System.out.println("Current status: " + status);

        // 3. 컴파일 에러가 발생하지 않는 위험한 상황 (Enum과 대조되는 부분)
        // 아래 코드들은 문법적으로 'String'이므로 컴파일 에러가 발생하지 않습니다.
        //status = "Started";  // 오타가 있어도 유효함 (논리적 오류 발생)
        //status = "100";      // 전혀 상관없는 문자열도 할당 가능
        status = COMPLETED;
        System.out.println(status);
        
        // 4. 조건문 활용
        if (status.equals(STARTED)) {
            System.out.println("프로세스가 시작되었습니다.");
        }
    }
}