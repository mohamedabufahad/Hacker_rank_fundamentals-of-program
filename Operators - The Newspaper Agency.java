import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int c = sc.nextInt(); 
        int fixedCost = 100;
        int revenue = a * b;
        int totalCost = (a * c) + fixedCost;
        int profit = revenue - totalCost;
        System.out.println(profit);
    }
}
