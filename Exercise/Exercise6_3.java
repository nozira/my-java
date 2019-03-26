class Exercise6_3{
  public static void main(String[] args) {
    int[] data = {70,88,65,94,100,0,80,81,98,100,20,30};

    int target = (int)(Math.random()*101);
    boolean flag;

    System.out.println("検索値は、"+ target + "点");

    flag = search(data, target);
    if (flag) {
      System.out.println(target+"点は見つかりました");
    }else{
      System.out.println(target+"点は見つかりません");
    }
  }
  public static boolean search(int[] d, int t){
    for(int i = 0; i < d.length; i++){
      if(t == d[i]){
        return true;
      }
    }
    return false;
  }
}
