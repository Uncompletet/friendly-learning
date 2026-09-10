public class printf {
    public static void main(String[] args) {

        // printf() = is a method used to format output

        // %[flags][width[.precision][specifier-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        // We need to manuanly insert new lines with \n because we use printf() and not println()
        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %.0f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.println(); // To separate in console. Ignore.

        System.out.printf("%s is %d years old\n", name, age);

        // [flags]

        System.out.println(); // To separate in console. Ignore.
        System.out.println("################");
        System.out.println("##### FLAGS ####");
        System.out.println("################");
        System.out.println(); // To separate in console. Ignore.

        // + = output a plus if positive
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive



        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;
        double price4 = -75.12;
        double price5 = 75.12;

        System.out.printf("%+.2f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%(.2f\n", price3);
        System.out.printf("% .2f\n", price4);
        System.out.printf("% .2f\n", price5); //Duplicate to show the difference

        // [width]

        System.out.println(); // To separate in console. Ignore.
        System.out.println("################");
        System.out.println("##### WIDTH ####");
        System.out.println("################");
        System.out.println(); // To separate in console. Ignore.

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        // Play around in with these as you want. Nothing can break. If you arent stupid

        System.out.printf("%04d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%4d\n", id4);

        System.out.println(); // To separate in console. Ignore.
        System.out.println("################");
        System.out.println("##### END ######");
        System.out.println("################");




    }
}
