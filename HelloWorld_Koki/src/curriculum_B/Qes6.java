package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

    public static void main(String[] args) {
	    // TODO 自動生成されたメソッド・スタブ
    	// Scannerクラスのインスタンスを作成
    	Scanner scanner = new Scanner(System.in);
    	// Randomクラスのインスタンスを作成
        Random rand = new Random();
        // 各商品の在庫数をランダムに指定
        int pc = rand.nextInt(12);
        int fridge = rand.nextInt(12);
        int fan = rand.nextInt(12);
        int washer = rand.nextInt(12);
        int humidifier = rand.nextInt(12);
        int tv = rand.nextInt(12);
        int display = 11 - tv;
        // 反復処理用のダミー配列
        String[] loop = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        // 反復処理
        for (String a : loop) {
        	// Enterを押すまでの文字列を変数productNameに代入
        	String productName = scanner.nextLine();
        	// 入力された文字列を読点に分割して配列に格納
        	String[] inputProducts = productName.split("[、,]");
        	// 反復処理
            for (String product : inputProducts) {
            	// 出力用に変数宣言
            	String output = "";
            	// 商品名に応じて出力内容を設定
        	    switch (product) {
        	    case "パソコン":
        	    	output = "パソコンの残り台数は" + pc + "台です";
        	        break;
        	    case "冷蔵庫":
        	    	output = "冷蔵庫の残り台数は" + fridge + "台です";
        	        break;
        	    case "扇風機":
        	    	output = "扇風機の残り台数は" + fan + "台です";
        	        break;
        	    case "洗濯機":
        	    	output = "洗濯機の残り台数は" + washer + "台です";
        	        break;
        	    case "加湿器":
        	    	output = "加湿器の残り台数は" + humidifier + "台です";
        	        break;
        	    case "テレビ":
        	    	output = "テレビの残り台数は" + tv + "台です";
        	        break;
        	    case "ディスプレイ":
        	    	output = "ディスプレイの残り台数は" + display + "台です";
        	        break;
        	    default:
                    output = "『" + product + "』は指定の商品ではありません";
                    break;
        	    }
        	    // コンソール出力
        	    System.out.println(output);
        	    // 改行
        	    System.out.println();
            }
        }
        // Scannerを閉じる
        scanner.close();
    } 
}

