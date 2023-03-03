/*以下のプログラムを作成してください。
  ①int型変数 x に数値 3 を代入する。
  ②int型変数 y に数値 20 を代入する。
  ③int型変数 ans に x と y の積を代入する。
  ④画面に ans の値を表示する。
*/

/*以下のプログラムを作成してください。
  ①int 型の変数 i に 100 を代入する。
  ②インクリメント演算子を適用して数値を 1 増やす。
  ③画面に変数 i の値を表示する。
  ④デクリメント演算子を適用して数値を 1 減らす。
  ⑤画面に変数 i の値を表示する。
 */

/*以下のプログラムを作成してください。
  ①画面に「あなたの年齢を予想します。」と表示する。
  ② 0 から 99 までの乱数を生成し、int型変数 expect に代入する。
    乱数の生成方法【例:int r = new java.util.Random().nextInt(◎);】
    ◎には発生させる乱数の上限値(指定値自体の数値は含まない)を入れる。
  ③ expect の数値をインクリメント演算子で 1 増やし、 1 から 100 の乱数に変更する。
  ④画面に「あなたの年齢はおそらく（乱数）歳ですね？」と表示します。
  ※実行するごとに年齢が変わるので、やってみてください。
 */
public class Practice {
    public static void main(String[] args) {
      int x = 3;
      int y = 20;
      int ans = x * y;
      System.out.println(ans);

      int i = 100;
      i++;
      System.out.println(i);
      i--;
      System.out.println(i);

      System.out.println("あなたの年齢を予想します。");
      int expect = new java.util.Random().nextInt(100);
      expect++;
      System.out.println("あなたの年齢はおそらく" + expect + "歳ですね？");
    
    }
}
