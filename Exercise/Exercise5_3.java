import java.util.Arrays;

class Exercise5_3{
  public static void main(String[] args) {
    int[] data = {70,88,65,94,100,0,80,81,98,100,20,30};
    int sum = 0;
    int average = 0;

    for(int i = 0; i < data.length; i++){
      sum = sum + data[i];
    }
    average = sum / data.length;
    System.out.println("平均点は、" + average +"点");

    Arrays.sort(data);

    for(int i = 0; i < data.length; i++){
      if(data[i]==65){
        System.out.println(data[i]+"点の人の順位は、" + (data.length - i) + "位");
        break;
      }
    }

  }
}
