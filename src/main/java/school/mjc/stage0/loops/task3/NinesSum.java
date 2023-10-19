package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int number = 1;
        int nine = 9;
        for (int i = 1; i <= lengthOfLastNumber; i++) {

            sum = sum + number * nine;
            number = (number * 10) + 1;
        }
        System.out.println(sum);

    }
}
