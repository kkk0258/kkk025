package question_Person;

// クラス定義
public class Person {
	
	// 変数定義
	public String name;
	public int age;
	public double height;
	public double weight;
	
	//  問題1　人数カウント用フィールド
	public static int count = 0;
	
	// コンストラクタ作成
	Person(String name, int age, double height, double weight){
		
	    // クラス内のフィールドに引数の値を代入
	    this.name = name;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	    // 問題2　countに1を足す
	    count++;
	}
	
	// bmiメソッド定義
	public double bmi(){
		// bmi計算式を返す
		return this.weight / this.height / this.height;
	}
	
	// printメソッド定義
	public void print() {
		// コンソール出力
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}
	
	// 問題4 printCountメソッド定義
	public static void printCount() {
		// 問題5 合計人数出力
		System.out.println("合計" + count + "人です");
	}
}
