public class NameUsingCommandLine {
    public static void main(String[] args) {

        // arguments that are supplied to java program during runtime are called command
        // line arguments
        for (int i = 0; i < args.length; i++) {
            System.out.println("Your Entered name is : " + args[i]);
        }

    }
}
