class Exercise5_5{
  public static void main(String[] args) {
    int[] data = {70,88,65,94,100,0,80,81,98,100,20,30};

    int countPeople100 = 0;

    for(int i = 0; i < data.length; i++){
      if(data[i]==100){
        countPeople100 += 1;
      }
    }
    System.out.println("100点は、"+ countPeople100 + "人います。");
  }
}
