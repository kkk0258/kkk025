package question_1_33;

//クラス定義
public class Person {
	
	// 人数カウント用フィールド
	public static int count = 0;
	
	// 変数定義
	public String firstName;
	public int age;
	public double height, weight;
	
	// 問題1　lastName追加
	public String lastName;
	
	// コンストラクタ作成
	Person(String firstName, int age, double height, double weight){
		// クラス内のフィールドに引数の値を代入
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// 問題2　コンストラクタを追加で作成
	Person(String firstName, String lastName, int age, double height, double weight){
		// 問題3　追加でクラス内のフィールドに引数の値を代入
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;
	}
	
	// fullNameメソッド定義
	public String fullName(){
		// 2つの値を返す
		return this.firstName + this.lastName;
	}
	
	// printメソッド定義
	public void print(){
		// コンソール出力
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}
	
	// bmiメソッド定義
	public double bmi(){
		// 計算式の結果を返す
		return this.weight / this.height / this.height;
	}
	
	// printCountメソッド定義
	public static void printCount(){
		// コンソール出力
		System.out.println("合計" + Person.count + "人です");
	}
	
	// 問題6　メソッド定義
	public void buy(Car car) {
		// 問題7　ownerフィールドに値を代入
		car.setOwner(this.fullName());
		// 問題8　コンソール出力
		System.out.println(car.getOwner() + "が購入しました");
	}
	
	
	// 問題9　別引数のbuyメソッド
		public void buy(Bicycle bicycle) {
			// ownerフィールドに値を代入
			bicycle.setOwner(this.fullName());
			// コンソール出力
			System.out.println(bicycle.getOwner() + "が購入しました");
		}
}
