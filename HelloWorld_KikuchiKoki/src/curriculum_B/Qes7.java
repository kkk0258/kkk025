package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Scannerクラスのインスタンスを作成
        Scanner scanner = new Scanner(System.in);
        // 生徒数を格納する変数を宣言
        int studentCount;
        // 反復処理
        do {
        	// 入力指示をコンソール出力
        	System.out.print("生徒の人数を入力してください(2以上) : ");
        	// Enterを押すまでの文字列を変数studentCountに代入
        	studentCount = scanner.nextInt();
        // 入力された値が2未満の場合は再入力
        } while (studentCount < 2);
        // 教科名を格納する配列
        String[] subjects = {"英語", "数学", "理科", "社会"};
        // 各教科の合計を格納する配列
        int[] subjectTotal = new int[4];
        // 各生徒の4教科の点数を格納する2次元配列
        int[][] allScores = new int[studentCount][4]; 
        // 各生徒の平均点を格納する配列
        double[] studentAverage = new double[studentCount];
        // 全生徒の平均点の合計を代入するための変数
        double totalSum = 0;
        // 反復処理
        for (int i = 0; i < studentCount; i++) {
        	// 各生徒の合計を代入するための変数
        	int studentTotal = 0;
        	// 反復処理
        	for (int j = 0; j < 4; j++) {
        		// 教科ごとに点数を入力
        		System.out.printf("%d人目の『%s』の点数を入力してください : ", i + 1, subjects[j]);
        		// Enterを押すまでの値を配列に格納
            	allScores[i][j] = scanner.nextInt();
            	// 入力された値を生徒合計点に加算
            	studentTotal += allScores[i][j];
            	// 入力された値を教科合計点に加算
            	subjectTotal[j] += allScores[i][j];
        	}
        	// 改行
        	System.out.println();
        	// 生徒の平均点を計算
        	double average = studentTotal / 4;
        	// 生徒の平均点を配列に格納
        	studentAverage[i] = average;
        	// 生徒の平均点を全体の平均点に加算
        	totalSum += average;
        }
        // 反復処理
        for (int i = 0; i < studentCount; i++) {
        	// 生徒ごとに平均点をコンソール出力
        	System.out.println(i + 1 + "人目の平均点は" + studentAverage[i] + "点です。");
        }
        // 改行
        System.out.println();
        // 反復処理
        for (int i = 0; i < 4; i++) {
        	// 教科ごとの平均点を計算
        	double subjectAverage = subjectTotal[i] / studentCount;
        	// 教科ごとの平均点をコンソール出力
        	System.out.println(subjects[i] + "の平均点は" + subjectAverage + "点です。");
        }
        // 全体の平均点を計算
        double totalAverage = totalSum / studentCount;
        // 全体の平均点をコンソール出力
        System.out.println("全体の平均点は" + totalAverage + "点です。");
	}

}
