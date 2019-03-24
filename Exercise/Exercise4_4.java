class Exercise4_4{
  public static void main(String[] args) {
    System.out.println("九九表\n");
    System.out.print("\t");
    for(int i = 1; i <= 9; i++){
      System.out.printf("%3d",i);
    }
    System.out.println();
    for(int i = 1; i <= 9; i++){
      System.out.print(i + "\t");
      for(int j = 1; j <= 9; j++){
        System.out.printf("%3d",i*j);
      }
      System.out.println();
    }
  }
}
