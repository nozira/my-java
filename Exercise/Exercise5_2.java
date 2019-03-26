class Exercise5_2{
  public static void main(String[] args) {
    
    String[] messages = {"おはよう","こんにちは","こんばんは","end"};
    String s = "end";

    for (String msg : messages){
      if(s.equals(msg)){
        break;
      }
      System.out.println(msg);
    }
  }
}
