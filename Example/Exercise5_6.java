class Exercise5_6{
  public static void main(String[] args) {
    int[] data = {70,88,65,94,100,0,80,81,98,100,20,30};

    int target = (int)(Math.random()*101);
    System.out.println("検索値は、"+ target + "点");
    for(int i = 0; i < data.length; i++){
        if(target == data[i]){
          System.out.println(target + "点は見つかりました");
          break;
        }else{
          if(i == (data.length-1)){
            System.out.println(target + "点は見つかりません");
            break;
          }
        }
    }
  }
}
