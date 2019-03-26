class Exercise3_4{
  public static void main(String[] args) {
    int a = 50, b = 9;
    System.out.println("a は負の数だ\t\t\t" + (a<0));
    System.out.println("a は偶数だ\t\t\t" + ((a % 2) == 0) );
    System.out.println("a は b の倍数だ\t\t\t" + ((a % b) == 0) );
    System.out.println("a は b で割ると5以上あまる\t" + ((a % b) >= 5) );
    System.out.println("a は奇数かまたは 5 の倍数だ\t" + ((a % 2) == 1 || (a % 5) == 0) );
  }
}
