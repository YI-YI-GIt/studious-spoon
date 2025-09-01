package Interface_Abstractclass_OOP;

public abstract class Employee implements Billable {
	// フィールドとコンストラクタでの初期化
	protected int id;
	protected String name;
		
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;		
	}
	// 抽象メソッドとして定義
	public abstract int costForDay(int hoursWorked);

}
