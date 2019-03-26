class Example3_5{
  public static void main(String[] args) {
    int a = 10;
    double d;

    System.out.println("暗黙の型変換");
    System.out.println("\t10.0 + 1は、" + (10.0 + 1));
    d = a;
    System.out.println("\ta = " + a);
    System.out.println("\td = " + d);

    System.out.println("\n明示的な型変換");
    a = (int)1.5;
    System.out.println("\ta = " + a);

    System.out.println();
    a = 10 / 8 * 10;
    System.out.println("\t10 / 8 * 10 = " + a);
    d = 10 / 8.0 * 10;
    System.out.println("\t10 / 8.0 * 10 = " + d);
    a = 10 / (int)8.0 * 10;
    System.out.println("\t10 / (int)8.0 * 10 = " + a);
    a = (int)((10 / 8.0) * 10);
    System.out.println("\t(int)(10 / 8.0 * 10) = " + a);
  }
}
