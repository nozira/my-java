class Exercise4_2{
  public static void main(String[] args) {
    //aは'A','B','C','D','E'のいずれか
    char a = (char) (Math.random() * 5 + 'A');

    switch(a){
      case 'A':
        System.out.println("成績は、" + a );
        System.out.println("大変よくできました");
        break;

      case 'B':
        System.out.println("成績は、" + a );
        System.out.println("よくできました");
        break;

      case 'C':
        System.out.println("成績は、" + a );
        System.out.println("もう少しがんばりましょう");
        break;

      case 'D':
        System.out.println("成績は、" + a );
        System.out.println("最初から全部復習してください");
        break;

      default:
        System.out.println("入力値が誤っています");
        break;
        
    }
  }
}
