public class VariableScope {

    static int x = 3; //CLASS scope

    public static void main(String[] args){

        // variable scope = where a variable can be accessed

        // Local, a variabel declared inside a method, has a Local scope
        int x = 1;

        doSomething();
    }
    static void doSomething(){
        int x = 2; //LOCAL

        System.out.println(x);
    }
}
