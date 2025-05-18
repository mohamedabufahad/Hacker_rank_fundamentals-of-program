import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalFriends = sc.nextInt();
        int totalTeams = sc.nextInt();
        int friendsPerTeam = totalFriends / totalTeams;
        int leftOut = totalFriends % totalTeams;
        System.out.println("The number of friends in each team is " + friendsPerTeam + " and left out is " + leftOut);
    }
}
