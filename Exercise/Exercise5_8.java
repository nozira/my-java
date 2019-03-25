import java.util.Scanner;
class Exercise5_8{
  public static void main(String[] args) {
    String[][] data = {
      {"001","東京"},
      {"002","大阪"},
      {"003","福岡"},
      {"004","札幌"}
    };

    System.out.print("検索するIDは");
    Scanner scan = new Scanner(System.in);
    String id = scan.next();

    for(int i = 0; i < data.length; i++){
      if(id.equals(data[i][0])){
        System.out.println("都市は"+data[i][1]);
        break;
      }else{
        if(i == (data.length-1)){
          System.out.println("都市は見つかりません");
        }
      }
    }
  }
}
