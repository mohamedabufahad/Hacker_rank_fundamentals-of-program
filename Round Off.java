import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float value = sc.nextFloat();
        int intValue = (int) value;
        int ceilValue = (int) Math.ceil(value);
        int floorValue = (int) Math.floor(value);
        System.out.println(intValue);
        System.out.println(ceilValue);
        System.out.println(floorValue);
    }
}
