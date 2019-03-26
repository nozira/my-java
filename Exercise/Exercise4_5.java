import java.util.Scanner;
class Exercise4_5{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("input x :");
    int x = scanner.nextInt();
    System.out.print("input y :");
    int y = scanner.nextInt();

    int ansPower = 1;
    int ansFactorial = 1;
    for(int i = 0; i < y; i++){
      ansPower = ansPower * x;
    }
    for(int i = 1; i <= x; i++){
      ansFactorial = ansFactorial * i;
    }
    System.out.println(x + "の" + y + "乗：" + ansPower);
    System.out.println(x + "の階乗：" + ansFactorial);
  }
}
