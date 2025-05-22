package curriculum_B;

import java.util.Random;
import java.util.Scanner;


public class Qes1_3 {

    public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Scannerクラスのインスタンスを作成
		Scanner scanner = new Scanner(System.in);
		// breakが出るまで反復処理
		while (true) {
			// Enterを押すまでの文字列を変数userNameに代入
			String userName = scanner.nextLine();
			// null・空文字テェック
			if (userName == null || userName.isEmpty()) {
				// エラーメッセージ表示
				System.out.println("名前を入力してください");
				// 改行
				System.out.println();
			// 文字数テェック
			} else if ( userName.length() > 10) {
				// エラーメッセージ表示
				System.out.println("名前は10文字以内にしてください");
				// 改行
				System.out.println();
			// 半角英数字テェック
			} else if (!userName.matches("^[A-Za-z0-9]+$")){
				// エラーメッセージ表示
				System.out.println("半角英数字のみで名前を入力してください");
				// 改行
				System.out.println();
			// 正しい入力だった場合の処理
			} else {
				// 登録完了のメッセージ表示
				System.out.println("ユーザー名「" + userName + "」を登録しました");
				
				// Randomクラスのインスタンスを作成
				Random random = new Random();
				// じゃんけんの配列を作成
				String[] hands = {"「グー」", "「チョキ」", "「パー」"};
				// ラウンドカウント用の変数
				int round = 0;
				// じゃんけんに勝つまで反復処理
				while (true) {
					// ラウンドカウントを反復毎に1増加
					round++;
					// 0〜2をランダムに指定し、変数に代入
					int p1 = random.nextInt(3);
					int p2 = random.nextInt(3);
					// 改行
					System.out.println();
					// 出した手をコンソールに出力
					System.out.println(userName + "の手は" + hands[p1]);
					System.out.println("相手の手は" + hands[p2]);
					// あいこ処理
					if (p1 == p2) {
						//改行
						System.out.println();
						// あいこ時のコンソール処理
						System.out.println("DRAW あいこ もう一回しましょう！");
					// チョキで負け処理
					} else if (p1 == 1 && p2 == 0) {
						// 改行
						System.out.println();
						// チョキで負け時のコンソール出力
						System.out.println("俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ！");
					// パーで負け処理
					} else if (p1 == 2 && p2 == 1) {
						// 改行
						System.out.println();
						// パーで負け時のコンソール出力
						System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
					// グーで負け処理
					} else if (p1 == 0 && p2 == 2) {
						// 改行
						System.out.println();
						// グーで負け時のコンソール出力
						System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです");
					// 勝ち処理
					} else {
						// 改行
						System.out.println();
						// 勝ち時のコンソール処理
						System.out.println("やるやん。\n次は俺にリベンジさせて");
						// 改行
						System.out.println();
						// ラウンドカウントのコンソール出力
						System.out.println("勝つまでにかかった合計回数は" + round + "回です");
						// 反復処理終了
						break;
					}
					
				}
				
			}
		}
		
		
	}

}
