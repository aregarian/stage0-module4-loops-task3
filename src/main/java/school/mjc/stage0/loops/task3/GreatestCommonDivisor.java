package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int greatest = first >= second ? first : second;
        int gDC = 1;

        for (int i = 1; i <= greatest; i++) {
            if (first % i == 0 && second % i == 0) {
                gDC = i;
            }
        }
        System.out.println(gDC);
    }
}
