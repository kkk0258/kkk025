package Main;

import java.util.Scanner;

import GameInfo.MyStats;

// クラス定義
public class GameStart {
    // 実行メソッド
	public static void main(String[] args) {
		
		/*
		 
		 名前を入力したら下記がコンソールに出力されるように作ってください
			条件：数値は毎回変わるように作ってください
			 	 サブクラスを使用してください
				 スーパークラスを使用してください
				 getterとsetterを使用してください
				 packageを2つ作ってメインと処理を分けてください
				 命名する場合は規則にのっとってください
				 コンストラクタを使用してください

			こんにちは 「 名前 」 さん
			ステータス
			HP：849
			MP：862
			攻撃力：375
			素早さ：937
			防御力：24

			さあ冒険に出かけよう！
		 
		 */
		
		// Scannerクラスのインスタンス作成
		Scanner scanner = new Scanner(System.in);
		
		// 入力情報取得
		String name = scanner.nextLine();
		
		// MyStatsクラスのインスタンス作成
		MyStats characterName = new GameInfo.MyStats(name);
		// コンソール出力
		System.out.println("こんにちは「" + characterName.getName() + "」さん");
		System.out.println("ステータス");
		System.out.println("HP：" + characterName.getHp());
		System.out.println("MP：" + characterName.getMp());
		System.out.println("攻撃力：" + characterName.getAttack());
		System.out.println("素早さ：" + characterName.getSpeed());
		System.out.println("防御力：" + characterName.getDefense());
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");
		
	}

}
