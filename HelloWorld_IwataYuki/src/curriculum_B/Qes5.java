package curriculum_B;

public class Qes5 {
	
	// 問１ "Hello, World!"表示のためのメソッド(引数なし・戻り値なし)のメソッド
	private static void helloWorld() {
		System.out.println("Hello, World!");
	}
	
	// 問２ doubleValue メソッド→2倍で表示
	public static int doubleValue(int num) {
    	return num * 2;
	}
	
	// 問３ 偶数か否かを判定するメソッド
	public static boolean isEven(int num) {
		return num % 2 == 0; // 割り切れたらtrue, 割り切れなかったらfalse
	}

	public static void main(String[] args) {
		
	/**********************************************************
	 * 問１　次の条件を満たす メソッド helloWorld を作成
	 * 引数なし。戻り値なし。
	 * "Hello, World!" を表示
	 **********************************************************/
		
	//  "Hello, World!"表示のための呼び出し
		helloWorld();
			
	/**********************************************************
	 * 問２　次の条件を満たす メソッド doubleValue を作成
	 * 引数：整数 (int num)　
	 * 戻り値：整数（引数の2倍の値）
	 * 戻り値をもとに実行例「10 を 2 倍すると 20 です。」のように表示
	 **********************************************************/
			
	// 引数：整数、戻り値：その2倍の整数
		int input = 10;// 仮の値として10を入力
		int result = doubleValue(input);
			System.out.println(input + "を2倍すると" + result +"です。");
	 
	/**********************************************************
	 * 問３　次の条件を満たす メソッド isEven を作成
	 * 引数：整数 (int num)　
	 * 戻り値：true（偶数なら）、false（奇数なら）
	 * num1に7,num2に10を設定し
	 * 実行例
	 * 「10 は偶数です。
	 * 　7 は奇数です。」
	 * になるように表示
	 **********************************************************/
	    
		int num1 = 7;
		int num2 = 10;
		
		 if (isEven(num2)) {
			 System.out.println(num2 + " は偶数です。");
	     } else {
	        	System.out.println(num2 + " は奇数です。");
	     }
		 
		 if (isEven(num1)) {
			 System.out.println(num1 + " は偶数です。");
         } else {
            	System.out.println(num1 + " は奇数です。");
         }
		 
		 
	}
}
