package question_Person;

// クラス定義
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
		
	}

}
