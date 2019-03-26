class Example6_6{
  public static void main(String[] args) {
    check(11);
  }

  public static void check(int i){
    if (i % 2 == 0) {
      System.out.println(i + "は偶数です");
    }else{
      System.out.println(i + "は奇数です");
    }
  }
}
