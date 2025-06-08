package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import data.prefectureInfo;

// クラス定義
public class prefectureMain {
    // 実行メソッド
	public static void main(String[] args) {
		
		/*
	 	
	 	0, "北海道:札幌市:83424"
		1, "青森県:青森市:9646"
		2, "岩手県:盛岡市:15275"
		3, "宮城県:仙台市:7282"
		4, "秋田県:秋田市:11638"
		5, "山形県:山形市:9323"
		6, "福島県:福島市:13784"
		7, "茨城県:水戸市:6097"
		8, "栃木県:宇都宮市:6408"
		9, "群馬県:前橋市:6362"
		10, "埼玉県:さいたま市:3798"
	 	
	 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
	 	都道府県がソートされてコンソールに出力されるように作ってください
	   	※Packageを2つ作ってください
	   	※複数選択できるようにしてください
	   	
	   	例:
	   	8,5,9,.....
	   	と入力された場合（昇順）
	   	
	   	都道府県名：山形県
		県庁所在地：山形市
		面積：9323.0km2
	   	
	   	都道府県名：栃木県
		県庁所在地：宇都宮市
		面積：6408.0km2

	   	都道府県名：群馬県
		県庁所在地：前橋市
		面積：6362.0km2
		
	     */
		
		// Scannerクラスのインスタンス作成
		Scanner scanner = new Scanner(System.in);
		
		// 情報を文字列で配列に格納
		String[] data = {
				"北海道:札幌市:83424",
				"青森県:青森市:9646",
				"岩手県:盛岡市:15275",
				"宮城県:仙台市:7282",
				"秋田県:秋田市:11638",
				"山形県:山形市:9323",
				"福島県:福島市:13784",
				"茨城県:水戸市:6097",
				"栃木県:宇都宮市:6408",
				"群馬県:前橋市:6362",
				"埼玉県:さいたま市:3798"
		};
		
		// 都道府県の数だけ格納できる配列のインスタンス作成
		prefectureInfo[] prefectures = new prefectureInfo[data.length];
		
		// 反復処理
		for (int i =  0; i < data.length; i++) {
			// コロンで文字列を分割して配列に格納
			String[] parts = data[i].split(":");
			// 分割した文字列を変数に代入
			String name = parts[0];
			String city = parts[1];
			double area = Double.parseDouble(parts[2]);
			// prefectureクラスのインスタンスを作成し、配列に格納
			prefectures[i] = new prefectureInfo(name, city, area);
		}
		
		// 入力値取得、カンマで分割して配列に格納
		String[] indexInput = scanner.nextLine().split(",");
		// 入力値取得、変数に代入
		String order = scanner.nextLine();
		
		// 選ばれた都道府県情報を格納するリスト作成
		List<prefectureInfo> select = new ArrayList<>();
		
		// カンマ区切りした文字列を取り出す反復処理
		for (String indexSel : indexInput) {
			
			// 文字列の前後削除、intに変換して変数定義
			int num = Integer.parseInt(indexSel.trim());
			
			// 存在チェック
			if (num >= 0 && num < prefectures.length) {
				// 都道府県情報をリストに追加
				select.add(prefectures[num]);
			}
			
		} 
			
		// 「昇順」と入力された場合の処理
		if (order.equals("昇順")) {
			// リスト内の要素を小さい順に並び替える
			select.sort(Comparator.comparing(prefectureInfo::getArea));
		// 「降順」と入力された場合の処理
		} else if (order.equals("降順")) {
			// リスト内の要素を大きい順に並び替える
			select.sort(Comparator.comparing(prefectureInfo::getArea).reversed());
		}
		// リストの各要素を1つずつ取り出して変数に代入
		for (prefectureInfo p : select) {
			// outputメソッド実行
			p.output();
		}
		
	}

}
