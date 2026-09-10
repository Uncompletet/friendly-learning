import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {

        // if statement = performs a block of code if its condition is true

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent = false;


        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if(age > 8) {
            System.out.print("Are you a student (true/false): ");
            isStudent = scanner.nextBoolean();
        }

        //GROUP 1
        if(name.isEmpty()){
            System.out.println("You didn't enter your name!");
        }
        else{
            System.out.println("Hello " + name + "!");
        }

        //GROUP 2
        if(age >= 65){
            System.out.println("You are a senior!");
        }
        else if (age >= 18) {
            System.out.println("You are an adult!");
        }
        else if(age < 0){
            System.out.println("You haven't born yet!");
        }
        else if(age == 0){
            System.out.println("You are a baby!");
        }

        else{
            System.out.println("You are a child!");
        }

        //GROUP 3

        if(isStudent) {
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are NOT a student!");
        }

        scanner.close();
    }
}
