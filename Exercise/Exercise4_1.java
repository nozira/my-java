class Exercise4_1{
  public static void main(String[] args) {
    int a = (int) (Math.random() * 1000);

    System.out.println("aは、" + a);

    if((a % 2) == 1){
      System.out.println("奇数です。");
    }else{
      System.out.println("偶数です。");
    }
  }
}
