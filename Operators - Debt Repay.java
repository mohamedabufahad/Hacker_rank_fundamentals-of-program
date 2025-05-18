import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float principal = sc.nextFloat();
        float rate = sc.nextFloat();
        float years = sc.nextFloat();
        float interest = (principal * rate * years) / 100;
        float amount = principal + interest;
        float discount = (2 * interest) / 100;
        float finalAmount = amount - discount;
        System.out.printf("%.2f\n", interest);
        System.out.printf("%.2f\n", amount);
        System.out.printf("%.2f\n", discount);
        System.out.printf("%.2f\n", finalAmount);
    }
}
