import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        number = Math.abs(number); 
        int firstDigit = number / 1000;
        int lastDigit = number % 10;
        int result = firstDigit + lastDigit;
        System.out.println(result);
    }
}
