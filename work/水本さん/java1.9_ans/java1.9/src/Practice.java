/*以下のプログラムを作成してください。
  ①変数 ame を作成します。
  ②雨だったら、「DVDを見ます。」と画面に表示する。 
  ③そうでなければ、「外で遊びます。」と画面に表示する。
  ※変数 ame に何を代入すると良いか自分で考えてください。
*/

/*以下のプログラムを作成してください。
  ①変数 name に任意の名前を代入する。
  ①変数 score に任意の数値を代入する。
  ②変数 score が 80 点以上だったら、
   画面に「（name）さんは（score）点です。たいへんよくできました。」と表示。
   変数 score が 60 点以上、80 点未満だったら、
   画面に「（name）さんは（score）点です。よくできました。」と表示。
   変数 score が 60 点未満だったら、
   画面に「（name）さんは（score）点です。ざんねんでした。」と表示。
*/

/*以下のプログラムを作成してください。
  ①変数 isTired を定義し、0 か 1 を代入する。（どちらを代入しても構わない。）
  ②変数 play を定義し、適当な遊びの名前を代入する。
  ③画面に「こんにちは」と表示する。
  ④もし変数 isTired が 0 であれば「とても元気です。」、そうでなければ「疲れています。」と表示する。
  ⑤もし変数 isTired が元気であれば、変数 play を利用して「〇〇をします。」と表示する。
  （〇〇は遊びの内容を表示する。）
  ※④は System.out.println() のカッコ内に条件演算子（三項演算子）を使って、一行で書いてください。
*/
public class Practice {
    public static void main(String[] args) {
      boolean ame = true;
      if (ame == true) {
        System.out.println("DVDを見ます。");
      } else {
        System.out.println("外で遊びます。");
      }
        
      String name = "ルフィ";
      int score = 88;
      if (score >= 80) {
        System.out.println(name + "さんは" + score + "点です。たいへんよくできました。");
      } else if (score >= 60 && score < 80) {
        System.out.println(name + "さんは" + score + "点です。よくできました。");
      } else if (score < 60) {
        System.out.println(name + "さんは" + score + "点です。ざんねんでした。");
      }

      int isTired = 0;
      String play = "キャンプ";
      System.out.println(isTired == 0 ? "とても元気です。" : "疲れています。");
      if (isTired == 0) {
        System.out.println(play + "をします。");
      }
    }
}
