public class StringsEqualOrNot {
    public static void main(String[] args) {
        String a = "anythinG usual happens";
        String b = "anything usual happens";

        if (a.equals(b)) {
            System.out.println("Both Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        System.out.print("when we ignore the lower and upper case of the string : ");

        if (a.equalsIgnoreCase(b)) {
            System.out.println("Both Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }

}
