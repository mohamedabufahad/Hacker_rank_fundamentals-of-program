import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n - 1;
        int row = n / 3;
        int col = n % 3;
        System.out.println(row + " " + col);
    }
}
