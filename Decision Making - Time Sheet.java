import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hours = new int[7];
        for (int i = 0; i < 7; i++) {
            hours[i] = sc.nextInt();
        }
        int totalSalary = 0;
        for (int i = 0; i < 7; i++) {
            int dailyHours = hours[i];
            int basePay = 0;
            if (dailyHours <= 8) {
                basePay = dailyHours * 100;
            } else {
                basePay = (8 * 100) + ((dailyHours - 8) * 115); 
            }
            if (i == 0) { 
                basePay += (basePay * 50) / 100;
            } else if (i == 6) { 
                basePay += (basePay * 25) / 100;
            }
            totalSalary += basePay;
        }
        System.out.println(totalSalary);
    }
}
