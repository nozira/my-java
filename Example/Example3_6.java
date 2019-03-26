public class Example3_6{
  public static void main(String[] args) {
    //Unicode では'\u0061'
    char c = 'a';
    byte b = (byte)c;
    short s = (short)c;
    int i = c;
    long l = c;
    float f = c;
    double d = c;

    System.out.println(b);
    System.out.println(s);
    System.out.println(i);
    System.out.println(l);
    System.out.println(f);
    System.out.println(d);

    c = (char)b;
    System.out.println(c);
    c = (char)s;
    System.out.println(c);
    c = (char)i;
    System.out.println(c);
    c = (char)l;
    System.out.println(c);
    c = (char)f;
    System.out.println(c);
    c = (char)d;
    System.out.println(c);

  }
}
