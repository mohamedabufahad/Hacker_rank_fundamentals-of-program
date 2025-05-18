import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int perimeter = 2 * (length + breadth);
        int area = length * breadth;
        System.out.println("The required length is " + perimeter + " m");
        System.out.println("The required area of carpet is " + area + " sqm");
    }
}
