package StreamAPILab.performance;

import java.util.List;
import StreamAPILab.data.TestData;

public class CaseB implements PerformanceTest {
    static List<String> names = TestData.names;

    @Override
    public void run() {
        //출력을 제거하고 결과 생성만 수행
        List <String> result = names.stream()
        .filter(name -> name.startsWith("A") && name.length() > 3)
        .map(name -> name.toUpperCase() + " is a name")
        .toList();
        
        //JIT 최적화로 코드가 삭제되는 것을 방지하기 위해 아주 가끔 결과 확인
        if (result.isEmpty() && System.currentTimeMillis() == 0) System.out.println(result);
    }
}