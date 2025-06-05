package Animal_data;

import java.util.Map;
import java.util.Scanner;

// クラス定義
public class AnimalMain {
    // 実行メソッド
	public static void main(String[] args) {
		
		/*
		 
	 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
	 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	  	
	  	コンソール出力結果
	  	
	  	コンソールに文字を入力してください
	  	動物名：ライオン
		体長：2.1m
		速度：80km/h
		学名：パンテラ レオ
		
		動物名：ゾウ
		体長：3.2m
		速度：40km/h
		学名：ロキソドンタ・サイクロティス
		
		動物名：パンダ
		体長：1.9m
		速度：30km/h
		学名：アイルロポダ・メラノレウカ
		
		動物名：チンパンジー
		体長：0.94m
		速度：25km/h
		学名：パン・トゥログロディテス
		
		動物名：シマウマ
		体長：2.4m
		速度：65km/h
		学名：チャップマンシマウマ
		
		動物名：インコ
		体長：0.1m
		速度：50km/h
		学名：不明

	  
	  */
		
		// Scannerクラスのインスタンス作成
		Scanner scanner = new Scanner(System.in);
		
		// コンソール出力
		System.out.println("コンソールに文字を入力してください");
		// 入力情報取得
		String input = scanner.nextLine();
		
		// キーと値のペアを作成
		Map<String, String> sci = Map.of(
				"ライオン", "パンテラ レオ",
			    "ゾウ", "ロキソドンタ・サイクロティス",
			    "パンダ", "アイルロポダ・メラノレウカ",
			    "チンパンジー", "パン・トゥログロディテス",
			    "シマウマ", "チャップマンシマウマ",
			    "インコ", "不明"
				);
		
		// カンマで文字列を分割
		for (String block : input.split(",")) {
			// コロンで文字列を分割して配列に格納
			String[] parts = block.split(":");
			// 分割した文字列を変数に代入
			String name = parts[0];
			double length = Double.parseDouble(parts[1]);
			int speed = Integer.parseInt(parts[2]);
			// nameとペアの文字列を変数に代入
			String sciName = sci.getOrDefault(name, "不明");
			
			// 引数にname, length, speed, sciNameを取るAnimalInfoクラスのインスタンス作成
			AnimalInfo animal = new AnimalInfo(name, length, speed, sciName);
			// メソッド実行
			animal.output();
		}
		

	}

}
