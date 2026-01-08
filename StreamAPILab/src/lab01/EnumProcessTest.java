package lab01;

//열거형 정의
enum ProcessStatus {
	STARTED, COMPLETED, FAILED
}

public class EnumProcessTest {
	public static void main(String[] args) {
		// 1. 정상적인 할당
		ProcessStatus status = ProcessStatus.STARTED;
		System.out.println("Current status: " + status);

		// 2. 컴파일 에러 발생 예시
//      status = "Started";  // Error: Type mismatch (String cannot be converted to ProcessStatus)
		// status = 100; // Error: Type mismatch (int cannot be converted to
		// ProcessStatus)

		// 3. 조건문 활용
		if (status == ProcessStatus.STARTED) {
			System.out.println("프로세스가 시작되었습니다.");
		}
		
		System.out.println(ProcessStatus.values()[0]);
		
	}
}