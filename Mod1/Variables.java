public class Variables { // a class
  public static void main(String[] args) {  // main method
    // code
    int dogCount = 94;
    int catCount = 112;
    int petCount = dogCount + catCount;
    System.out.println(petCount);

    // DATA TYPES
    byte by = 56;
    short sh = 1024;
    int in = 314;
    long lngg = -256;

    /* The following assignments fail.
    by = 1024;       // value is too big for a byte
    sh = 75000;      // too big for a short
    in = 3000000000; // too big for an int
    */

    // whole number types
    byte b = 8;
    short s = 16;
    int i = 32;   // int literal
    long lng = 64L; // long literal

    // widening conversions (allowed)
    s = b;    // a byte fits in a short
    i = s;    // a short fits in an int
    lng = i;  // an int fits in a long
    lng = 32; // `32` is an integer literal, it fits in a long

    // narrowing conversions (not allowed)
    // b = s;   // compiler error: cannot convert from short to byte
    // s = i;   // compiler error: cannot convert from int to short
    // i = lng; // compiler error: cannot convert from long to int

    // floating-point types
    float f = 32.0f; // float literal
    double d = 64.0; // double literal

    // widening conversation (allowed)
    d = f;   // a float fits in a double
    f = i;   // an int fits in a float
    d = lng; // a long fits in a double

    // narrowing conversions (not allowed)
    // i = f;   // compiler error: cannot convert from float to int
    // f = d;   // compiler error: cannot convert from double to float
    // lng = d; // compiler error: cannot convert from double to long

    char a = 'a';
    char x = 'X';
    char one = '1'; // the character '1', not the value 1!
    char singleQuote = '\''; // single quote
    char newLine = '\n';     // the newline character (added by pressing Enter), not the letter n
    char escape = '\\';      // the escape character must escape itself

    /*
        public class Strings {

        public static void main(String[] args) {
            System.out.println("hello strings");
        }
    }
  System.out.println("hello strings");
     */
  }

}
