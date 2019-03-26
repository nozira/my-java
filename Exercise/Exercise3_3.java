class Exercise3_3{
  public static void main(String[] args) {
    int a = 50, b = 9;

    System.out.println("a は 50\tbは 9");
    System.out.println("a は b より大きく、かつaは50より大きい\t" + ((a>b) && (a>50)) );
    System.out.println("a は b と同じでなく、かつ a は 50 以上だ\t" + ((a!=b) && (a>=50)) );
    System.out.println("a は b より大きい、または b は 20 より小さい\t" + ((a>b) || (b<20)) );
    System.out.println("a は b または 10 より 小さい\t\t\t" + ((a<10) || (a<b)) );
    
  }
}
