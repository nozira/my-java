class Exercise6_4{
  public static void main(String[] args) {
    int[] array;

    array = randArray();
    System.out.println("数列の要素数は、" + array.length);
    for(int i = 0; i < array.length; i++){
      System.out.print("　" + array[i]);
    }
    System.out.println();
  }
  public static int[] randArray(){
    int num = (int)(Math.random()*10);
    int[] array = new int[num];

    for(int i = 0; i < array.length; i++){
      array[i] = (int)(Math.random()*100);
    }
    return array;
  }
}
