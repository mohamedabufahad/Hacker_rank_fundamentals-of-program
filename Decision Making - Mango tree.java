import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int treeNumber = sc.nextInt();
        boolean isFirstRow = treeNumber >= 1 && treeNumber <= cols;
        boolean isFirstCol = treeNumber % cols == 1;
        boolean isLastCol = treeNumber % cols == 0;
        if (isFirstRow || isFirstCol || isLastCol) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
