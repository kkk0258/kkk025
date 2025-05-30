package question_1_22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

    // クラス定義
	public class  Sushi_Info {
        // 変数定義
		private String greeting;
		private String comment1;
		private String comment2;
		private String DateTime;
		
		// コンストラクタ作成
		public Sushi_Info() {
		// 出力文を設定
		this.greeting = "こんにちは！ここは日本です！";
		this.comment1 = "この寿司はうまい";
		this.comment2 = "寿司は和食です";
		// 日時取得・保存
		this.DateTime = getDateTime();
	}
		
		// 日時取得メソッド
		private String getDateTime() {
			// 現在の日時を取得
			LocalDateTime now = LocalDateTime.now();
			// 表示形式設定
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			// 日時を返す
			return now.format(formatter);
		}
		
		// 出力メソッド
		public void printSushiInfo() {
			// コンソール出力
			System.out.println(this.greeting);
			System.out.println(this.comment1);
			System.out.println(this.comment2);
			System.out.println("今の現在日時は" + this.DateTime + "です");
		}
}
