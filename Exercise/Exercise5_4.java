import java.util.Arrays;

class Exercise5_4{
  public static void main(String[] args) {
    int[] data = {70,88,65,94,100,0,80,81,98,100,20,30};

    Arrays.sort(data);
    System.out.println("最高点は、"+ data[data.length-1] +"点");
    System.out.println("最低点は、"+ data[0] +"点");

  }
}
