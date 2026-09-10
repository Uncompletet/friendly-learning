public class Variables {

    public static void main(String[] args){

        System.out.println("I like pizza!");
        System.out.println("It's very tasty!");


        // THIS IS MY FIRST JAVA PROGRAM
        //      Primitive           vs         Reference
        //      ----------------------------------------
        //      int     (whole numbers)        string   (Series of characters)
        //      double  (uses decimals)        array
        //      char    (single characters)    object
        //      boolean (true or false)



        int age = 30;
        int year = 2025;
        int quantity = 1;

        double pizza_price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = true;
        boolean isOnline = true;

        System.out.println("The pizza costs " + currency + pizza_price);

        /* if statements for future

        if(isStudent){
            System.out.println("You are a student!");
        }
        else {
            System.out.println("You are NOT a student!");
        }
         */

        String name = "Corven";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        double car_price = 19999.99;
        String color = "Red";

        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + car_price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("The " + car + " is not for sale");
        }

        System.out.println("Your email is " + email);

        // Homework

        String username = "Corven";
        int gta = 6;
        double pi = 3.14159;
        char gender = 'M';
        boolean isAdmin = true;






    }
}
