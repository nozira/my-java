class Example4_13{
  public static void main(String[] args) {

    loop1:
    for(int i = 1; i <= 9; i++){
      for(int j = 1; j <= 9; j++){
        if(i == 5 || j == 3){
          continue loop1;
        }
        System.out.print("[" + i + "," + j + "]");
      }
      System.out.println();
    }
  }
}
