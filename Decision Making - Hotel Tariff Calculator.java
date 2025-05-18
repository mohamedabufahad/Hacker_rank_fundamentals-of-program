import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int rentPerDay = sc.nextInt();
        int daysStayed = sc.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Invalid Input");
            return;
        }
        double totalCost;
        if ((month >= 4 && month <= 6) || (month == 11 || month == 12)) {
            totalCost = rentPerDay * daysStayed * 1.2; // 20% increase
        } else {
            totalCost = rentPerDay * daysStayed;
        }
        System.out.println((int) totalCost);
    }
}
