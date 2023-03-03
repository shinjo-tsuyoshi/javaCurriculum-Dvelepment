/*次のようなプログラムがあります。
  ①のプログラムを実行すると「x+yは3030」という結果が表示されます。
   「x+yは60」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。

  ②のプログラムを完成させてください。
   String型の name変数 〇〇を自分の名前に変えます。
   System.out.println()を使って「（名前）はjavaを学習しています。」と画面に表示してください。
*/

public class Practice {
    public static void main(String[] args) {

      //①
        String num1 = "30";
        int num2 = 30;
        System.out.println("x+yは" + (num2 + num1));

      //②
        String name = "ルフィは";
        String message = "javaを学習しています。";
        System.out.println(name + message); 
    }
}
