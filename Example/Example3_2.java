class Example3_2{
  public static void main(String[] args) {
    int num, a, b ;
    System.out.println("代入と複合代入");
    num = 10;
    System.out.println("\tnum = " + num);
    num += 10;
    System.out.println("\tnum = " + num);
    num /= 4;
    System.out.println("\tnum = " + num);

    a = 0;
    b = 0;

    System.out.println("\nインクリメント\n最初の値");
    System.out.println("\ta = " + a);
    System.out.println("\tb = " + b);

    System.out.println("\n途中の値");
    System.out.println("\t++a = " + ++a);
    System.out.println("\tb++ = " + b++);

    System.out.println("\n最終的な値");
    System.out.println("\ta = " + a);
    System.out.println("\tb = " + b);
  }
}
