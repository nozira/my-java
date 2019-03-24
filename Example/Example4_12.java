class Example4_12{
  public static void main(String[] args) {
    for(int i = 1; i <= 9; i++){
      for(int j = 1; j <= 9; j++){
        if(i == 5 || j == 3){
          continue;
        }
        System.out.print("[" + i + "," + j + "]");
      }
      System.out.println();
    }
  }
}
