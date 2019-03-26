class Exercise4_3{
  public static void main(String[] args) {
    int a  = (int)(Math.random() * 100 + 1);
    int answer = 0;
    for(int i=1; i<=a; i++){
      answer = answer + i;
    }
    System.out.println("1から" + a + "までの合計は、" + answer );
  }
}
