import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 100 && n <= 999) {
            int middleDigit = (n / 10) % 10; 
            if (middleDigit % 3 == 0) {
                System.out.println("Trendy Number");
            } else {
                System.out.println("Not a Trendy Number");
            }
        } else {
            System.out.println("Invalid Number");
        }
    }
}
