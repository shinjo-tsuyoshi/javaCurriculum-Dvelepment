/* (1)のプログラムを正しい型に書き換えて、画面に表示してください。
 */

/*以下のプログラムを作成してください。
  ①int型変数 i に 3 を代入する。
  ②double型変数 d に i を代入する。
  ③変数 i と変数 d の値をそれぞれ画面に表示する。
*/

/*以下のプログラムを作成してください。
  ①int型変数 a に数値 7 を代入する。
  ②変数 a の値を 3 倍にする。
  ③変数 a の値を表示する。
  ④変数 a の値を半分（1/2）にする。
  ⑤変数 a の値を表示する。
  ※最後に変数 a の値が「10.5」になるようにしてください。
  ※１つのメソッド内で同じ変数名は使えないので注意してください。
*/

public class Practice {
    public static void main(String[] args) {
        
        //(1)
        double x = 2 + 6.0;
        int y = (int)x;
        System.out.println(y);

        String number = "5";
        System.out.println(number);

        boolean b = true;
        System.out.println(b);

        int i = 3;
        double d = i;
        System.out.println(i);
        System.out.println(d);

        int a = 7;
        double result_1 = a * 3;
        System.out.println(result_1);
        double result_2 = result_1 / 2;
        System.out.println(result_2);

    }
}
