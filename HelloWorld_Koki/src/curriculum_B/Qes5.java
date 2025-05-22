package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 行の反復処理
		for (int i = 1; i <= 9; i++) {
			// 列の反復処理
			for (int j = 1; j <= 20; j++) {
				// 掛け算の式をコンソール出力
				System.out.printf("%03d * %03d = %03d", j, i, j * i);
				// 列管理
				if (j < 20) {
					// 掛け算式の間に「||」出力
					System.out.print(" || ");
				}
			}
			// 行管理
			System.out.println();
		}
	}

}
