package curriculum_B;

public class Main {	

	public static void main(String[] args) {
		
		// 問４ Greetingクラスから呼び出して表示
		Greeting.sayHello();
		
		// 問５ Animalクラス 変数の中身を指定して出力
		Animal lion = new Animal();
		
		// setter 値を設定
        lion.setName("ライオン");
        lion.setLength(2.1);
        lion.setSpeed(80);
		
        lion.display();
	}

}
