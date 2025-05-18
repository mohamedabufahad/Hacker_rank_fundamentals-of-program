import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int startX = 3;
        int startY = 4;
        double distance = Math.sqrt(Math.pow(x - startX, 2) + Math.pow(y - startY, 2));
        int hops = Math.round((float) distance);
        System.out.println(hops);
    }
}
