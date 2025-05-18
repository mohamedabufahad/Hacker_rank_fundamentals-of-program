import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        float cgpaInput = sc.nextFloat();
        char grade = sc.next().charAt(0);
        float cgpa = (int)(cgpaInput * 100) / 100.0f;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("Grade: " + grade);
    }
}
