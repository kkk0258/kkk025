package GameInfo;

import java.util.Random;

// クラス定義
public class Stats {
	
	// 変数定義
	private String name;
	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defense;
	
	// セッターメソッド
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	// Randomクラスのインスタンス作成
	private static Random rand = new Random();
	
	// 名前を引数に取るStatsクラスのコンストラクタ作成
	public Stats(String name) {
		// 直接nameに代入
		this.name = name;
		// 乱数でステータス生成
		setHp(rand.nextInt(1000));
		setMp(rand.nextInt(1000));
		setAttack(rand.nextInt(1000));
		setSpeed(rand.nextInt(1000));
		setDefense(rand.nextInt(1000));
		
	}
	
	// ゲッターメソッド
	public String getName() {
		return this.name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public int getMp() {
		return this.mp;
	}
	
	public int getAttack() {
		return this.attack;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public int getDefense() {
		return this.defense;
	}
}
