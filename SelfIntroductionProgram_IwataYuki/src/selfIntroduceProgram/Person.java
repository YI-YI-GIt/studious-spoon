package selfIntroduceProgram;

class Person{
	// 問１ インスタンスフィールドを定義
	private String name;
	private int age;
	private double height;
	private double weight;
	private int count = 0; // 問１０
	
	// 問２,３ コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight) {// 問４
		  this.name = name;
		  this.age = age;
		  this.height = height;
		  this.weight = weight;
		  count++; // 問１０
		  
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	
	// 問６,７インスタンスメソッド bmi
	public double bmi() {
		double rawBmi = weight / (height * height);
		return Math.floor(rawBmi * 10)/10; // 小数点第２以降切り捨て
	}
	// 問８,９
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age+ "です");
		System.out.println("BMIは" + this.bmi() + "です");
	}
	// 問１０
	public void count() {
		System.out.println("合計" + count + "人です");
	}
}
