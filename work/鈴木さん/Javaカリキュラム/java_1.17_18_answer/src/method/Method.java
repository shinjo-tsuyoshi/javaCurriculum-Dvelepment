package method;

import java.util.Random;

public class Method {

	public static void main(String[] args) {
		// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を呼び出してください。
		greeting();
		// Q2：引数として整数を渡すと+1してメソッド（関数）関数を呼び出してコンソールに出力してください。
		System.out.println(increment(2));
		// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を呼び出してコンソールに出力してください。
		System.out.println(multiplication(2, 3));
		// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を呼び出してコンソールに出力してください。
		System.out.println(multiplication(2.5, 3.2));	
		// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）
		//     を呼び出して、ループ文を用いてそれぞれの数をコンソールに出力してください。
		for (int num : makeRandomNums(3)) {
			System.out.println(num);
		}
		// Q6：Q5で作成した関数を用いて、配列の要素の平均値を返すメソッド（関数）を呼び出してコンソールに出力してください。
		System.out.println(findAvarage(5));
	}
	
	// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
	public static void greeting() {
		System.out.println("Hello Java");
	}
	// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
	public static int increment(int num) {
		return ++num;
	}
	// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	public static int multiplication(int num1, int num2) {
		return num1 * num2;
	}
	// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	//     ※ただしメソッド名はQ3のメソッド名と同じにしてください。
	public static double multiplication(double num1, double num2) {
		return num1 * num2;
	}
	// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
	public static int[] makeRandomNums(int num) {
		int nums[] = new int[num];
		
		Random random = new Random();
		
		for (int i = 0; i < num; i++) {
			nums[i] = random.nextInt(100);
		}
		
		return nums;
	}
	// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
	//     配列の要素の平均値を返すメソッド（関数）を作成してください。
	public static double findAvarage(int num) {
		int sum = 0;
		int[] nums = makeRandomNums(num);
		
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		
		double avarage = sum / nums.length;
		
		return avarage;
	}
}

