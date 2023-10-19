package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number){
        int sum = 0;
        for (int i = number; number !=0; i++) {
            sum = sum + (number % 10);
            number = number /10;
        }
        System.out.println(sum < 0 ? sum * (-1) : sum);

    }
}
