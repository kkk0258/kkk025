package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		
		// コンストラクタ呼び出し
		Dog dogName = new Dog();
		// コンソール出力
		System.out.println(dogName.name);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		
		// 数を指定してコンストラクタ呼び出し
		Dog dogCount = new Dog(3);
		// コンソール出力
		System.out.println(dogCount.count);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		
		// 現在の日時を取得
		LocalDateTime now = LocalDateTime.now();
		// 形式指定
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		
		// 形式を適用して文字列に変換
		String formatDate = now.format(formatter);
		// コンソール出力
		System.out.println(formatDate);
	}
}
