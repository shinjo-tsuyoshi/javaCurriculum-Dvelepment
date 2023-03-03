//string型の配列を作成し、アルファベットa～jまでを格納してください。
//break文を使用し、a～dまで表示してください。
//cotinue文を使用し、i以外を表示してください。
package array2_answer.java;

public class Answer {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[]list = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		for(int i = 0; i < list.length; i++ ) {
			if(i == 4) {
				break;
			}
			System.out.println("a～ｄまでの表示"+list[i]);
		}
		
		for(int i = 0; i < list.length; i++ ) {
			if(i == 8) {
				continue;
			}
			System.out.println("i以外の表示"+list[i]);
		}
	}

}
