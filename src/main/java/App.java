public class App {

    public static void main(String[] args) {
        printArgs(args);
    }

    public static void printArgs(String[] args) {
        System.out.println(new App().getGreeting());
        for (String st: args) {
            System.out.println(st);
        }
    }

    public String getGreeting() {
        return "Hello world.";
    }

    public int addTwo(int num) {
        return 2 + num;
    }
}

//