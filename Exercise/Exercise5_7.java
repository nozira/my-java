class Exercise5_7{
  public static void main(String[] args) {
    String[][] data = {
      {"日本","東京","大阪","福岡","札幌"},
      {"中国","北京","上海"},
      {"韓国","ソウル","プサン"},
      {"イギリス","ロンドン"},
      {"フランス","パリ"},
      {"イタリア","ローマ","ミラノ","フィレンツェ"},
    };
    for(int i = 0; i < data.length; i++){
      System.out.print(data[i][0]+"の都市：");
      for(int j = 1; j < data[i].length; j++){
        System.out.print(data[i][j]+"　");
      }
      System.out.println();
    }
  }
}
