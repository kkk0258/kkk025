package Animal_data;

// クラス定義
public class AnimalInfo {
	
	// 変数定義
	private String name;
	private double length;
	private int speed;
	private String scientificName;
	
	// コンストラクタ作成
	public AnimalInfo(String name, double length, int speed, String scientificName) {
		
		// クラス内のフィールドに引数の値を代入
		this.name = name;
		this.length = length;
		this.speed = speed;
		this.scientificName = scientificName;
		
	}
	
	// メソッド定義
	public void output() {
		// コンソール出力処理
		System.out.println("動物名：" + name);
		System.out.println("体長：" + length + "m");
		System.out.println("速度：" + speed + "km/h");
		System.out.println("学名：" + scientificName);
		System.out.println();
		
	}
}
