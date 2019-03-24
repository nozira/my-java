class Exercise4_7{
  public static void main(String[] args) {
    int rand = (int)(Math.random()*20);
    System.out.println("乱数：" + rand);

    for(int i = 0; i < rand; i++){
      for(int j = 0; j < i+1; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
