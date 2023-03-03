/*以下のプログラムを作成してください。
  ①変数 x、y にそれぞれ任意の数値を代入する。
  ②変数 x の値が変数 y の値以上だった場合に true を返す。
  ③画面に結果を表示する。
*/

/*以下のプログラムを作成してください。
  ①変数 a に 5 ,変数 b に 10 の数値を代入する。
  ②変数 a と変数 b は等しいかを判定する。
  ③画面に結果 true を表示する。
  ※ヒント　true を返すということは等しくないということです。
*/

/*以下のプログラムを作成してください。
  ①変数 c に 12、変数 d に 8 の数値を代入する。
  ②c の値が 10 以上かつ d の値が 10 未満の場合に false を返す。
  ③画面に結果を表示する。
*/

/*以下のプログラムを作成してください。
  ①変数 e に任意の数値を入力する。
  ②変数 e の値が 0 以上または 10 以下の場合 true を返す。
  ③画面に結果を表示する。
*/

public class Practice {
    public static void main(String[] args) {
      int x = 20;
      int y = 5;
      boolean result_1 = x >= y;
      System.out.println(result_1);

      int a = 5;
      int b = 10;
      boolean result_2 = (a != b);
      System.out.println(result_2);

      int c = 12;
      int d = 8;
      boolean result_3 = !(c >= 10 && d < 10);
      System.out.println(result_3);

      int e = 10;
      boolean result_4 = e >= 0 || e <=10;
      System.out.println(result_4);
    }
}
