package question_1_33;

//クラス定義
public class Main {
	
	// 実行メソッド
	public static void main(String[] args) {
		
		// Personクラスのインスタンス作成
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		// printメソッド呼び出し
		person1.print();
		
		// Personクラスのインスタンス作成
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		// printメソッド呼び出し
		person2.print();
		
		// printCountメソッド呼び出し
		Person.printCount();
		
		// Carクラスのインスタンス作成
		Car car = new Car();
		
		// Bicycleクラスのインスタンス作成
		Bicycle bicycle = new Bicycle();
		
		// 問題4　インスタンスのownerフィールドに引数の値を代入
		car.setOwner(person1.fullName());
		bicycle.setOwner(person2.fullName());
		
		// 問題5　コンソール出力
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());
		
		
		// 問題10　メソッド呼び出し
		person1.buy(car);
		person2.buy(bicycle);
	}

}