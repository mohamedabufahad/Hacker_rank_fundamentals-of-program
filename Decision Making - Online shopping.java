import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fp = sc.nextInt(); 
        int fd = sc.nextInt(); 
        int fs = sc.nextInt(); 
        int sp = sc.nextInt();
        int sd = sc.nextInt();
        int ss = sc.nextInt();
        int ap = sc.nextInt();
        int ad = sc.nextInt();
        int as = sc.nextInt();
        int finalFlipkart = (fp - (fp * fd / 100)) + fs;
        int finalSnapdeal = (sp - (sp * sd / 100)) + ss;
        int finalAmazon = (ap - (ap * ad / 100)) + as;
        System.out.println("In Flipkart: Rs." + finalFlipkart);
        System.out.println("In Snapdeal: Rs." + finalSnapdeal);
        System.out.println("In Amazon: Rs." + finalAmazon);
        if (finalFlipkart <= finalSnapdeal && finalFlipkart <= finalAmazon) {
            System.out.println("Choose Flipkart");
        } else if (finalSnapdeal <= finalFlipkart && finalSnapdeal <= finalAmazon) {
            System.out.println("Choose Snapdeal");
        } else {
            System.out.println("Choose Amazon");
        }
    }
}
