package question_Person;

// クラス定義
public class Main {
	
	// 実行メソッド
	public static void main(String[] args) {
		
		/*
		 フィールドとコンストラクタ
		 
		 問題1：インスタンスフィールドを定義してください
		 
		 フィールド：名データ型
		 
		 name：string
		 
		 age：int
		 
		 height：double
		 
		 問題2：コンストラクタを定義してください（下記それぞれの引数）
		 
		 name,age,height
		 
		 問題3：コンストラクタの中で各インスタンスフィールドに値をセットしてください
		 
		 
		 インスタンスメソッド
		 
		 問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）
		 
		 問題5：Main.javaの引数にweightの60を入れてください
		 
		 問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）
		 
		 問題7：bmiメソッドでインスタンスのBMIを返すようにしてください
		 
		 問題8：インスタンスメソッド「print」を定義してください（戻り値：void）
		 
		 問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください
		 
		 問題10：人数の合計を「合計○人です」と出力してください。
		 */
		
		// Personクラスのインスタンス作成
		Person p = new Person("鈴木太郎", 20, 1.7, 60);
		
		
		// 自己紹介情報のコンソール出力処理
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getHeight());
		System.out.println();
		
		// printメソッド実行
		p.print();
	}

}
