package question_1_23;

public class Animal_Main {

	public static void main(String[] args) {
		
		Animal_Info lion = new Animal_Info();
		
		lion.setName("ライオン");
		lion.setlength(2.1);
		lion.setSpeed(80);
		
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");
	}

}
