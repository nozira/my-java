class Example2_2 {
  public static void main(String[] args) {
    byte a = 1;
    short b = 123;
    int c = 12345678;
    long d = 1234567890123456789L;
    float e = 123.56F;
    double f = 123.45678;
    boolean g = true;
    char h = '楽';
    String i = "苦あれば楽あり";

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    System.out.println(g);
    System.out.println(h);
    System.out.println(i);

    int x,y;
    x = 10;
    y = x;

    System.out.println(x);
    System.out.println(y);
    x = x + y + 5;
    System.out.println(x);
    System.out.println(y);
    double rand;
    rand = Math.random();
    System.out.println(rand);
  }
}
