import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCoins = sc.nextInt();
        int benPercent = sc.nextInt();
        int blackbeardPercent = sc.nextInt();
        int benShare = (benPercent * totalCoins) / 100;
        int remainingAfterBen = totalCoins - benShare;
        int blackbeardShare = (blackbeardPercent * remainingAfterBen) / 100;
        int remainingForPirates = remainingAfterBen - blackbeardShare;
        int pirateShare = remainingForPirates / 3;
        System.out.println(benShare);
        System.out.println(blackbeardShare);
        System.out.println(pirateShare);
    }
}
