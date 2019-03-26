class Example6_7{
  public static void main(String[] args) {
    int answer = calc(10);
    System.out.println("戻り値は" + answer + "です");
  }
  public static int calc(int n){
    int ans = 0;
    for(int i = 1; i <= n; i++){
      ans += 1;
    }
    return ans;
  }
}
