import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int yearOfPassing = sc.nextInt();
        int familyIncome = sc.nextInt();
        int arrears = sc.nextInt();
        float scholarshipMarks = sc.nextFloat();
        float attendance = sc.nextFloat();
        boolean baseEligibility = (
            yearOfPassing >= 2021 &&
            age >= 18 && age < 21 &&
            ((arrears <= 2 && scholarshipMarks >= 60 && attendance >= 80) ||
            (arrears > 2 && scholarshipMarks >= 80 && attendance >= 90))
        );
        if (baseEligibility) {
            if (familyIncome <= 200000) {
                System.out.println("Eligible");
            } else if (familyIncome > 200000 && familyIncome < 250000) {
                System.out.println("Partially Eligible");
            } else {
                System.out.println("Not Eligible");
            }
        } else {
            System.out.println("Not Eligible");
        }
    }
}
