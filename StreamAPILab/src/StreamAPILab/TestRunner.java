package StreamAPILab;

import StreamAPILab.performance.*;

public class TestRunner {
    //반복 횟수와 워밍업 횟수 설정
    static final int ITER = 100000;
    static final int WARMUP = 20000;

    public static void main(String[] args) {
        System.out.println("--- CaseA 측정 시작 ---");
        measure(new CaseA());
        
        //System.out.println("--- CaseB 측정 시작 ---");
        //measure(new CaseB());
    }

    static void measure(PerformanceTest test) {
        //워밍업 (JIT 컴파일러가 최적화할 시간을 줌)
        for (int i = 0; i < WARMUP; i++) {
            test.run();
        }

        long totalTime = 0;
        long maxTime = Long.MIN_VALUE;
        long minTime = Long.MAX_VALUE;

        //본 측정
        for (int i = 0; i < ITER; i++) {
            long beforeTime = System.nanoTime();
            test.run();
            long afterTime = System.nanoTime();

            long duration = afterTime - beforeTime;
            totalTime += duration;
            maxTime = Math.max(maxTime, duration);
            minTime = Math.min(minTime, duration);
        }

        //결과 출력
        System.out.println("Avg: " + (totalTime / ITER) + " ns");
        System.out.println("Max: " + maxTime + " ns");
        System.out.println("Min: " + minTime + " ns");
    }
}