package GameInfo;

// Statsクラスを継承したMyStatsクラス定義
public class MyStats extends Stats {
	// 名前を引数に取るMyStatsクラスのコンストラクタ作成
	public MyStats(String name) {
		// 引数にnameを取る親クラスStatsのコンストラクタ呼び出し
		super(name);
	}
}
