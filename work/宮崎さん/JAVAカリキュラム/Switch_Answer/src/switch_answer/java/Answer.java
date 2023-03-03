//switch文を使用して以下のプログラムを作成してください。
//current_month　に数値を代入
//2の場合は、「（current_month）月は28日です。」
//4，6，9，11の場合は、「（current_month）月は30日です。」
//その他の場合は、「（current_month）月は31日です。」
package switch_answer.java;

public class Answer {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int current_month = 1;
		
		switch(current_month) {
		case 2:
			System.out.print(current_month + "月は28日です。");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.print(current_month + "月は30日です。");
			break;
		default:
			System.out.print(current_month + "月は31日です。");
			break;
		}
	}

}
