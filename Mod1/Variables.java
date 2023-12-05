public class Variables { // a class
  public static void main(String[] args) {  // main method
    // code
    int dogCount = 94;
    int catCount = 112;
    int petCount = dogCount + catCount;
    System.out.println(petCount);

    byte b = 56;
    short s = 1024;
    int i = 314;
    long lng = -256;

    /* The following assignments fail.
    b = 1024;       // value is too big for a byte
    s = 75000;      // too big for a short
    i = 3000000000; // too big for an int
    */

    float f = 3.14f;
    double d = 3.14;
  }

}
