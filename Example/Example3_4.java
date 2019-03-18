class Example3_4{
  public static void main(String[] args) {
    int a = 10, b = 20, c = 10;

    System.out.println("a = 10, b = 20, c = 10");
    System.out.println("true && false は、" + (true && false));
    System.out.println("true || false は、" + (true || false));
    System.out.println("a > 0 && a < b は、" + (a > 0 && a < b));

    System.out.println(); //改行
    System.out.println("a != 10 && a++ < b は、" + (a != 10 && a++ < b));
    System.out.println("a++ は実行されないから、a = " + a);
    System.out.println("c != 10 && c++ < b は、" + (c != 10 & c++ < b));
    System.out.println("c++ は実行されるから、c = " + c);

  }
}
