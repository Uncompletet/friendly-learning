import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

     // className objectName
        Scanner   scanner = new Scanner(System.in); // Our Scanner can read system input

        System.out.print("Enter you name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);
        if(isStudent){
            System.out.println("You are enrolled as a student");
        }
        else{
            System.out.println("You are NOT enrolled");
        }

        // COMMON ISSUES

        System.out.print("Enter your age: ");
        int test_age = scanner.nextInt();
        scanner.nextLine(); // Fixes the new line input buffer so that color doesn't use test_age as the answer

        System.out.print("Enter your facorite color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + test_age + " years old");
        System.out.println("You like the color " + color);

        scanner.close(); // Needed so it doesnt stay open uselessly
    }
}
