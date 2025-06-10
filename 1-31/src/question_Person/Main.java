package question_Person;

// クラス定義
public class Main {
	
	// 実行メソッド
	public static void main(String[] args) {
		
		/*
		クラスフィールド
		
		問題1：クラスフィールド「count」を定義してください（初期値：0,データ型：int）

		問題2：Personコンストラクタの中でクラスフィールドcountに1を足してください

		問題3：Main.javaで System.out.printlnを使い「合計〇〇人です」と出力してください。〇〇はcountの値です。


		クラスメソッド
		
		問題4：クラスメソッド「printCount」を定義してください（データ型：void）

		問題5：クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力してください

		問題6：クラスメソッド「printCount」を呼び出してください
		*/
		
		// Personクラスのインスタンス作成
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		// printメソッド呼び出し
		person1.print();
		
		// Personクラスのインスタンス作成
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		// printメソッド呼び出し
		person2.print();
		
		// 問題3　合計人数出力
		System.out.println("合計" + Person.count + "人です");
		
		// 問題6 printCountクラスメソッドを呼び出し
		Person.printCount();
	}

}
