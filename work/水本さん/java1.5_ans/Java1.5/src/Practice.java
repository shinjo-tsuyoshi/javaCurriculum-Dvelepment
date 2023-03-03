/*以下のプログラムを作成してください。
  ①画面に「私の自己紹介をします。」と表示します。
  ②変数name,gender,age,hightを正しい型にし、自分の情報を代入します。
  ③画面に「名前は（名前）です。」「年齢は（年齢）歳です。」のような書き方で、
   全ての変数を使って自分の自己紹介を表示します。
  ④画面に「よろしくお願いします。」と表示します。
  ※下記のメインメソッド内に書いていきましょう。
 */
public class Practice {
    public static void main(String[] args) {
        System.out.println("私の自己紹介をします。");

        String name = "モンキー・D・ルフィ";
        char gender = '男';
        int age = 19;
        double height = 174.2;

        System.out.println("名前は" + name + "です。");
        System.out.println("性別は" + gender + "です。");
        System.out.println("年齢は" + age + "歳です。");
        System.out.println("身長は" + height + "㎝です。");
        System.out.println("よろしくお願いします。");
    }
}
