package sample;

public class SelfIntroduction {

	public static void main(String[] args) {
	// 氏名
		String name = "岩田 夕輝";
		// 年齢
		int age = 24;
		// 趣味
		String hobby = "K-POP鑑賞";


		/*
		* 自己紹介文を出力する処理
		*/

		System.out.println("私の名前は" + name + "です。");
		System.out.println("年齢は" + age + "歳です。");
		System.out.println("趣味は" + hobby + "です。");
		

		method1();
		
        method2();
	}

	
	
	public static String method1() {
		return "岩田";
	
	}
	
	public static String method2() {
		return "夕輝";
		
	}

}
