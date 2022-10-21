public class CommandLineArguments {
    public static void main(String[] args) {
        int sum = 0;

        int invalid = 0;
        System.out.println("Calculating sum of integers using command line arguments");

        for (int i = 0; i < args.length; i++) {
            try {
                sum += Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                invalid++;
            }
        }

        System.out.println("Total arguments input are : " + args.length); // If we pass invalid integer value as command
        // line arguments above java program fails
        // to calculate the sum and throws
        // exception.
        System.out.println("Total Invalid integers are : " + invalid);
        System.out.println("Sum of integers are " + sum);
    }

}
