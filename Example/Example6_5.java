class Example6_5{
  public static void main(String[] args) {
    int number = rand();
    System.out.println("戻り値は" + number + "です");
  }
  public static int rand(){
    int randomNumber = (int)(Math.random()*100);
    return randomNumber;
  }
}
