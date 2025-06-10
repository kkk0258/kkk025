package question_Person;
// クラス定義
public class Person {
	
	// 変数定義
	private String name;
	private int age;
	private double height;
	private double weight;
	
	// 人数カウント用フィールド
	public static int count = 0;
	
	// コンストラクタ作成
	public Person(String name, int age, double height, double weight) {
		
		// クラス内のフィールドに引数の値を代入
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;
		
	}
	
	// 自己紹介情報の出力用ゲッター
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	
	// bmiメソッド定義
	public double bmi() {
		
		// bmi計算式を返す
		return weight / (height * height);
		
	}
	
	// printメソッド定義
	public void print() {
		
		// コンソール出力処理
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + Math.floor(this.bmi()) + "です");
		System.out.println();
		System.out.println("合計" + count + "人です");
		
	}
	
}
