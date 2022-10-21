public class ValuesOfDataTypes {
    static int a;
    static boolean b; // variable or data members or functions can not be modified again by using
    static char c; // static function Static variables are initialized only once So it is taking
    static float d; // default values
    static double e;
    static long f;
    static short g;
    static byte h;

    static void display() {
        System.out.println("boolean (Initial Value) = " + b);
        System.out.println("byte (Initial Value) = " + h);
        System.out.println("short (Initial Value) = " + g);
        System.out.println("int (Initial Value) = " + a);
        System.out.println("long (Initial Value) = " + f);
        System.out.println("float (Initial Value) = " + d);
        System.out.println("double (Initial Value) = " + e);
    }

    public static void main(String[] args) {
        display(); // static method can be called directly without objects

    }

}
