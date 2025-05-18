import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalBalls = sc.nextInt();   
        int targetRuns = sc.nextInt();  
        int scoredRuns = sc.nextInt();  
        int bowledBalls = sc.nextInt();  
        int totalOvers = totalBalls / 6;
        int fullOvers = bowledBalls / 6;
        int remainingBalls = bowledBalls % 6;
        double oversFinished = fullOvers + (remainingBalls / 10.0);
        double currentRunRate = scoredRuns / oversFinished;
        double totalRunRate = (double) targetRuns / totalOvers;
        System.out.println(totalOvers);
        System.out.printf("%.1f\n", oversFinished);
        System.out.printf("%.1f\n", currentRunRate);
        System.out.printf("%.1f\n", totalRunRate);
        if (currentRunRate > totalRunRate) {
            System.out.println("Eligible to Win");
        } else {
            System.out.println("Not Eligible to Win");
        }
    }
}
