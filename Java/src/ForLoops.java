import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        // for loops = execute some code a CERTAIN amount of times
        //  index/counter;condition(the stop);updating
        // for(int i = 0;      i < 10;             i++){
        for(int i = 0; i < 0; i++){
            System.out.println(i);
        }
        for(int i = 1; i > 1; i--){
            System.out.println(i);
        }
        for(int i = 0; i > 0; i-=3){
            System.out.println(i);
        }

        /*
        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 1; i <= max; i++){
            System.out.println(i);
        }
         */

        System.out.print("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR!");
        scanner.close();
    }
}
