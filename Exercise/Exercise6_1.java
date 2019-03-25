class Exercise6_1{
  public static void main(String[] args) {
    int n = 10;
    int total = 0;
    for(int i = 0; i <= n; i++){
      total += i;
    }
    System.out.println("1から" + n + "までの整数の合計は" + total + "です");
    totalNumber(10);
    totalNumber(100);
  }
  public static void totalNumber(int n){
    int total = 0;
    for(int i = 1; i <= n; i++){
      total += i;
    }
    System.out.println("1から" + n + "までの整数の合計は" + total + "です");
  }
}
