package curriculum_New_question;

import java.util.Random;

public class curriculum_1_18 {

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	// 文字列と数値を組み合わせてメッセージ表示
	public static void message(String greeting, int number) {
		// コンソール出力
		System.out.println(greeting + " JavaSE " + number);
	}
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	// 2つの整数の乗算
	public static void multiply(int a, int b) {
		// コンソール出力
		System.out.println(a * b);
	}
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	// 配列の数値を順番に出力
	public static void array(int[] arr) {
		// 反復処理
		for (int num : arr) {
			// 一時保存した値をコンソール出力
			System.out.println(num);
		}
	}
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	// 2つの小数の和算
	public static void multiply(double a, double b) {
		// コンソール出力
		System.out.println(a + b);
	}
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	// 指定された数だけランダムな値を生成
	public static int[] random(int count) {
		// ランダムクラスのインスタンスを作成
		Random rand = new Random();
		// ランダムに生成された値を配列に格納
		int[] randomNumbers = new int[count];
		// 反復処理
		for (int i = 0; i < count; i++) {
			// 変数宣言
			int num;
			// ランダムに生成された値を変数numに代入
			num = rand.nextInt(100) + 1;
			// ランダムに生成された値を配列に格納
			randomNumbers[i] = num;
			// コンソール出力
			System.out.println(num);
		}
		// 配列を返す
		return randomNumbers;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	// 配列の平均値を求める
	public static double average(int[] numbers) {
		// 変数sumの宣言と初期化
		int sum = 0;
		// 反復処理
		for (int num  : numbers) {
			// 一時保存した値を合計に加算
			sum += num;
		}
		// 平均値を計算
		double randomAverage =(double) sum / numbers.length;
		// コンソール出力
		System.out.println("平均：" + randomAverage);
		// 平均値を返す
		return randomAverage;
	}
		
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	// 平均値が50以上か判定
    public static boolean above50(double average) {
    	// 50以上でtrue、それ以外はfalse
    	boolean result = average >= 50;
    	// コンソール出力
    	System.out.println(result);
    	// 判定を返す
    	return result;
    }
	
	public static void main(String[] args) {
	    // 作成したメソッドをここで呼び出してください
		// Q1呼び出し
		message("Hello", 11);
		// Q2呼び出し
		multiply(10,10);
		// Q3配列
		int[] outputArray = {1, 2, 3, 4, 5};
		// Q3呼び出し
		array(outputArray);
		//Q4呼び出し
		multiply(0.1, 0.1);
		// Q5呼び出し
		int[] randomNumbers = random(5);
		// Q6呼び出し、Q5の平均を計算
		double randomAverage = average(randomNumbers);
		// Q7呼び出し、Q6の判定
		above50(randomAverage);
		
	}
}
