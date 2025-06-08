package data;

// クラス定義
public class prefectureInfo {
	
	// 変数定義
	private String name;
	private String city;
	private double area;
	
	// コンストラクタ作成
	public prefectureInfo(String name, String city, double area) {
		// クラス内のフィールドに引数の値を代入
		this.name = name;
		this.city = city;
		this.area = area;
		}
	
	// ゲッター
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public double getArea() {
		return area;
	}
	
	// メソッド定義
	public void output() {
		// コンソール出力
		System.out.println("都道府県名：" + name);
		System.out.println("県庁所在地：" + city);
		System.out.println("面積：" + area + "km2");
		System.out.println();
	}
}
