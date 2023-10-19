package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int sum = 0;
        int sum1 = 1;
        for (int i = 0; i < lastFibonacci; i++) {
            System.out.println(sum);

            int sum2 = sum1 +sum;
            sum = sum1;
            sum1 = sum2;
        }
    }
}
