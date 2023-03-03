//①配列int test[][]に以下の成績を格納し、同じように表示してください。
//　生徒1：国語64点 数学73点 英語69点
//　生徒2：国語58点 数学81点 英語75点
//　生徒3：国語86点 数学68点 英語79点
//　生徒4：国語72点 数学55点 英語80点
//②それぞれの教科の平均点を表示してください。
//　表示例　平均点：国語〇点　数学〇点　英語　〇点
package answer.java;

public class Answer {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//各生徒の成績を格納する配列
		int test[][] = {
				{64, 73, 69}, {58, 81, 75}, {86, 68, 79}, {72, 55, 80}
		};
		//合計点を格納する配列
		int total[] = {0, 0, 0};
		
		//各生徒の点数表示
		for(int i = 0; i<test.length; i++) {
			System.out.print("生徒" + (i+1) + ":");
			for(int j = 0; j< test[i].length; j++) {
				switch(j) {
					case 0:
						System.out.print("国語");
						break;
					case 1:
						System.out.print("数学");
						break;
					case 2:
						System.out.print("英語");
						break;
					}
				System.out.print(test[i][j] + "点\t");
				
				//平均点のために合計点を算出
				total[j] += test[i][j];
			}
		System.out.print("\n");	
		}
		//各教科の平均点
		System.out.print("平均点："+ "国語" + (total[0] / test.length)+ "点\t" );
		System.out.print("数学" + (total[1] / test.length) + "点\t");
		System.out.print("英語" + (total[2] / test.length) + "点\t");
	}

}
