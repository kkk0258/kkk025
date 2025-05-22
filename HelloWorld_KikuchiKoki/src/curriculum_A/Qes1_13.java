package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// ①ローカル変数を宣言のみ
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		char c;
		String str;
		boolean bool;
		
		// ②ローカル変数を初期値で初期化
		b = 0;
		s = 0;
		i = 0;
		l = 0L;
		f = 0.0f;
		d = 0.0d;
		c = '\u0000';
		str = null;
		bool = false;
		
		// ③指定された値を代入
		b = 10;
		s = 100;
		i = 1000;
		l = 10000;
		f = 9.5f;
		d = 10.5;
		c = 'a';
		str = "ハロー";
		bool = true;
		
		
		// ④指定された値をコンソール出力
		System.out.println(l + i + s + b);
		System.out.println(b*2);
		System.out.println(c + str + bool);
		// 演算結果を型変換
		int sum = (int) (l + i + s + b + f + d);
		System.out.println(sum);
		System.out.println(l*i*s*b);
		System.out.println(d/s);
		System.out.println(b-s);
		
		// ⑤int型で変数num宣言後にコンソール出力
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
		
		// ⑥指定された情報をローカル変数に代入してコンソール出力
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String food = "寿司";
		System.out.println("初めまして" + name +"です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		
		// ⑦BMIをコンソール出力
		double bmiHeight = height / 100;
		double bmi = weight / (bmiHeight * bmiHeight);
		double bmiCut = (Math.floor(bmi * 10)) / 10;
		System.out.println("BMIは" + bmiCut + "です");
		
		// ⑧変数に再代入してコンソールに出力
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		System.out.println("初めまして" + name +"です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		bmiHeight = height / 100;
		bmi = weight / (bmiHeight * bmiHeight);
		bmiCut = (Math.floor(bmi * 10)) / 10;
		System.out.println("BMIは" + bmiCut + "です");
		
		// ⑨自己代入してコンソール出力
		age += age;
		height += height;
		weight += weight;
		System.out.println("初めまして" + name +"です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		bmiHeight = height / 100;
		bmi = weight / (bmiHeight * bmiHeight);
		bmiCut = (Math.ceil(bmi * 100)) / 100;
		System.out.println("BMIは" + bmiCut + "です");
		
		// ⑩ ⑧の変数ageが25以上ならtrueを出力
		System.out.println((age / 2) >= 25);
		
		// ⑪ ⑧の変数を文字列型に変換し繋げてコンソール出力
		String strAge = String.valueOf(age / 2);
		String strHeight = String.valueOf(height / 2);
		String strWeight = String.valueOf(weight / 2);
		System.out.println(strAge + strHeight + strWeight);
		
		// ⑫　⑪の変数を整数型に変換してコンソール出力
		int intAge = Integer.parseInt(strAge);
		double doubleHeight = Double.parseDouble(strHeight);
		int intHeight = (int)doubleHeight;
		System.out.println(intAge);
		System.out.println(intHeight);
		
		// ⑬ ⑫で変換したintAgeが25以上もしくはintHeightが160以上であればtrueを出力
		System.out.println(intAge >= 25 || intHeight >= 160);

	}

}
